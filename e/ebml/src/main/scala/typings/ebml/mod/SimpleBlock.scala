package typings.ebml.mod

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
    name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    payload: Buffer,
    start: Double,
    tag: Double,
    tagStr: String,
    track: Double,
    `type`: b,
    value: Double
  ): SimpleBlock = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], discarable = discarable.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], keyframe = keyframe.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBlock]
  }
}

