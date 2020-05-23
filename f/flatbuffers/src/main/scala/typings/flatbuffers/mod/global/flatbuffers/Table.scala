package typings.flatbuffers.mod.global.flatbuffers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var bb: ByteBuffer | Null
  var bb_pos: Double
}

object Table {
  @scala.inline
  def apply(bb_pos: Double, bb: ByteBuffer = null): Table = {
    val __obj = js.Dynamic.literal(bb_pos = bb_pos.asInstanceOf[js.Any], bb = bb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

