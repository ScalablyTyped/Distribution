package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSource extends StObject {
  
  /**
    * If provided, get the source from this location in a Cloud Source Repository.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.undefined
  
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.undefined
  
  /**
    * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
    */
  var storageSourceManifest: js.UndefOr[SchemaStorageSourceManifest] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setRepoSource(value: SchemaRepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    inline def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    inline def setStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifest(value: SchemaStorageSourceManifest): Self = StObject.set(x, "storageSourceManifest", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifestUndefined: Self = StObject.set(x, "storageSourceManifest", js.undefined)
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
