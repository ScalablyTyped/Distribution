package typings.ebml.mod

import typings.ebml.ebmlStrings.b
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends Tag[b] {
  /** the coded information in the element */
  var payload: Buffer = js.native
  /** unsigned integer indicating the payload's track */
  var track: Double = js.native
  /** the block's Timecode value */
  @JSName("value")
  var value_Block: Double = js.native
}

object Block {
  @scala.inline
  def apply(
    data: Buffer,
    dataSize: Double,
    end: Double,
    name: String,
    payload: Buffer,
    start: Double,
    tag: Double,
    tagStr: String,
    track: Double,
    `type`: b,
    value: Double
  ): Block = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPayload(value: Buffer): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: Double): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

