package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Click-through URL
  */
@js.native
trait Schema$CreativeClickThroughUrl extends js.Object {
  /**
    * Read-only convenience field representing the actual URL that will be used
    * for this click-through. The URL is computed as follows:  - If
    * landingPageId is specified then that landing page&#39;s URL is assigned
    * to this field. - Otherwise, the customClickThroughUrl is assigned to this
    * field.
    */
  var computedClickThroughUrl: js.UndefOr[String] = js.native
  /**
    * Custom click-through URL. Applicable if the landingPageId field is left
    * unset.
    */
  var customClickThroughUrl: js.UndefOr[String] = js.native
  /**
    * ID of the landing page for the click-through URL.
    */
  var landingPageId: js.UndefOr[String] = js.native
}

object Schema$CreativeClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: String = null,
    customClickThroughUrl: String = null,
    landingPageId: String = null
  ): Schema$CreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl.asInstanceOf[js.Any])
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl.asInstanceOf[js.Any])
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeClickThroughUrl]
  }
}

