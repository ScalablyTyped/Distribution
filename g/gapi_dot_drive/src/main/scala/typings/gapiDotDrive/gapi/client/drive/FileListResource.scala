package typings.gapiDotDrive.gapi.client.drive

import typings.gapiDotDrive.gapiDotDriveStrings.`drive#fileList`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileListResource extends js.Object {
  var etag: String
  var incompleteSearch: Boolean
  var items: js.Array[FileResource]
  var kind: `drive#fileList`
  var nextLink: String
  var nextPageToken: String
  var selfLink: String
}

object FileListResource {
  @scala.inline
  def apply(
    etag: String,
    incompleteSearch: Boolean,
    items: js.Array[FileResource],
    kind: `drive#fileList`,
    nextLink: String,
    nextPageToken: String,
    selfLink: String
  ): FileListResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], incompleteSearch = incompleteSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileListResource]
  }
}

