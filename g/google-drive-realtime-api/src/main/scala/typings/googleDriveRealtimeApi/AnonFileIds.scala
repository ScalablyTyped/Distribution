package typings.googleDriveRealtimeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileIds extends js.Object {
  // string containing one or more file ids separated by spaces.
  var fileIds: String
}

object AnonFileIds {
  @scala.inline
  def apply(fileIds: String): AnonFileIds = {
    val __obj = js.Dynamic.literal(fileIds = fileIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFileIds]
  }
}

