package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.anon.TotalBytesExpectedToWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  var data: TotalBytesExpectedToWrite
  var uuid: String
}

object ProgressEvent {
  @scala.inline
  def apply(data: TotalBytesExpectedToWrite, uuid: String): ProgressEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

