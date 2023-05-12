package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketKey extends StObject {
  
  var bucketKey: String
  
  var contentType: String
  
  var location: String
  
  var objectId: String
  
  var objectKey: String
  
  var size: Double
}
object BucketKey {
  
  inline def apply(
    bucketKey: String,
    contentType: String,
    location: String,
    objectId: String,
    objectKey: String,
    size: Double
  ): BucketKey = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketKey] (val x: Self) extends AnyVal {
    
    inline def setBucketKey(value: String): Self = StObject.set(x, "bucketKey", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
