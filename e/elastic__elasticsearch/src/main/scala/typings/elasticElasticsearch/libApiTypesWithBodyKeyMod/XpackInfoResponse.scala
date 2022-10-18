package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoResponse extends StObject {
  
  var build: XpackInfoBuildInformation
  
  var features: XpackInfoFeatures
  
  var license: XpackInfoMinimalLicenseInformation
  
  var tagline: String
}
object XpackInfoResponse {
  
  inline def apply(
    build: XpackInfoBuildInformation,
    features: XpackInfoFeatures,
    license: XpackInfoMinimalLicenseInformation,
    tagline: String
  ): XpackInfoResponse = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackInfoResponse]
  }
  
  extension [Self <: XpackInfoResponse](x: Self) {
    
    inline def setBuild(value: XpackInfoBuildInformation): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: XpackInfoFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: XpackInfoMinimalLicenseInformation): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
  }
}
