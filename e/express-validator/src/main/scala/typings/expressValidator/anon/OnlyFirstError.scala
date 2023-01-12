package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlyFirstError extends StObject {
  
  var onlyFirstError: js.UndefOr[Boolean] = js.undefined
}
object OnlyFirstError {
  
  inline def apply(): OnlyFirstError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFirstError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlyFirstError] (val x: Self) extends AnyVal {
    
    inline def setOnlyFirstError(value: Boolean): Self = StObject.set(x, "onlyFirstError", value.asInstanceOf[js.Any])
    
    inline def setOnlyFirstErrorUndefined: Self = StObject.set(x, "onlyFirstError", js.undefined)
  }
}
