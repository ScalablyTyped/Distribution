package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefaultPool extends StObject {
  
  /**
    * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
    */
  var artifactStorage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaDefaultPool {
  
  inline def apply(): SchemaDefaultPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultPool]
  }
  
  extension [Self <: SchemaDefaultPool](x: Self) {
    
    inline def setArtifactStorage(value: String): Self = StObject.set(x, "artifactStorage", value.asInstanceOf[js.Any])
    
    inline def setArtifactStorageNull: Self = StObject.set(x, "artifactStorage", null)
    
    inline def setArtifactStorageUndefined: Self = StObject.set(x, "artifactStorage", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
