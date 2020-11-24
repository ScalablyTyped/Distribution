package typings.diff2html.lineByLineRendererMod

import typings.diff2html.renderUtilsMod.RenderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineByLineRendererConfig extends RenderConfig {
  
  var matchingMaxComparisons: js.UndefOr[Double] = js.native
  
  var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.native
  
  var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.native
}
object LineByLineRendererConfig {
  
  @scala.inline
  def apply(): LineByLineRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineByLineRendererConfig]
  }
  
  @scala.inline
  implicit class LineByLineRendererConfigOps[Self <: LineByLineRendererConfig] (val x: Self) extends AnyVal {
    
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
    def setMatchingMaxComparisons(value: Double): Self = this.set("matchingMaxComparisons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingMaxComparisons: Self = this.set("matchingMaxComparisons", js.undefined)
    
    @scala.inline
    def setMaxLineSizeInBlockForComparison(value: Double): Self = this.set("maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLineSizeInBlockForComparison: Self = this.set("maxLineSizeInBlockForComparison", js.undefined)
    
    @scala.inline
    def setRenderNothingWhenEmpty(value: Boolean): Self = this.set("renderNothingWhenEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderNothingWhenEmpty: Self = this.set("renderNothingWhenEmpty", js.undefined)
  }
}
