package typings.googleapis

import typings.googleapis.v5Mod.pagespeedonlineV5.SchemaLighthouseCategoryV5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessibility extends js.Object {
  var accessibility: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var `best-practices`: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var performance: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var pwa: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var seo: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
}

object AnonAccessibility {
  @scala.inline
  def apply(
    accessibility: SchemaLighthouseCategoryV5 = null,
    `best-practices`: SchemaLighthouseCategoryV5 = null,
    performance: SchemaLighthouseCategoryV5 = null,
    pwa: SchemaLighthouseCategoryV5 = null,
    seo: SchemaLighthouseCategoryV5 = null
  ): AnonAccessibility = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (`best-practices` != null) __obj.updateDynamic("best-practices")(`best-practices`.asInstanceOf[js.Any])
    if (performance != null) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (pwa != null) __obj.updateDynamic("pwa")(pwa.asInstanceOf[js.Any])
    if (seo != null) __obj.updateDynamic("seo")(seo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessibility]
  }
}

