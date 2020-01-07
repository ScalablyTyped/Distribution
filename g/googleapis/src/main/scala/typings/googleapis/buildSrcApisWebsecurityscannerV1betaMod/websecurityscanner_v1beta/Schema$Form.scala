package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ! Information about a vulnerability with an HTML.
  */
@js.native
trait Schema$Form extends js.Object {
  /**
    * ! The URI where to send the form when it&#39;s submitted.
    */
  var actionUri: js.UndefOr[String] = js.native
  /**
    * ! The names of form fields related to the vulnerability.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Form {
  @scala.inline
  def apply(actionUri: String = null, fields: js.Array[String] = null): Schema$Form = {
    val __obj = js.Dynamic.literal()
    if (actionUri != null) __obj.updateDynamic("actionUri")(actionUri.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Form]
  }
}

