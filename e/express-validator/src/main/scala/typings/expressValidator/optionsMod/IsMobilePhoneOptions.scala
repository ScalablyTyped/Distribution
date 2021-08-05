package typings.expressValidator.optionsMod

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
  
  extension [Self <: IsMobilePhoneOptions](x: Self) {
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
