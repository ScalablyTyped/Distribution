package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets a data validation rule to every cell in the range. To clear validation
  * in a range, call this with no rule specified.
  */
@js.native
trait Schema$SetDataValidationRequest extends js.Object {
  /**
    * The range the data validation rule should apply to.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The data validation rule to set on each cell in the range, or empty to
    * clear the data validation in the range.
    */
  var rule: js.UndefOr[Schema$DataValidationRule] = js.native
}

object Schema$SetDataValidationRequest {
  @scala.inline
  def apply(range: Schema$GridRange = null, rule: Schema$DataValidationRule = null): Schema$SetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetDataValidationRequest]
  }
}

