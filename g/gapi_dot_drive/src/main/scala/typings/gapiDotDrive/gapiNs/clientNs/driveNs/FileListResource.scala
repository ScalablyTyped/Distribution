package typings.gapiDotDrive.gapiNs.clientNs.driveNs

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
    val __obj = js.Dynamic.literal(etag = etag, incompleteSearch = incompleteSearch, items = items, kind = kind, nextLink = nextLink, nextPageToken = nextPageToken, selfLink = selfLink)
  
    __obj.asInstanceOf[FileListResource]
  }
}

