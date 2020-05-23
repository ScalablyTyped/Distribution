package typings.fsExtra.mod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritevResult extends js.Object {
  var buffers: js.Array[ArrayBufferView]
  var bytesWritten: Double
}

object WritevResult {
  @scala.inline
  def apply(buffers: js.Array[ArrayBufferView], bytesWritten: Double): WritevResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritevResult]
  }
}

