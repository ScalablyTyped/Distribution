package typings.googleDriveRealtimeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIds extends js.Object {
  // string containing one or more file ids separated by spaces.
  var fileIds: String
}

object FileIds {
  @scala.inline
  def apply(fileIds: String): FileIds = {
    val __obj = js.Dynamic.literal(fileIds = fileIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIds]
  }
}

