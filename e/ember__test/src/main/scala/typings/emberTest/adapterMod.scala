package typings.emberTest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @JSImport("@ember/test/adapter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Adapter {
    
    /**
      * This callback will be called whenever an async operation has completed.
      */
    /* CompleteClass */
    override def asyncEnd(): Any = js.native
    
    /**
      * This callback will be called whenever an async operation is about to start.
      */
    /* CompleteClass */
    override def asyncStart(): Any = js.native
    
    /**
      * Override this method with your testing framework's false assertion.
      * This function is called whenever an exception occurs causing the testing
      * promise to fail.
      */
    /* CompleteClass */
    override def exception(error: String): Any = js.native
  }
  
  trait Adapter extends StObject {
    
    /**
      * This callback will be called whenever an async operation has completed.
      */
    def asyncEnd(): Any
    
    /**
      * This callback will be called whenever an async operation is about to start.
      */
    def asyncStart(): Any
    
    /**
      * Override this method with your testing framework's false assertion.
      * This function is called whenever an exception occurs causing the testing
      * promise to fail.
      */
    def exception(error: String): Any
  }
  object Adapter {
    
    inline def apply(asyncEnd: () => Any, asyncStart: () => Any, exception: String => Any): Adapter = {
      val __obj = js.Dynamic.literal(asyncEnd = js.Any.fromFunction0(asyncEnd), asyncStart = js.Any.fromFunction0(asyncStart), exception = js.Any.fromFunction1(exception))
      __obj.asInstanceOf[Adapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
      
      inline def setAsyncEnd(value: () => Any): Self = StObject.set(x, "asyncEnd", js.Any.fromFunction0(value))
      
      inline def setAsyncStart(value: () => Any): Self = StObject.set(x, "asyncStart", js.Any.fromFunction0(value))
      
      inline def setException(value: String => Any): Self = StObject.set(x, "exception", js.Any.fromFunction1(value))
    }
  }
}
