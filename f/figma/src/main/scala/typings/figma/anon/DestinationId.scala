package typings.figma.anon

import typings.figma.figmaStrings.NODE
import typings.figma.mod.global.Action
import typings.figma.mod.global.Navigation
import typings.figma.mod.global.Transition
import typings.figma.mod.global.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationId extends Action {
  val destinationId: String | Null
  val navigation: Navigation
  // Only present if navigation == "OVERLAY" and the destination uses
  // overlay position type "RELATIVE"
  val overlayRelativePosition: js.UndefOr[Vector] = js.undefined
  val preserveScrollPosition: Boolean
  val transition: Transition | Null
  val `type`: NODE
}

object DestinationId {
  @scala.inline
  def apply(
    navigation: Navigation,
    preserveScrollPosition: Boolean,
    `type`: NODE,
    destinationId: String = null,
    overlayRelativePosition: Vector = null,
    transition: Transition = null
  ): DestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overlayRelativePosition != null) __obj.updateDynamic("overlayRelativePosition")(overlayRelativePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationId]
  }
}

