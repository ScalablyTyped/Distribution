package typings.googleAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAction extends js.Object {
  var eventAction: String
  var eventCategory: String
  var eventLabel: js.UndefOr[String] = js.undefined
  var eventValue: js.UndefOr[Double] = js.undefined
  var nonInteraction: js.UndefOr[Boolean] = js.undefined
}

object EventAction {
  @scala.inline
  def apply(
    eventAction: String,
    eventCategory: String,
    eventLabel: String = null,
    eventValue: js.UndefOr[Double] = js.undefined,
    nonInteraction: js.UndefOr[Boolean] = js.undefined
  ): EventAction = {
    val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any])
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(eventValue)) __obj.updateDynamic("eventValue")(eventValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAction]
  }
}

