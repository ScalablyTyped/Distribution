package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadResult extends js.Object {
  var buffer: nodeLib.Buffer
  var bytesRead: scala.Double
}

object ReadResult {
  @scala.inline
  def apply(buffer: nodeLib.Buffer, bytesRead: scala.Double): ReadResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("bytesRead")(bytesRead)
    __obj.asInstanceOf[ReadResult]
  }
}

