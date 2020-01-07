package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InternalSourceSummaryProto extends js.Object {
  var dataset: js.UndefOr[String] = js.native
  var provider: js.UndefOr[String] = js.native
}

object Schema$InternalSourceSummaryProto {
  @scala.inline
  def apply(dataset: String = null, provider: String = null): Schema$InternalSourceSummaryProto = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InternalSourceSummaryProto]
  }
}

