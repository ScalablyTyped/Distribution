package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SavedAdStyle extends js.Object {
  /**
    * The AdStyle itself.
    */
  var adStyle: js.UndefOr[Schema$AdStyle] = js.native
  /**
    * Unique identifier of this saved ad style. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#savedAdStyle.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user selected name of this SavedAdStyle.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$SavedAdStyle {
  @scala.inline
  def apply(adStyle: Schema$AdStyle = null, id: String = null, kind: String = null, name: String = null): Schema$SavedAdStyle = {
    val __obj = js.Dynamic.literal()
    if (adStyle != null) __obj.updateDynamic("adStyle")(adStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SavedAdStyle]
  }
}

