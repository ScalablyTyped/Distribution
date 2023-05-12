package typings.firebase.compatMod.firebase.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The full set of object metadata, including read-only properties.
  */
trait FullMetadata
  extends StObject
     with UploadMetadata {
  
  /**
    * The bucket this object is contained in.
    */
  var bucket: String
  
  /**
    * The full path of this object.
    */
  var fullPath: String
  
  /**
    * The object's generation.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var generation: String
  
  /**
    * The object's metageneration.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var metageneration: String
  
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: String
  
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
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
