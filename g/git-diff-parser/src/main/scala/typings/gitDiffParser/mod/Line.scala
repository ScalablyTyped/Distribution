package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends js.Object {
  
  /** Has line break. Always false for added failes */
  var break: Boolean = js.native
  
  /** The main line number */
  var ln1: Double = js.native
  
  /** New line number (for type normal) */
  var ln2: js.UndefOr[Double] = js.native
  
  /** Content of removed or added string */
  var text: String = js.native
  
  var `type`: LineType = js.native
}
object Line {
  
  @scala.inline
  def apply(break: Boolean, ln1: Double, text: String, `type`: LineType): Line = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], ln1 = ln1.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
    
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
    def setBreak(value: Boolean): Self = this.set("break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLn1(value: Double): Self = this.set("ln1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LineType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLn2(value: Double): Self = this.set("ln2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLn2: Self = this.set("ln2", js.undefined)
  }
}
