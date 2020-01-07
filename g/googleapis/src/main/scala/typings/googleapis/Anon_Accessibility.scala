package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Schema$LighthouseCategoryV5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Accessibility extends js.Object {
  var accessibility: js.UndefOr[Schema$LighthouseCategoryV5] = js.native
  var `best-practices`: js.UndefOr[Schema$LighthouseCategoryV5] = js.native
  var performance: js.UndefOr[Schema$LighthouseCategoryV5] = js.native
  var pwa: js.UndefOr[Schema$LighthouseCategoryV5] = js.native
  var seo: js.UndefOr[Schema$LighthouseCategoryV5] = js.native
}

object Anon_Accessibility {
  @scala.inline
  def apply(
    accessibility: Schema$LighthouseCategoryV5 = null,
    `best-practices`: Schema$LighthouseCategoryV5 = null,
    performance: Schema$LighthouseCategoryV5 = null,
    pwa: Schema$LighthouseCategoryV5 = null,
    seo: Schema$LighthouseCategoryV5 = null
  ): Anon_Accessibility = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (`best-practices` != null) __obj.updateDynamic("best-practices")(`best-practices`.asInstanceOf[js.Any])
    if (performance != null) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (pwa != null) __obj.updateDynamic("pwa")(pwa.asInstanceOf[js.Any])
    if (seo != null) __obj.updateDynamic("seo")(seo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accessibility]
  }
}

