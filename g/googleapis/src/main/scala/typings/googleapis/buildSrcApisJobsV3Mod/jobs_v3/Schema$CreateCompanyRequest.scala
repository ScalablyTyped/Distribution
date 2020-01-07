package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The Request of the CreateCompany method.
  */
@js.native
trait Schema$CreateCompanyRequest extends js.Object {
  /**
    * Required.  The company to be created.
    */
  var company: js.UndefOr[Schema$Company] = js.native
}

object Schema$CreateCompanyRequest {
  @scala.inline
  def apply(company: Schema$Company = null): Schema$CreateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateCompanyRequest]
  }
}

