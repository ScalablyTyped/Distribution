package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Derived details about the company.
  */
@js.native
trait Schema$CompanyDerivedInfo extends js.Object {
  /**
    * A structured headquarters location of the company, resolved from
    * Company.hq_location if provided.
    */
  var headquartersLocation: js.UndefOr[Schema$Location] = js.native
}

object Schema$CompanyDerivedInfo {
  @scala.inline
  def apply(headquartersLocation: Schema$Location = null): Schema$CompanyDerivedInfo = {
    val __obj = js.Dynamic.literal()
    if (headquartersLocation != null) __obj.updateDynamic("headquartersLocation")(headquartersLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompanyDerivedInfo]
  }
}

