package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMobilePhoneOptions extends StObject {
  
  var strictMode: js.UndefOr[Boolean] = js.undefined
}
object IsMobilePhoneOptions {
  
  inline def apply(): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMobilePhoneOptions] (val x: Self) extends AnyVal {
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
