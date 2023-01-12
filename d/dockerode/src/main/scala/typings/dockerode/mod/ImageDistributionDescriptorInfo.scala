package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDistributionDescriptorInfo extends StObject {
  
  var digest: String
  
  var mediaType: String
  
  var size: Double
}
object ImageDistributionDescriptorInfo {
  
  inline def apply(digest: String, mediaType: String, size: Double): ImageDistributionDescriptorInfo = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDistributionDescriptorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDistributionDescriptorInfo] (val x: Self) extends AnyVal {
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
