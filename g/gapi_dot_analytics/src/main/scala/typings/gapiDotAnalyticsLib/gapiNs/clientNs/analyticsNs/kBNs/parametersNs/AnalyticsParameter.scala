package typings
package gapiDotAnalyticsLib.gapiNs.clientNs.analyticsNs.kBNs.parametersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsParameter extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enumDescriptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AnalyticsParameter {
  @scala.inline
  def apply(
    default: java.lang.String = null,
    description: java.lang.String = null,
    enum: js.Array[java.lang.String] = null,
    enumDescriptions: js.Array[java.lang.String] = null,
    location: java.lang.String = null,
    `type`: java.lang.String = null
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

