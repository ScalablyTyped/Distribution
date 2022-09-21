package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStorageSourceManifest extends StObject {
  
  /**
    * Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google Cloud Storage object containing the source manifest. This object must be a JSON file.
    */
  var `object`: js.UndefOr[String | Null] = js.undefined
}
object SchemaStorageSourceManifest {
  
  inline def apply(): SchemaStorageSourceManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStorageSourceManifest]
  }
  
  extension [Self <: SchemaStorageSourceManifest](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectNull: Self = StObject.set(x, "object", null)
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
