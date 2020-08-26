package typings.expoFileSystem.fileSystemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadProgressData extends js.Object {
  var totalBytesExpectedToWrite: Double = js.native
  var totalBytesWritten: Double = js.native
}

object DownloadProgressData {
  @scala.inline
  def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): DownloadProgressData = {
    val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressData]
  }
  @scala.inline
  implicit class DownloadProgressDataOps[Self <: DownloadProgressData] (val x: Self) extends AnyVal {
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
    def setTotalBytesExpectedToWrite(value: Double): Self = this.set("totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesWritten(value: Double): Self = this.set("totalBytesWritten", value.asInstanceOf[js.Any])
  }
  
}

