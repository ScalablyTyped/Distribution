package typings.googleDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventAction extends js.Object {
  var eventAction: String
  var eventCategory: String
  var eventLabel: js.UndefOr[String] = js.undefined
  var eventValue: js.UndefOr[Double] = js.undefined
  var nonInteraction: js.UndefOr[Boolean] = js.undefined
}

object Anon_EventAction {
  @scala.inline
  def apply(
    eventAction: String,
    eventCategory: String,
    eventLabel: String = null,
    eventValue: Int | Double = null,
    nonInteraction: js.UndefOr[Boolean] = js.undefined
  ): Anon_EventAction = {
    val __obj = js.Dynamic.literal(eventAction = eventAction, eventCategory = eventCategory)
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel)
    if (eventValue != null) __obj.updateDynamic("eventValue")(eventValue.asInstanceOf[js.Any])
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction)
    __obj.asInstanceOf[Anon_EventAction]
  }
}

