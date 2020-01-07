package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for parameter validation.
  */
@js.native
trait Schema$ParameterValidation extends js.Object {
  /**
    * Validation based on regular expressions.
    */
  var regex: js.UndefOr[Schema$RegexValidation] = js.native
  /**
    * Validation based on a list of allowed values.
    */
  var values: js.UndefOr[Schema$ValueValidation] = js.native
}

object Schema$ParameterValidation {
  @scala.inline
  def apply(regex: Schema$RegexValidation = null, values: Schema$ValueValidation = null): Schema$ParameterValidation = {
    val __obj = js.Dynamic.literal()
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParameterValidation]
  }
}

