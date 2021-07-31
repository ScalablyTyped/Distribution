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
  
  @scala.inline
  def apply(): EmulatedFormFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmulatedFormFactor]
  }
  
  @scala.inline
  implicit class EmulatedFormFactorMutableBuilder[Self <: EmulatedFormFactor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulatedFormFactorUndefined: Self = StObject.set(x, "emulatedFormFactor", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOnlyCategories(value: js.Any): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCategoriesUndefined: Self = StObject.set(x, "onlyCategories", js.undefined)
  }
}
