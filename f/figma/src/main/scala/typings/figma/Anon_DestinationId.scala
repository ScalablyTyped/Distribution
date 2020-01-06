package typings.figma

import typings.figma.figmaMod._Global_.Action
import typings.figma.figmaMod._Global_.Navigation
import typings.figma.figmaMod._Global_.Transition
import typings.figma.figmaMod._Global_.Vector
import typings.figma.figmaStrings.NODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationId extends Action {
  val destinationId: String | Null
  val navigation: Navigation
  // Only present if navigation == "OVERLAY" and the destination uses
  // overlay position type "RELATIVE"
  val overlayRelativePosition: js.UndefOr[Vector] = js.undefined
  val preserveScrollPosition: Boolean
  val transition: Transition | Null
  val `type`: NODE
}

object Anon_DestinationId {
  @scala.inline
  def apply(
    navigation: Navigation,
    preserveScrollPosition: Boolean,
    `type`: NODE,
    destinationId: String = null,
    overlayRelativePosition: Vector = null,
    transition: Transition = null
  ): Anon_DestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (destinationId != null) __obj.updateDynamic("destinationId")(destinationId.asInstanceOf[js.Any])
    if (overlayRelativePosition != null) __obj.updateDynamic("overlayRelativePosition")(overlayRelativePosition.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationId]
  }
}

