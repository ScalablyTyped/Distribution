package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import typings.exceljs.exceljsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillPattern extends Fill {
  
  var bgColor: js.UndefOr[PartialColor] = js.native
  
  var fgColor: PartialColor = js.native
  
  var pattern: FillPatterns = js.native
  
  var `type`: pattern = js.native
}
object FillPattern {
  
  @scala.inline
  def apply(fgColor: PartialColor, pattern: FillPatterns, `type`: pattern): FillPattern = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPattern]
  }
  
  @scala.inline
  implicit class FillPatternOps[Self <: FillPattern] (val x: Self) extends AnyVal {
    
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
    def setFgColor(value: PartialColor): Self = this.set("fgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: FillPatterns): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pattern): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColor(value: PartialColor): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
  }
}
