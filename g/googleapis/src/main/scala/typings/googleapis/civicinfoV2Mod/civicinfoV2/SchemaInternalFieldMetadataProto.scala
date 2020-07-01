package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalFieldMetadataProto extends js.Object {
  var isAuto: js.UndefOr[Boolean] = js.native
  var sourceSummary: js.UndefOr[SchemaInternalSourceSummaryProto] = js.native
}

object SchemaInternalFieldMetadataProto {
  @scala.inline
  def apply(isAuto: js.UndefOr[Boolean] = js.undefined, sourceSummary: SchemaInternalSourceSummaryProto = null): SchemaInternalFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAuto)) __obj.updateDynamic("isAuto")(isAuto.get.asInstanceOf[js.Any])
    if (sourceSummary != null) __obj.updateDynamic("sourceSummary")(sourceSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInternalFieldMetadataProto]
  }
}

