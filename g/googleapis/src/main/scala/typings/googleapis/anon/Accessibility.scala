package typings.googleapis.anon

import typings.googleapis.v5Mod.pagespeedonlineV5.SchemaLighthouseCategoryV5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accessibility extends js.Object {
  var accessibility: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var `best-practices`: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var performance: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var pwa: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
  var seo: js.UndefOr[SchemaLighthouseCategoryV5] = js.native
}

object Accessibility {
  @scala.inline
  def apply(): Accessibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessibility]
  }
  @scala.inline
  implicit class AccessibilityOps[Self <: Accessibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibility(value: SchemaLighthouseCategoryV5): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def `setBest-practices`(value: SchemaLighthouseCategoryV5): Self = this.set("best-practices", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBest-practices`: Self = this.set("best-practices", js.undefined)
    @scala.inline
    def setPerformance(value: SchemaLighthouseCategoryV5): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setPwa(value: SchemaLighthouseCategoryV5): Self = this.set("pwa", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePwa: Self = this.set("pwa", js.undefined)
    @scala.inline
    def setSeo(value: SchemaLighthouseCategoryV5): Self = this.set("seo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeo: Self = this.set("seo", js.undefined)
  }
  
}

