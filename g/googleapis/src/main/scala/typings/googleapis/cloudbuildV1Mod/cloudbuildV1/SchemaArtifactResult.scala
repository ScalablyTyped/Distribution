package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An artifact that was uploaded during a build. This is a single record in
  * the artifact manifest JSON file.
  */
trait SchemaArtifactResult extends StObject {
  
  /**
    * The file hash of the artifact.
    */
  var fileHash: js.UndefOr[js.Array[SchemaFileHashes]] = js.undefined
  
  /**
    * The path of an artifact in a Google Cloud Storage bucket, with the
    * generation number. For example,
    * `gs://mybucket/path/to/output.jar#generation`.
    */
  var location: js.UndefOr[String] = js.undefined
}
object SchemaArtifactResult {
  
  inline def apply(): SchemaArtifactResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactResult]
  }
  
  extension [Self <: SchemaArtifactResult](x: Self) {
    
    inline def setFileHash(value: js.Array[SchemaFileHashes]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setFileHashVarargs(value: SchemaFileHashes*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
