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
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (enumDescriptions != null) __obj.updateDynamic("enumDescriptions")(enumDescriptions)
    if (location != null) __obj.updateDynamic("location")(location)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnalyticsParameter]
  }
}

