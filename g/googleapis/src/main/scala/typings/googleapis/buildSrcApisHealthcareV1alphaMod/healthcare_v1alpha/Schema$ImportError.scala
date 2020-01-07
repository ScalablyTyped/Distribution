package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains error status for each import failure.
  */
@js.native
trait Schema$ImportError extends js.Object {
  /**
    * Resource name.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Error status associated with resource.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$ImportError {
  @scala.inline
  def apply(resource: String = null, status: Schema$Status = null): Schema$ImportError = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportError]
  }
}

