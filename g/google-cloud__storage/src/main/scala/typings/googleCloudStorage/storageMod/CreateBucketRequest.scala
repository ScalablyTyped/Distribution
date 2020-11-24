package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketRequest extends js.Object {
  
  var archive: js.UndefOr[Boolean] = js.native
  
  var coldline: js.UndefOr[Boolean] = js.native
  
  var cors: js.UndefOr[js.Array[Cors]] = js.native
  
  var dra: js.UndefOr[Boolean] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var multiRegional: js.UndefOr[Boolean] = js.native
  
  var nearline: js.UndefOr[Boolean] = js.native
  
  var regional: js.UndefOr[Boolean] = js.native
  
  var requesterPays: js.UndefOr[Boolean] = js.native
  
  var retentionPolicy: js.UndefOr[js.Object] = js.native
  
  var standard: js.UndefOr[Boolean] = js.native
  
  var storageClass: js.UndefOr[String] = js.native
  
  var userProject: js.UndefOr[String] = js.native
  
  var versioning: js.UndefOr[Versioning] = js.native
}
object CreateBucketRequest {
  
  @scala.inline
  def apply(): CreateBucketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketRequest]
  }
  
  @scala.inline
  implicit class CreateBucketRequestOps[Self <: CreateBucketRequest] (val x: Self) extends AnyVal {
    
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
    def setArchive(value: Boolean): Self = this.set("archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchive: Self = this.set("archive", js.undefined)
    
    @scala.inline
    def setColdline(value: Boolean): Self = this.set("coldline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColdline: Self = this.set("coldline", js.undefined)
    
    @scala.inline
    def setCorsVarargs(value: Cors*): Self = this.set("cors", js.Array(value :_*))
    
    @scala.inline
    def setCors(value: js.Array[Cors]): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setDra(value: Boolean): Self = this.set("dra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDra: Self = this.set("dra", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMultiRegional(value: Boolean): Self = this.set("multiRegional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiRegional: Self = this.set("multiRegional", js.undefined)
    
    @scala.inline
    def setNearline(value: Boolean): Self = this.set("nearline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearline: Self = this.set("nearline", js.undefined)
    
    @scala.inline
    def setRegional(value: Boolean): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRequesterPays(value: Boolean): Self = this.set("requesterPays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterPays: Self = this.set("requesterPays", js.undefined)
    
    @scala.inline
    def setRetentionPolicy(value: js.Object): Self = this.set("retentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPolicy: Self = this.set("retentionPolicy", js.undefined)
    
    @scala.inline
    def setStandard(value: Boolean): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
    
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
    
    @scala.inline
    def setVersioning(value: Versioning): Self = this.set("versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
  }
}
