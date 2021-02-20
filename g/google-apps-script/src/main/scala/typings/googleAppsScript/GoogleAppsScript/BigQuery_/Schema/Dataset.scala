package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends StObject {
  
  var access: js.UndefOr[js.Array[DatasetAccess]] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var datasetReference: js.UndefOr[DatasetReference] = js.native
  
  var defaultPartitionExpirationMs: js.UndefOr[String] = js.native
  
  var defaultTableExpirationMs: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[js.Object] = js.native
  
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
}
object Dataset {
  
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  
  @scala.inline
  implicit class DatasetMutableBuilder[Self <: Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: js.Array[DatasetAccess]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setAccessVarargs(value: DatasetAccess*): Self = StObject.set(x, "access", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDatasetReference(value: DatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    @scala.inline
    def setDefaultPartitionExpirationMs(value: String): Self = StObject.set(x, "defaultPartitionExpirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPartitionExpirationMsUndefined: Self = StObject.set(x, "defaultPartitionExpirationMs", js.undefined)
    
    @scala.inline
    def setDefaultTableExpirationMs(value: String): Self = StObject.set(x, "defaultTableExpirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTableExpirationMsUndefined: Self = StObject.set(x, "defaultTableExpirationMs", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
