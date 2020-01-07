package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Metadata extends js.Object {
  var items: js.UndefOr[js.Array[Schema$ReportingMetadataEntry]] = js.native
  /**
    * Kind of list this is, in this case adsense#metadata.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Metadata {
  @scala.inline
  def apply(items: js.Array[Schema$ReportingMetadataEntry] = null, kind: String = null): Schema$Metadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metadata]
  }
}

