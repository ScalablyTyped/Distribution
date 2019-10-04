package typings.ebml.ebmlMod

import typings.ebml.ebmlStrings.b
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleBlock extends Block {
  /** the value of the element's Discardable flag */
  var discarable: Boolean
  /** set to `true` if the payload starts an I frame */
  var keyframe: Boolean
}

object SimpleBlock {
  @scala.inline
  def apply(
    data: Buffer,
    dataSize: Double,
    discarable: Boolean,
    end: Double,
    keyframe: Boolean,
    name: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    payload: Buffer,
    start: Double,
    tag: Double,
    tagStr: String,
    track: Double,
    `type`: b,
    value: Double
  ): SimpleBlock = {
    val __obj = js.Dynamic.literal(data = data, dataSize = dataSize, discarable = discarable, end = end, keyframe = keyframe, name = name, payload = payload, start = start, tag = tag, tagStr = tagStr, track = track, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SimpleBlock]
  }
}

