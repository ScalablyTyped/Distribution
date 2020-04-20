package typings.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalBytesExpectedToWrite extends js.Object {
  var totalBytesExpectedToWrite: Double
  var totalBytesWritten: Double
}

object AnonTotalBytesExpectedToWrite {
  @scala.inline
  def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): AnonTotalBytesExpectedToWrite = {
    val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalBytesExpectedToWrite]
  }
}

