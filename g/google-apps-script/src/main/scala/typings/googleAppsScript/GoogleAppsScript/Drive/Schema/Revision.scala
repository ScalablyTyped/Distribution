package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision extends js.Object {
  
  var downloadUrl: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var exportLinks: js.UndefOr[js.Object] = js.native
  
  var fileSize: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifyingUser: js.UndefOr[User] = js.native
  
  var lastModifyingUserName: js.UndefOr[String] = js.native
  
  var md5Checksum: js.UndefOr[String] = js.native
  
  var mimeType: js.UndefOr[String] = js.native
  
  var modifiedDate: js.UndefOr[String] = js.native
  
  var originalFilename: js.UndefOr[String] = js.native
  
  var pinned: js.UndefOr[Boolean] = js.native
  
  var publishAuto: js.UndefOr[Boolean] = js.native
  
  var published: js.UndefOr[Boolean] = js.native
  
  var publishedLink: js.UndefOr[String] = js.native
  
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
}
object Revision {
  
  @scala.inline
  def apply(): Revision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit class RevisionOps[Self <: Revision] (val x: Self) extends AnyVal {
    
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
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExportLinks(value: js.Object): Self = this.set("exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportLinks: Self = this.set("exportLinks", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: User): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUser: Self = this.set("lastModifyingUser", js.undefined)
    
    @scala.inline
    def setLastModifyingUserName(value: String): Self = this.set("lastModifyingUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUserName: Self = this.set("lastModifyingUserName", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Checksum: Self = this.set("md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFilename: Self = this.set("originalFilename", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setPublishAuto(value: Boolean): Self = this.set("publishAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishAuto: Self = this.set("publishAuto", js.undefined)
    
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    
    @scala.inline
    def setPublishedLink(value: String): Self = this.set("publishedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedLink: Self = this.set("publishedLink", js.undefined)
    
    @scala.inline
    def setPublishedOutsideDomain(value: Boolean): Self = this.set("publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedOutsideDomain: Self = this.set("publishedOutsideDomain", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
