package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
  */
@js.native
trait Schema$AttributeValue extends js.Object {
  /**
    * A Boolean value represented by `true` or `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A 64-bit signed integer.
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * A string up to 256 bytes long.
    */
  var stringValue: js.UndefOr[Schema$TruncatableString] = js.native
}

object Schema$AttributeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    intValue: String = null,
    stringValue: Schema$TruncatableString = null
  ): Schema$AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AttributeValue]
  }
}

