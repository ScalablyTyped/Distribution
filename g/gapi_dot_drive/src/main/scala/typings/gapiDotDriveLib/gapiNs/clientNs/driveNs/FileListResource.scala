package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileListResource extends js.Object {
  var etag: java.lang.String
  var incompleteSearch: scala.Boolean
  var items: js.Array[FileResource]
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#fileList`
  var nextLink: java.lang.String
  var nextPageToken: java.lang.String
  var selfLink: java.lang.String
}

object FileListResource {
  @scala.inline
  def apply(
    etag: java.lang.String,
    incompleteSearch: scala.Boolean,
    items: js.Array[FileResource],
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#fileList`,
    nextLink: java.lang.String,
    nextPageToken: java.lang.String,
    selfLink: java.lang.String
  ): FileListResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("incompleteSearch")(incompleteSearch)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("nextLink")(nextLink)
    __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[FileListResource]
  }
}

