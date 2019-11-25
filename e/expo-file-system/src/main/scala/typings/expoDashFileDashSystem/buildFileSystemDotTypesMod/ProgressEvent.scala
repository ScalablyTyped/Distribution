package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import typings.expoDashFileDashSystem.Anon_TotalBytesExpectedToWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  var data: Anon_TotalBytesExpectedToWrite
  var uuid: String
}

object ProgressEvent {
  @scala.inline
  def apply(data: Anon_TotalBytesExpectedToWrite, uuid: String): ProgressEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressEvent]
  }
}

