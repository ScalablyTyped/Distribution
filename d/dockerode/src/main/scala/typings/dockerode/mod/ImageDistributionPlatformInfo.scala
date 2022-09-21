package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDistributionPlatformInfo extends StObject {
  
  var architecture: String
  
  var os: String
  
  @JSName("os.features")
  var osDotfeatures: js.Array[String]
  
  @JSName("os.version")
  var osDotversion: String
  
  var variant: String
}
object ImageDistributionPlatformInfo {
  
  inline def apply(
    architecture: String,
    os: String,
    osDotfeatures: js.Array[String],
    osDotversion: String,
    variant: String
  ): ImageDistributionPlatformInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.updateDynamic("os.features")(osDotfeatures.asInstanceOf[js.Any])
    __obj.updateDynamic("os.version")(osDotversion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDistributionPlatformInfo]
  }
  
  extension [Self <: ImageDistributionPlatformInfo](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsDotfeatures(value: js.Array[String]): Self = StObject.set(x, "os.features", value.asInstanceOf[js.Any])
    
    inline def setOsDotfeaturesVarargs(value: String*): Self = StObject.set(x, "os.features", js.Array(value*))
    
    inline def setOsDotversion(value: String): Self = StObject.set(x, "os.version", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
