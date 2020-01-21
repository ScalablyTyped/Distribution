package typings.expoFileSystem.fileSystemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgressData extends js.Object {
  var totalBytesExpectedToWrite: Double
  var totalBytesWritten: Double
}

object DownloadProgressData {
  @scala.inline
  def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): DownloadProgressData = {
    val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadProgressData]
  }
}

