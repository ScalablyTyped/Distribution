package typings.figma.anon

import typings.figma.figmaStrings.NODE
import typings.figma.mod.global.Action
import typings.figma.mod.global.Navigation
import typings.figma.mod.global.Transition
import typings.figma.mod.global.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationId extends Action {
  val destinationId: String | Null = js.native
  val navigation: Navigation = js.native
  // Only present if navigation == "OVERLAY" and the destination uses
  // overlay position type "RELATIVE"
  val overlayRelativePosition: js.UndefOr[Vector] = js.native
  val preserveScrollPosition: Boolean = js.native
  val transition: Transition | Null = js.native
  val `type`: NODE = js.native
}

object DestinationId {
  @scala.inline
  def apply(navigation: Navigation, preserveScrollPosition: Boolean, `type`: NODE): DestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationId]
  }
  @scala.inline
  implicit class DestinationIdOps[Self <: DestinationId] (val x: Self) extends AnyVal {
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
    def setNavigation(value: Navigation): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveScrollPosition(value: Boolean): Self = this.set("preserveScrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NODE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationId(value: String): Self = this.set("destinationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationIdNull: Self = this.set("destinationId", null)
    @scala.inline
    def setOverlayRelativePosition(value: Vector): Self = this.set("overlayRelativePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayRelativePosition: Self = this.set("overlayRelativePosition", js.undefined)
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionNull: Self = this.set("transition", null)
  }
  
}

