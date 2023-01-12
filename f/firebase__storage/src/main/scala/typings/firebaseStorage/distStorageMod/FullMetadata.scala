package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullMetadata
  extends StObject
     with UploadMetadata {
  
  /**
    * The bucket this object is contained in.
    */
  var bucket: String
  
  /**
    * Tokens to allow access to the downloatd URL.
    */
  var downloadTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The full path of this object.
    */
  var fullPath: String
  
  /**
    * The object's generation.
    * {@link https://cloud.google.com/storage/docs/metadata#generation-number}
    */
  var generation: String
  
  /**
    * The object's metageneration.
    * {@link https://cloud.google.com/storage/docs/metadata#generation-number}
    */
  var metageneration: String
  
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: String
  
  /**
    * `StorageReference` associated with this upload.
    */
  var ref: js.UndefOr[StorageReference] = js.undefined
  
  /**
    * The size of this object, in bytes.
    */
  var size: Double
  
  /**
    * A date string representing when this object was created.
    */
  var timeCreated: String
  
  /**
    * A date string representing when this object was last updated.
    */
  var updated: String
}
object FullMetadata {
  
  inline def apply(
    bucket: String,
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullMetadata] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setDownloadTokens(value: js.Array[String]): Self = StObject.set(x, "downloadTokens", value.asInstanceOf[js.Any])
    
    inline def setDownloadTokensUndefined: Self = StObject.set(x, "downloadTokens", js.undefined)
    
    inline def setDownloadTokensVarargs(value: String*): Self = StObject.set(x, "downloadTokens", js.Array(value*))
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
