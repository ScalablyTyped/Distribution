package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_InteractionType extends js.Object {
  var interactionType: js.UndefOr[String] = js.native
  var nodeValue: js.UndefOr[String] = js.native
}

object Anon_InteractionType {
  @scala.inline
  def apply(interactionType: String = null, nodeValue: String = null): Anon_InteractionType = {
    val __obj = js.Dynamic.literal()
    if (interactionType != null) __obj.updateDynamic("interactionType")(interactionType.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InteractionType]
  }
}

