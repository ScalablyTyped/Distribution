package typings.figma

import typings.figma.figmaStrings.NODE
import typings.figma.mod._Global_.Action
import typings.figma.mod._Global_.Navigation
import typings.figma.mod._Global_.Transition
import typings.figma.mod._Global_.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestinationId extends Action {
  val destinationId: String | Null
  val navigation: Navigation
  // Only present if navigation == "OVERLAY" and the destination uses
  // overlay position type "RELATIVE"
  val overlayRelativePosition: js.UndefOr[Vector] = js.undefined
  val preserveScrollPosition: Boolean
  val transition: Transition | Null
  val `type`: NODE
}

object AnonDestinationId {
  @scala.inline
  def apply(
    navigation: Navigation,
    preserveScrollPosition: Boolean,
    `type`: NODE,
    destinationId: String = null,
    overlayRelativePosition: Vector = null,
    transition: Transition = null
  ): AnonDestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (destinationId != null) __obj.updateDynamic("destinationId")(destinationId.asInstanceOf[js.Any])
    if (overlayRelativePosition != null) __obj.updateDynamic("overlayRelativePosition")(overlayRelativePosition.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestinationId]
  }
}

