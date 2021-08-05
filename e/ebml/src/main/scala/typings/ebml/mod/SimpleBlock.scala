package typings.ebml.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleBlock
  extends StObject
     with Block {
  
  /** the value of the element's Discardable flag */
  var discarable: Boolean
  
  /** set to `true` if the payload starts an I frame */
  var keyframe: Boolean
}
object SimpleBlock {
  
  inline def apply(
    data: Buffer,
    dataSize: Double,
    discarable: Boolean,
    end: Double,
    keyframe: Boolean,
    name: String,
    payload: Buffer,
    start: Double,
    tag: Double,
    tagStr: String,
    track: Double,
    value: Double
  ): SimpleBlock = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], discarable = discarable.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], keyframe = keyframe.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("b")
    __obj.asInstanceOf[SimpleBlock]
  }
  
  extension [Self <: SimpleBlock](x: Self) {
    
    inline def setDiscarable(value: Boolean): Self = StObject.set(x, "discarable", value.asInstanceOf[js.Any])
    
    inline def setKeyframe(value: Boolean): Self = StObject.set(x, "keyframe", value.asInstanceOf[js.Any])
  }
}
