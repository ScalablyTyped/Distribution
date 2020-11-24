package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends js.Object {
  
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
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessVarargs(value: DatasetAccess*): Self = this.set("access", js.Array(value :_*))
    
    @scala.inline
    def setAccess(value: js.Array[DatasetAccess]): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDatasetReference(value: DatasetReference): Self = this.set("datasetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetReference: Self = this.set("datasetReference", js.undefined)
    
    @scala.inline
    def setDefaultPartitionExpirationMs(value: String): Self = this.set("defaultPartitionExpirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPartitionExpirationMs: Self = this.set("defaultPartitionExpirationMs", js.undefined)
    
    @scala.inline
    def setDefaultTableExpirationMs(value: String): Self = this.set("defaultTableExpirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTableExpirationMs: Self = this.set("defaultTableExpirationMs", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Object): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
