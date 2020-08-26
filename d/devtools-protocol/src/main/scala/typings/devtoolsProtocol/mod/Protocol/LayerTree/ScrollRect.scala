package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.devtoolsProtocolStrings.RepaintsOnScroll
import typings.devtoolsProtocol.devtoolsProtocolStrings.TouchEventHandler
import typings.devtoolsProtocol.devtoolsProtocolStrings.WheelEventHandler
import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRect extends js.Object {
  /**
    * Rectangle itself.
    */
  var rect: Rect = js.native
  /**
    * Reason for rectangle to force scrolling on the main thread (ScrollRectType enum)
    */
  var `type`: RepaintsOnScroll | TouchEventHandler | WheelEventHandler = js.native
}

object ScrollRect {
  @scala.inline
  def apply(rect: Rect, `type`: RepaintsOnScroll | TouchEventHandler | WheelEventHandler): ScrollRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRect]
  }
  @scala.inline
  implicit class ScrollRectOps[Self <: ScrollRect] (val x: Self) extends AnyVal {
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
    def setRect(value: Rect): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RepaintsOnScroll | TouchEventHandler | WheelEventHandler): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

