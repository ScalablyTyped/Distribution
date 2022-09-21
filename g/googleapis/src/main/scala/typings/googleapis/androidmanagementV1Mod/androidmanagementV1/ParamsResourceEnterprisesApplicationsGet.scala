package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesApplicationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The preferred language for localized application info, as a BCP47 tag (e.g. "en-US", "de"). If not specified the default language of the application will be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the application in the form enterprises/{enterpriseId\}/applications/{package_name\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesApplicationsGet {
  
  inline def apply(): ParamsResourceEnterprisesApplicationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesApplicationsGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesApplicationsGet](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
