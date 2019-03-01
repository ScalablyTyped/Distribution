package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  var buffer: nodeLib.Buffer
  var bytesWritten: scala.Double
}

object WriteResult {
  @scala.inline
  def apply(buffer: nodeLib.Buffer, bytesWritten: scala.Double): WriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("bytesWritten")(bytesWritten)
    __obj.asInstanceOf[WriteResult]
  }
}

