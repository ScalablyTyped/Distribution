package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotalBytesExpectedToWrite extends js.Object {
  var totalBytesExpectedToWrite: Double
  var totalBytesWritten: Double
}

object TotalBytesExpectedToWrite {
  @scala.inline
  def apply(totalBytesExpectedToWrite: Double, totalBytesWritten: Double): TotalBytesExpectedToWrite = {
    val __obj = js.Dynamic.literal(totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalBytesExpectedToWrite]
  }
}

