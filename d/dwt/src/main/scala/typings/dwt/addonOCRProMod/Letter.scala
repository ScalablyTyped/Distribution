package typings.dwt.addonOCRProMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Letter extends js.Object {
  
  /**
    * Return the coordinates for the rectangle that contains the specified letter. The coordinates are in the sequence of "left,top,right,bottom" like "121,125,123,143".
    */
  def GetLetterRect(): String = js.native
  
  /**
    * Return the text of the letter.
    */
  def GetText(): Double = js.native
}
object Letter {
  
  @scala.inline
  def apply(GetLetterRect: () => String, GetText: () => Double): Letter = {
    val __obj = js.Dynamic.literal(GetLetterRect = js.Any.fromFunction0(GetLetterRect), GetText = js.Any.fromFunction0(GetText))
    __obj.asInstanceOf[Letter]
  }
  
  @scala.inline
  implicit class LetterOps[Self <: Letter] (val x: Self) extends AnyVal {
    
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
    def setGetLetterRect(value: () => String): Self = this.set("GetLetterRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => Double): Self = this.set("GetText", js.Any.fromFunction0(value))
  }
}
