package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /** A Boolean value represented by `true` or `false`. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /** A 64-bit signed integer. */
  var intValue: js.UndefOr[String] = js.undefined
  /** A string up to 256 bytes long. */
  var stringValue: js.UndefOr[TruncatableString] = js.undefined
}

object AttributeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    intValue: String = null,
    stringValue: TruncatableString = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
}

