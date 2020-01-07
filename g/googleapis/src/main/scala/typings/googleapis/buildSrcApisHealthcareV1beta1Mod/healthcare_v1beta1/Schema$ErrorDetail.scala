package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to describe the error encountered during batch operation on one
  * resource. This is used both for sample errors in operation response, and
  * for format of errors in error reports.
  */
@js.native
trait Schema$ErrorDetail extends js.Object {
  /**
    * The status of the error.
    */
  var error: js.UndefOr[Schema$Status] = js.native
  /**
    * The identifier of the resource.
    */
  var resource: js.UndefOr[String] = js.native
}

object Schema$ErrorDetail {
  @scala.inline
  def apply(error: Schema$Status = null, resource: String = null): Schema$ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorDetail]
  }
}

