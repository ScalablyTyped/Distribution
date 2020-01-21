package typings.expo.linkingTypesMod

import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventType extends js.Object {
  var nativeEvent: MessageEvent
  var url: String
}

object EventType {
  @scala.inline
  def apply(nativeEvent: MessageEvent, url: String): EventType = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventType]
  }
}

