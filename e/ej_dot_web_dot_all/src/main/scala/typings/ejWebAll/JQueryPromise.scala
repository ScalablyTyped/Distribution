package typings.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryPromise[T] extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
}
object JQueryPromise {
  
  inline def apply[T](): JQueryPromise[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPromise[T]]
  }
  
  extension [Self <: JQueryPromise[?], T](x: Self & JQueryPromise[T]) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
