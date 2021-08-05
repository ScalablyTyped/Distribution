package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulatedFormFactor extends StObject {
  
  var emulatedFormFactor: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var onlyCategories: js.UndefOr[js.Any] = js.undefined
}
object EmulatedFormFactor {
  
  inline def apply(): EmulatedFormFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmulatedFormFactor]
  }
  
  extension [Self <: EmulatedFormFactor](x: Self) {
    
    inline def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    inline def setEmulatedFormFactorUndefined: Self = StObject.set(x, "emulatedFormFactor", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOnlyCategories(value: js.Any): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
    
    inline def setOnlyCategoriesUndefined: Self = StObject.set(x, "onlyCategories", js.undefined)
  }
}
