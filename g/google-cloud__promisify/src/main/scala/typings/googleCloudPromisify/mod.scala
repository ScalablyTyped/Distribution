package typings.googleCloudPromisify

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/promisify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callbackify(originalMethod: CallbackMethod): CallbackMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(originalMethod.asInstanceOf[js.Any]).asInstanceOf[CallbackMethod]
  
  inline def callbackifyAll(Class: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackifyAll")(Class.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def callbackifyAll(Class: js.Function, options: CallbackifyAllOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callbackifyAll")(Class.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promisify(originalMethod: PromiseMethod): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(originalMethod.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def promisify(originalMethod: PromiseMethod, options: PromisifyOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(originalMethod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def promisifyAll(Class: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyAll")(Class.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def promisifyAll(Class: js.Function, options: PromisifyAllOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyAll")(Class.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait CallbackMethod
    extends js.Function {
    
    var callbackified_ : js.UndefOr[Boolean] = js.native
  }
  
  trait CallbackifyAllOptions extends StObject {
    
    /**
      * Array of methods to ignore when callbackifying.
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CallbackifyAllOptions {
    
    inline def apply(): CallbackifyAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackifyAllOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackifyAllOptions] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  @js.native
  trait PromiseMethod
    extends js.Function {
    
    var promisified_ : js.UndefOr[Boolean] = js.native
  }
  
  trait PromisifyAllOptions
    extends StObject
       with PromisifyOptions {
    
    /**
      * Array of methods to ignore when promisifying.
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PromisifyAllOptions {
    
    inline def apply(): PromisifyAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyAllOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisifyAllOptions] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  trait PromisifyOptions extends StObject {
    
    /**
      * Resolve the promise with single arg instead of an array.
      */
    var singular: js.UndefOr[Boolean] = js.undefined
  }
  object PromisifyOptions {
    
    inline def apply(): PromisifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
      
      inline def setSingular(value: Boolean): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
    }
  }
  
  trait WithPromise extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  }
  object WithPromise {
    
    inline def apply(): WithPromise = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithPromise]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithPromise] (val x: Self) extends AnyVal {
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
}
