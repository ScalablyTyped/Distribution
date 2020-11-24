package typings.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontOptions extends js.Object {
  
  var baseline: Double = js.native
  
  var codeTagCount: Double | Null = js.native
  
  var fittingRules: FittingRules = js.native
  
  var fullLayout: Double | Null = js.native
  
  var hardBlank: String = js.native
  
  var height: Double = js.native
  
  var maxLength: Double = js.native
  
  var numCommentLines: Double = js.native
  
  var oldLayout: Double = js.native
  
  var printDirection: PrintDirection = js.native
}
object FontOptions {
  
  @scala.inline
  def apply(
    baseline: Double,
    fittingRules: FittingRules,
    hardBlank: String,
    height: Double,
    maxLength: Double,
    numCommentLines: Double,
    oldLayout: Double,
    printDirection: PrintDirection
  ): FontOptions = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], fittingRules = fittingRules.asInstanceOf[js.Any], hardBlank = hardBlank.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], numCommentLines = numCommentLines.asInstanceOf[js.Any], oldLayout = oldLayout.asInstanceOf[js.Any], printDirection = printDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
  
  @scala.inline
  implicit class FontOptionsOps[Self <: FontOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseline(value: Double): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFittingRules(value: FittingRules): Self = this.set("fittingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardBlank(value: String): Self = this.set("hardBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCommentLines(value: Double): Self = this.set("numCommentLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLayout(value: Double): Self = this.set("oldLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintDirection(value: PrintDirection): Self = this.set("printDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeTagCount(value: Double): Self = this.set("codeTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeTagCountNull: Self = this.set("codeTagCount", null)
    
    @scala.inline
    def setFullLayout(value: Double): Self = this.set("fullLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLayoutNull: Self = this.set("fullLayout", null)
  }
}
