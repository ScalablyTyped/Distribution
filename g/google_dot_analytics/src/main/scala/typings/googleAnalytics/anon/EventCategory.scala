package typings.googleAnalytics.anon

import typings.googleAnalytics.UniversalAnalytics.HitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCategory extends js.Object {
  var eventAction: String
   // 'event'
  var eventCategory: String
  var eventLabel: js.UndefOr[String] = js.undefined
  var eventValue: js.UndefOr[Double] = js.undefined
  var hitType: HitType
  var nonInteraction: js.UndefOr[Boolean] = js.undefined
}

object EventCategory {
  @scala.inline
  def apply(
    eventAction: String,
    eventCategory: String,
    hitType: HitType,
    eventLabel: String = null,
    eventValue: js.UndefOr[Double] = js.undefined,
    nonInteraction: js.UndefOr[Boolean] = js.undefined
  ): EventCategory = {
    val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any], hitType = hitType.asInstanceOf[js.Any])
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(eventValue)) __obj.updateDynamic("eventValue")(eventValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCategory]
  }
}

