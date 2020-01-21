package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProvenance extends js.Object {
  var collidedSegmentSource: js.UndefOr[SchemaStreetSegmentList] = js.native
  var ctclContestUuid: js.UndefOr[String] = js.native
  var ctclOfficeUuid: js.UndefOr[String] = js.native
  var datasetId: js.UndefOr[String] = js.native
  var precinctId: js.UndefOr[String] = js.native
  var precinctSplitId: js.UndefOr[String] = js.native
  var tsStreetSegmentId: js.UndefOr[String] = js.native
  var vip5PrecinctId: js.UndefOr[String] = js.native
  var vip5StreetSegmentId: js.UndefOr[String] = js.native
  var vipStreetSegmentId: js.UndefOr[String] = js.native
}

object SchemaProvenance {
  @scala.inline
  def apply(
    collidedSegmentSource: SchemaStreetSegmentList = null,
    ctclContestUuid: String = null,
    ctclOfficeUuid: String = null,
    datasetId: String = null,
    precinctId: String = null,
    precinctSplitId: String = null,
    tsStreetSegmentId: String = null,
    vip5PrecinctId: String = null,
    vip5StreetSegmentId: String = null,
    vipStreetSegmentId: String = null
  ): SchemaProvenance = {
    val __obj = js.Dynamic.literal()
    if (collidedSegmentSource != null) __obj.updateDynamic("collidedSegmentSource")(collidedSegmentSource.asInstanceOf[js.Any])
    if (ctclContestUuid != null) __obj.updateDynamic("ctclContestUuid")(ctclContestUuid.asInstanceOf[js.Any])
    if (ctclOfficeUuid != null) __obj.updateDynamic("ctclOfficeUuid")(ctclOfficeUuid.asInstanceOf[js.Any])
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (precinctId != null) __obj.updateDynamic("precinctId")(precinctId.asInstanceOf[js.Any])
    if (precinctSplitId != null) __obj.updateDynamic("precinctSplitId")(precinctSplitId.asInstanceOf[js.Any])
    if (tsStreetSegmentId != null) __obj.updateDynamic("tsStreetSegmentId")(tsStreetSegmentId.asInstanceOf[js.Any])
    if (vip5PrecinctId != null) __obj.updateDynamic("vip5PrecinctId")(vip5PrecinctId.asInstanceOf[js.Any])
    if (vip5StreetSegmentId != null) __obj.updateDynamic("vip5StreetSegmentId")(vip5StreetSegmentId.asInstanceOf[js.Any])
    if (vipStreetSegmentId != null) __obj.updateDynamic("vipStreetSegmentId")(vipStreetSegmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProvenance]
  }
}

