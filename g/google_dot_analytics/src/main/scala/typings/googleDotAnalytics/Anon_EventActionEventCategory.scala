package typings.googleDotAnalytics

import typings.googleDotAnalytics.UniversalAnalytics.HitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventActionEventCategory extends js.Object {
  var eventAction: String
   // 'event'
  var eventCategory: String
  var eventLabel: js.UndefOr[String] = js.undefined
  var eventValue: js.UndefOr[Double] = js.undefined
  var hitType: HitType
  var nonInteraction: js.UndefOr[Boolean] = js.undefined
}

object Anon_EventActionEventCategory {
  @scala.inline
  def apply(
    eventAction: String,
    eventCategory: String,
    hitType: HitType,
    eventLabel: String = null,
    eventValue: Int | Double = null,
    nonInteraction: js.UndefOr[Boolean] = js.undefined
  ): Anon_EventActionEventCategory = {
    val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any], hitType = hitType.asInstanceOf[js.Any])
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel.asInstanceOf[js.Any])
    if (eventValue != null) __obj.updateDynamic("eventValue")(eventValue.asInstanceOf[js.Any])
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventActionEventCategory]
  }
}

