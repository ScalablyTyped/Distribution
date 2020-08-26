package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.driveNumbersignfileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileListResource extends js.Object {
  var etag: String = js.native
  var incompleteSearch: Boolean = js.native
  var items: js.Array[FileResource] = js.native
  var kind: driveNumbersignfileList = js.native
  var nextLink: String = js.native
  var nextPageToken: String = js.native
  var selfLink: String = js.native
}

object FileListResource {
  @scala.inline
  def apply(
    etag: String,
    incompleteSearch: Boolean,
    items: js.Array[FileResource],
    kind: driveNumbersignfileList,
    nextLink: String,
    nextPageToken: String,
    selfLink: String
  ): FileListResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], incompleteSearch = incompleteSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileListResource]
  }
  @scala.inline
  implicit class FileListResourceOps[Self <: FileListResource] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncompleteSearch(value: Boolean): Self = this.set("incompleteSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: FileResource*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[FileResource]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: driveNumbersignfileList): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
  }
  
}

