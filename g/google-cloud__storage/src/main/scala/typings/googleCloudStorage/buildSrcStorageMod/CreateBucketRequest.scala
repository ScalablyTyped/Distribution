package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketRequest extends StObject {
  
  var archive: js.UndefOr[Boolean] = js.undefined
  
  var autoclass: js.UndefOr[AutoclassConfig] = js.undefined
  
  var coldline: js.UndefOr[Boolean] = js.undefined
  
  var cors: js.UndefOr[js.Array[Cors]] = js.undefined
  
  var customPlacementConfig: js.UndefOr[CustomPlacementConfig] = js.undefined
  
  var dra: js.UndefOr[Boolean] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var multiRegional: js.UndefOr[Boolean] = js.undefined
  
  var nearline: js.UndefOr[Boolean] = js.undefined
  
  var regional: js.UndefOr[Boolean] = js.undefined
  
  var requesterPays: js.UndefOr[Boolean] = js.undefined
  
  var retentionPolicy: js.UndefOr[js.Object] = js.undefined
  
  var rpo: js.UndefOr[String] = js.undefined
  
  var standard: js.UndefOr[Boolean] = js.undefined
  
  var storageClass: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
  
  var versioning: js.UndefOr[Versioning] = js.undefined
}
object CreateBucketRequest {
  
  inline def apply(): CreateBucketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBucketRequest] (val x: Self) extends AnyVal {
    
    inline def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    inline def setArchiveUndefined: Self = StObject.set(x, "archive", js.undefined)
    
    inline def setAutoclass(value: AutoclassConfig): Self = StObject.set(x, "autoclass", value.asInstanceOf[js.Any])
    
    inline def setAutoclassUndefined: Self = StObject.set(x, "autoclass", js.undefined)
    
    inline def setColdline(value: Boolean): Self = StObject.set(x, "coldline", value.asInstanceOf[js.Any])
    
    inline def setColdlineUndefined: Self = StObject.set(x, "coldline", js.undefined)
    
    inline def setCors(value: js.Array[Cors]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setCorsVarargs(value: Cors*): Self = StObject.set(x, "cors", js.Array(value*))
    
    inline def setCustomPlacementConfig(value: CustomPlacementConfig): Self = StObject.set(x, "customPlacementConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomPlacementConfigUndefined: Self = StObject.set(x, "customPlacementConfig", js.undefined)
    
    inline def setDra(value: Boolean): Self = StObject.set(x, "dra", value.asInstanceOf[js.Any])
    
    inline def setDraUndefined: Self = StObject.set(x, "dra", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMultiRegional(value: Boolean): Self = StObject.set(x, "multiRegional", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionalUndefined: Self = StObject.set(x, "multiRegional", js.undefined)
    
    inline def setNearline(value: Boolean): Self = StObject.set(x, "nearline", value.asInstanceOf[js.Any])
    
    inline def setNearlineUndefined: Self = StObject.set(x, "nearline", js.undefined)
    
    inline def setRegional(value: Boolean): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
    
    inline def setRetentionPolicy(value: js.Object): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    inline def setRpo(value: String): Self = StObject.set(x, "rpo", value.asInstanceOf[js.Any])
    
    inline def setRpoUndefined: Self = StObject.set(x, "rpo", js.undefined)
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    
    inline def setVersioning(value: Versioning): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
  }
}
