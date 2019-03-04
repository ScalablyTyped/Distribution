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
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[WriteResult]
  }
}

