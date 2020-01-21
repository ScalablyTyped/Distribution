package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalSourceSummaryProto extends js.Object {
  var dataset: js.UndefOr[String] = js.native
  var provider: js.UndefOr[String] = js.native
}

object SchemaInternalSourceSummaryProto {
  @scala.inline
  def apply(dataset: String = null, provider: String = null): SchemaInternalSourceSummaryProto = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInternalSourceSummaryProto]
  }
}

