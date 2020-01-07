package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the errors to be returned in
  * google.api.servicecontrol.v1.CheckResponse.check_errors.
  */
@js.native
trait Schema$CheckError extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Free-form text providing details on the error cause of the error.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * Contains public information about the check error. If available,
    * `status.code` will be non zero and client can propagate it out as public
    * error.
    */
  var status: js.UndefOr[Schema$Status] = js.native
  /**
    * Subject to whom this error applies. See the specific code enum for more
    * details on this field. For example:     - “project:&lt;project-id or
    * project-number&gt;”     - “folder:&lt;folder-id&gt;”     -
    * “organization:&lt;organization-id&gt;”
    */
  var subject: js.UndefOr[String] = js.native
}

object Schema$CheckError {
  @scala.inline
  def apply(code: String = null, detail: String = null, status: Schema$Status = null, subject: String = null): Schema$CheckError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CheckError]
  }
}

