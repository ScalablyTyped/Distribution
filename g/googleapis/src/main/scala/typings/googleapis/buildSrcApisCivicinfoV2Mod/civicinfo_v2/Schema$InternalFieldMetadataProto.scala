package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InternalFieldMetadataProto extends js.Object {
  var isAuto: js.UndefOr[Boolean] = js.native
  var sourceSummary: js.UndefOr[Schema$InternalSourceSummaryProto] = js.native
}

object Schema$InternalFieldMetadataProto {
  @scala.inline
  def apply(
    isAuto: js.UndefOr[Boolean] = js.undefined,
    sourceSummary: Schema$InternalSourceSummaryProto = null
  ): Schema$InternalFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAuto)) __obj.updateDynamic("isAuto")(isAuto.asInstanceOf[js.Any])
    if (sourceSummary != null) __obj.updateDynamic("sourceSummary")(sourceSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InternalFieldMetadataProto]
  }
}

