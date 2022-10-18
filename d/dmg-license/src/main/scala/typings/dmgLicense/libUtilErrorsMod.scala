package typings.dmgLicense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilErrorsMod {
  
  @JSImport("dmg-license/lib/util/errors", "ErrorBuffer")
  @js.native
  open class ErrorBuffer () extends StObject {
    
    /**
      * Adds the given error(s) (or other objects, which are converted to errors).
      */
    def add(errors: Any*): Unit = js.native
    
    /**
      * Catches errors thrown from the given function, adding them to the array of accumulated errors.
      */
    def catching[T](fun: js.Function0[T]): js.UndefOr[T] = js.native
    
    def catchingAsync[T](fun: js.Function0[js.Promise[T]]): js.Promise[js.UndefOr[T]] = js.native
    /**
      * Catches errors thrown from the given async function or promise, adding them to the array of accumulated errors.
      */
    def catchingAsync[T](fun: js.Promise[T]): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Throws any accumulated errors.
      */
    def check(): Unit = js.native
    
    var errors: js.Array[js.Error] = js.native
    
    val isEmpty: Boolean = js.native
    
    /**
      * Adds the given error, then throws it. If other errors have been added already, throws a `MultiError` instead.
      */
    def `throw`(error: Any): scala.Nothing = js.native
  }
}
