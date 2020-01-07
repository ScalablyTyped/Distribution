package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Validation based on regular expressions.
  */
@js.native
trait Schema$RegexValidation extends js.Object {
  /**
    * Required. RE2 regular expressions used to validate the parameter&#39;s
    * value. The value must match the regex in its entirety (substring matches
    * are not sufficient).
    */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RegexValidation {
  @scala.inline
  def apply(regexes: js.Array[String] = null): Schema$RegexValidation = {
    val __obj = js.Dynamic.literal()
    if (regexes != null) __obj.updateDynamic("regexes")(regexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegexValidation]
  }
}

