package typings.firstMate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxLineLength extends js.Object {
  
  var maxLineLength: js.UndefOr[Double] = js.native
  
  var maxTokensPerLine: js.UndefOr[Double] = js.native
}
object MaxLineLength {
  
  @scala.inline
  def apply(): MaxLineLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxLineLength]
  }
  
  @scala.inline
  implicit class MaxLineLengthOps[Self <: MaxLineLength] (val x: Self) extends AnyVal {
    
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
    def setMaxLineLength(value: Double): Self = this.set("maxLineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLineLength: Self = this.set("maxLineLength", js.undefined)
    
    @scala.inline
    def setMaxTokensPerLine(value: Double): Self = this.set("maxTokensPerLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTokensPerLine: Self = this.set("maxTokensPerLine", js.undefined)
  }
}
