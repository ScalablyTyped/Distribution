package typings.diff2html.renderUtilsMod

import typings.diff2html.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightedLines extends js.Object {
  
  var newLine: Content = js.native
  
  var oldLine: Content = js.native
}
object HighlightedLines {
  
  @scala.inline
  def apply(newLine: Content, oldLine: Content): HighlightedLines = {
    val __obj = js.Dynamic.literal(newLine = newLine.asInstanceOf[js.Any], oldLine = oldLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedLines]
  }
  
  @scala.inline
  implicit class HighlightedLinesOps[Self <: HighlightedLines] (val x: Self) extends AnyVal {
    
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
    def setNewLine(value: Content): Self = this.set("newLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLine(value: Content): Self = this.set("oldLine", value.asInstanceOf[js.Any])
  }
}
