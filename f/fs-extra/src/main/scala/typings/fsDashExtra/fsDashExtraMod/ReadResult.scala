package typings.fsDashExtra.fsDashExtraMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadResult extends js.Object {
  var buffer: Buffer
  var bytesRead: Double
}

object ReadResult {
  @scala.inline
  def apply(buffer: Buffer, bytesRead: Double): ReadResult = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[ReadResult]
  }
}

