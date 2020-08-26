package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ToolTipFreePosition class.
  */
@js.native
trait ASPxClientToolTipFreePosition extends ASPxClientToolTipPosition {
  /**
    * Gets an object containing settings that define how a tooltip should be docked.
    */
  var dockPosition: String = js.native
  /**
    * Gets the horizontal offset of a tooltip.
    */
  var offsetX: Double = js.native
  /**
    * Gets the vertical offset of a tooltip.
    */
  var offsetY: Double = js.native
  /**
    * Gets the ID of a pane.
    */
  var paneID: Double = js.native
}

object ASPxClientToolTipFreePosition {
  @scala.inline
  def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientToolTipFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paneID = paneID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipFreePosition]
  }
  @scala.inline
  implicit class ASPxClientToolTipFreePositionOps[Self <: ASPxClientToolTipFreePosition] (val x: Self) extends AnyVal {
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
    def setDockPosition(value: String): Self = this.set("dockPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneID(value: Double): Self = this.set("paneID", value.asInstanceOf[js.Any])
  }
  
}

