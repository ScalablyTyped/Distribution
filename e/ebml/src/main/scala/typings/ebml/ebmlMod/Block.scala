package typings.ebml.ebmlMod

import typings.ebml.ebmlStrings.b
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends Tag[b] {
  /** the coded information in the element */
  var payload: Buffer
  /** unsigned integer indicating the payload's track */
  var track: Double
  /** the block's Timecode value */
  @JSName("value")
  var value_Block: Double
}

object Block {
  @scala.inline
  def apply(
    data: Buffer,
    dataSize: Double,
    end: Double,
    name: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    payload: Buffer,
    start: Double,
    tag: Double,
    tagStr: String,
    track: Double,
    `type`: b,
    value: Double
  ): Block = {
    val __obj = js.Dynamic.literal(data = data, dataSize = dataSize, end = end, name = name, payload = payload, start = start, tag = tag, tagStr = tagStr, track = track, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Block]
  }
}

