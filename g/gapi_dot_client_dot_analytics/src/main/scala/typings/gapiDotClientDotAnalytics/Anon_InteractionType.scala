package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InteractionType extends js.Object {
  /** Type of an interaction on conversion path. Such as CLICK, IMPRESSION etc. */
  var interactionType: js.UndefOr[String] = js.undefined
  /** Node value of an interaction on conversion path. Such as source, medium etc. */
  var nodeValue: js.UndefOr[String] = js.undefined
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

