package typings.forgeApis.mod

import typings.forgeApis.anon.BucketKey
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadedResource extends StObject {
  
  var completed: BucketKey
  
  var data: Buffer
  
  var eTags: js.Array[String]
  
  var objectKey: String
  
  var progress: Double
  
  var uploadKey: String
}
object UploadedResource {
  
  inline def apply(
    completed: BucketKey,
    data: Buffer,
    eTags: js.Array[String],
    objectKey: String,
    progress: Double,
    uploadKey: String
  ): UploadedResource = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eTags = eTags.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], uploadKey = uploadKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadedResource] (val x: Self) extends AnyVal {
    
    inline def setCompleted(value: BucketKey): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setETags(value: js.Array[String]): Self = StObject.set(x, "eTags", value.asInstanceOf[js.Any])
    
    inline def setETagsVarargs(value: String*): Self = StObject.set(x, "eTags", js.Array(value*))
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setUploadKey(value: String): Self = StObject.set(x, "uploadKey", value.asInstanceOf[js.Any])
  }
}
