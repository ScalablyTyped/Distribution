package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Request for updating a specified company.
  */
@js.native
trait Schema$UpdateCompanyRequest extends js.Object {
  /**
    * Required.  The company resource to replace the current resource in the
    * system.
    */
  var company: js.UndefOr[Schema$Company] = js.native
  /**
    * Optional but strongly recommended for the best service experience.  If
    * update_mask is provided, only the specified fields in company are
    * updated. Otherwise all the fields are updated.  A field mask to specify
    * the company fields to be updated. Only top level fields of Company are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateCompanyRequest {
  @scala.inline
  def apply(company: Schema$Company = null, updateMask: String = null): Schema$UpdateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateCompanyRequest]
  }
}

