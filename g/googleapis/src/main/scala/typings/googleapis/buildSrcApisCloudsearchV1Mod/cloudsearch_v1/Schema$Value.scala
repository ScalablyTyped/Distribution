package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a single value with generic type.
  */
@js.native
trait Schema$Value extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValue: js.UndefOr[Schema$Date] = js.native
  var doubleValue: js.UndefOr[Double] = js.native
  var integerValue: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var timestampValue: js.UndefOr[String] = js.native
}

object Schema$Value {
  @scala.inline
  def apply(
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    dateValue: Schema$Date = null,
    doubleValue: Int | Double = null,
    integerValue: String = null,
    stringValue: String = null,
    timestampValue: String = null
  ): Schema$Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.asInstanceOf[js.Any])
    if (dateValue != null) __obj.updateDynamic("dateValue")(dateValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Value]
  }
}

