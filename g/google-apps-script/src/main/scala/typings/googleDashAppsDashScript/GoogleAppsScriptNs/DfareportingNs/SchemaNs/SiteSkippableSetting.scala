package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteSkippableSetting extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var progressOffset: js.UndefOr[VideoOffset] = js.undefined
  var skipOffset: js.UndefOr[VideoOffset] = js.undefined
  var skippable: js.UndefOr[Boolean] = js.undefined
}

object SiteSkippableSetting {
  @scala.inline
  def apply(
    kind: String = null,
    progressOffset: VideoOffset = null,
    skipOffset: VideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined
  ): SiteSkippableSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset)
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset)
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable)
    __obj.asInstanceOf[SiteSkippableSetting]
  }
}

