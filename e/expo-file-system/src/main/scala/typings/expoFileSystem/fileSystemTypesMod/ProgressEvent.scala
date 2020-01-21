package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.AnonTotalBytesExpectedToWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  var data: AnonTotalBytesExpectedToWrite
  var uuid: String
}

object ProgressEvent {
  @scala.inline
  def apply(data: AnonTotalBytesExpectedToWrite, uuid: String): ProgressEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressEvent]
  }
}

