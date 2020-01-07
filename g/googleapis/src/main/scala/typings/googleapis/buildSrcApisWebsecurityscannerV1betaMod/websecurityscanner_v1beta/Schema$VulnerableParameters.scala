package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about vulnerable request parameters.
  */
@js.native
trait Schema$VulnerableParameters extends js.Object {
  /**
    * The vulnerable parameter names.
    */
  var parameterNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$VulnerableParameters {
  @scala.inline
  def apply(parameterNames: js.Array[String] = null): Schema$VulnerableParameters = {
    val __obj = js.Dynamic.literal()
    if (parameterNames != null) __obj.updateDynamic("parameterNames")(parameterNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VulnerableParameters]
  }
}

