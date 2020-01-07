package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Finding and its StateChange.
  */
@js.native
trait Schema$ListFindingsResult extends js.Object {
  /**
    * Finding matching the search request.
    */
  var finding: js.UndefOr[Schema$Finding] = js.native
  /**
    * State change of the finding between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}

object Schema$ListFindingsResult {
  @scala.inline
  def apply(finding: Schema$Finding = null, stateChange: String = null): Schema$ListFindingsResult = {
    val __obj = js.Dynamic.literal()
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    if (stateChange != null) __obj.updateDynamic("stateChange")(stateChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFindingsResult]
  }
}

