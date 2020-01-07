package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Alerts extends js.Object {
  /**
    * The alerts returned in this list response.
    */
  var items: js.UndefOr[js.Array[Schema$Alert]] = js.native
  /**
    * Kind of list this is, in this case adsense#alerts.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Alerts {
  @scala.inline
  def apply(items: js.Array[Schema$Alert] = null, kind: String = null): Schema$Alerts = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Alerts]
  }
}

