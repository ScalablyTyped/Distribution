package typings.fsDashExtra.fsDashExtraMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  var buffer: Buffer
  var bytesWritten: Double
}

object WriteResult {
  @scala.inline
  def apply(buffer: Buffer, bytesWritten: Double): WriteResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[WriteResult]
  }
}

