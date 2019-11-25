package typings.gapiDotAnalytics.gapi.client.analytics.kB.parameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsParameter extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[String]] = js.undefined
  var enumDescriptions: js.UndefOr[js.Array[String]] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnalyticsParameter {
  @scala.inline
  def apply(
    default: String = null,
    description: String = null,
    enum: js.Array[String] = null,
    enumDescriptions: js.Array[String] = null,
    location: String = null,
    `type`: String = null
  ): AnalyticsParameter = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (enumDescriptions != null) __obj.updateDynamic("enumDescriptions")(enumDescriptions.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsParameter]
  }
}

