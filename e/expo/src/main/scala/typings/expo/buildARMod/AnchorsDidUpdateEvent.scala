package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorsDidUpdateEvent extends js.Object {
  var anchors: js.Array[Anchor]
  var eventType: AnchorEventType
}

object AnchorsDidUpdateEvent {
  @scala.inline
  def apply(anchors: js.Array[Anchor], eventType: AnchorEventType): AnchorsDidUpdateEvent = {
    val __obj = js.Dynamic.literal(anchors = anchors, eventType = eventType)
  
    __obj.asInstanceOf[AnchorsDidUpdateEvent]
  }
}

