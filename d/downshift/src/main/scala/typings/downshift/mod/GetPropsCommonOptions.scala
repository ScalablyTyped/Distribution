package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropsCommonOptions extends StObject {
  
  var suppressRefError: js.UndefOr[Boolean] = js.undefined
}
object GetPropsCommonOptions {
  
  inline def apply(): GetPropsCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropsCommonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPropsCommonOptions] (val x: Self) extends AnyVal {
    
    inline def setSuppressRefError(value: Boolean): Self = StObject.set(x, "suppressRefError", value.asInstanceOf[js.Any])
    
    inline def setSuppressRefErrorUndefined: Self = StObject.set(x, "suppressRefError", js.undefined)
  }
}
