package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition for determining whether a transformation should be applied to a
  * field.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RecordCondition extends js.Object {
  /**
    * An expression.
    */
  var expressions: js.UndefOr[Schema$GooglePrivacyDlpV2Expressions] = js.native
}

object Schema$GooglePrivacyDlpV2RecordCondition {
  @scala.inline
  def apply(expressions: Schema$GooglePrivacyDlpV2Expressions = null): Schema$GooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RecordCondition]
  }
}

