package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharIndex extends js.Object {
  
  var charIndex: Double = js.native
  
  var lineIndex: Double = js.native
}
object CharIndex {
  
  @scala.inline
  def apply(charIndex: Double, lineIndex: Double): CharIndex = {
    val __obj = js.Dynamic.literal(charIndex = charIndex.asInstanceOf[js.Any], lineIndex = lineIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharIndex]
  }
  
  @scala.inline
  implicit class CharIndexOps[Self <: CharIndex] (val x: Self) extends AnyVal {
    
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
    def setCharIndex(value: Double): Self = this.set("charIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineIndex(value: Double): Self = this.set("lineIndex", value.asInstanceOf[js.Any])
  }
}
