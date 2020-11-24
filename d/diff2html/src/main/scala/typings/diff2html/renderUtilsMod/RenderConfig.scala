package typings.diff2html.renderUtilsMod

import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderConfig extends js.Object {
  
  var diffStyle: js.UndefOr[DiffStyleType] = js.native
  
  var matchWordsThreshold: js.UndefOr[Double] = js.native
  
  var matching: js.UndefOr[LineMatchingType] = js.native
  
  var maxLineLengthHighlight: js.UndefOr[Double] = js.native
}
object RenderConfig {
  
  @scala.inline
  def apply(): RenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderConfig]
  }
  
  @scala.inline
  implicit class RenderConfigOps[Self <: RenderConfig] (val x: Self) extends AnyVal {
    
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
    def setDiffStyle(value: DiffStyleType): Self = this.set("diffStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffStyle: Self = this.set("diffStyle", js.undefined)
    
    @scala.inline
    def setMatchWordsThreshold(value: Double): Self = this.set("matchWordsThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWordsThreshold: Self = this.set("matchWordsThreshold", js.undefined)
    
    @scala.inline
    def setMatching(value: LineMatchingType): Self = this.set("matching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching: Self = this.set("matching", js.undefined)
    
    @scala.inline
    def setMaxLineLengthHighlight(value: Double): Self = this.set("maxLineLengthHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLineLengthHighlight: Self = this.set("maxLineLengthHighlight", js.undefined)
  }
}
