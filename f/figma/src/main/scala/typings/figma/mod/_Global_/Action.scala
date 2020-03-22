package typings.figma.mod._Global_

import typings.figma.figmaStrings.BACK
import typings.figma.figmaStrings.CLOSE
import typings.figma.figmaStrings.NODE
import typings.figma.figmaStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.AnonType
  - typings.figma.AnonUrl
  - typings.figma.AnonDestinationId
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def AnonType(`type`: BACK | CLOSE): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def AnonUrl(`type`: URL, url: String): Action = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def AnonDestinationId(
    navigation: Navigation,
    preserveScrollPosition: Boolean,
    `type`: NODE,
    destinationId: String = null,
    overlayRelativePosition: Vector = null,
    transition: Transition = null
  ): Action = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (destinationId != null) __obj.updateDynamic("destinationId")(destinationId.asInstanceOf[js.Any])
    if (overlayRelativePosition != null) __obj.updateDynamic("overlayRelativePosition")(overlayRelativePosition.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

