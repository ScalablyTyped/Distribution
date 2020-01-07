package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SavedReport extends js.Object {
  /**
    * Unique identifier of this saved report.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#savedReport.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This saved report&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$SavedReport {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): Schema$SavedReport = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SavedReport]
  }
}

