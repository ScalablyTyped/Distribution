package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  var access: js.UndefOr[js.Array[DatasetAccess]] = js.undefined
  
  var creationTime: js.UndefOr[String] = js.undefined
  
  var datasetReference: js.UndefOr[DatasetReference] = js.undefined
  
  var defaultPartitionExpirationMs: js.UndefOr[String] = js.undefined
  
  var defaultTableExpirationMs: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Object] = js.undefined
  
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var selfLink: js.UndefOr[String] = js.undefined
}
object Dataset {
  
  inline def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  
  extension [Self <: Dataset](x: Self) {
    
    inline def setAccess(value: js.Array[DatasetAccess]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAccessVarargs(value: DatasetAccess*): Self = StObject.set(x, "access", js.Array(value :_*))
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDatasetReference(value: DatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    inline def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    inline def setDefaultPartitionExpirationMs(value: String): Self = StObject.set(x, "defaultPartitionExpirationMs", value.asInstanceOf[js.Any])
    
    inline def setDefaultPartitionExpirationMsUndefined: Self = StObject.set(x, "defaultPartitionExpirationMs", js.undefined)
    
    inline def setDefaultTableExpirationMs(value: String): Self = StObject.set(x, "defaultTableExpirationMs", value.asInstanceOf[js.Any])
    
    inline def setDefaultTableExpirationMsUndefined: Self = StObject.set(x, "defaultTableExpirationMs", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
