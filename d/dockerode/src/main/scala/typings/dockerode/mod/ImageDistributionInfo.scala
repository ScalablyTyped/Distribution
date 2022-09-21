package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDistributionInfo extends StObject {
  
  var Descriptor: ImageDistributionDescriptorInfo
  
  var Platforms: js.Array[ImageDistributionPlatformInfo]
}
object ImageDistributionInfo {
  
  inline def apply(Descriptor: ImageDistributionDescriptorInfo, Platforms: js.Array[ImageDistributionPlatformInfo]): ImageDistributionInfo = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], Platforms = Platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDistributionInfo]
  }
  
  extension [Self <: ImageDistributionInfo](x: Self) {
    
    inline def setDescriptor(value: ImageDistributionDescriptorInfo): Self = StObject.set(x, "Descriptor", value.asInstanceOf[js.Any])
    
    inline def setPlatforms(value: js.Array[ImageDistributionPlatformInfo]): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: ImageDistributionPlatformInfo*): Self = StObject.set(x, "Platforms", js.Array(value*))
  }
}
