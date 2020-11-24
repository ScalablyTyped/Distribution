package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRange extends js.Object {
  
  /**
    * End column of range (exclusive).
    */
  var endColumn: integer = js.native
  
  /**
    * End line of range
    */
  var endLine: integer = js.native
  
  /**
    * Start column of range (inclusive).
    */
  var startColumn: integer = js.native
  
  /**
    * Start line of range.
    */
  var startLine: integer = js.native
}
object SourceRange {
  
  @scala.inline
  def apply(endColumn: integer, endLine: integer, startColumn: integer, startLine: integer): SourceRange = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRange]
  }
  
  @scala.inline
  implicit class SourceRangeOps[Self <: SourceRange] (val x: Self) extends AnyVal {
    
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
    def setEndColumn(value: integer): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: integer): Self = this.set("endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: integer): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: integer): Self = this.set("startLine", value.asInstanceOf[js.Any])
  }
}
