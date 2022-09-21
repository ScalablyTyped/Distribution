package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOnboardingListcategories
  extends StObject
     with StandardParameters {
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Default is en-US if unset.
    */
  var locale: js.UndefOr[String] = js.undefined
}
object ParamsResourceOnboardingListcategories {
  
  inline def apply(): ParamsResourceOnboardingListcategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOnboardingListcategories]
  }
  
  extension [Self <: ParamsResourceOnboardingListcategories](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
