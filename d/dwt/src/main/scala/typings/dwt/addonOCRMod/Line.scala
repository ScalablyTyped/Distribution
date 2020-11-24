package typings.dwt.addonOCRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends js.Object {
  
  /**
    * Return the coordinates for the rectangle that contains the specified line. The coordinates are in the sequence of "left,top,right,bottom" like "121,125,892,143".
    */
  def GetLineRect(): String = js.native
  
  /**
    * Return the content of the specified word.
    * @index Specify the word.
    */
  def GetWordContent(index: Double): Word = js.native
  
  /**
    * Return the number of words in the line.
    */
  def GetWordCount(): Double = js.native
}
object Line {
  
  @scala.inline
  def apply(GetLineRect: () => String, GetWordContent: Double => Word, GetWordCount: () => Double): Line = {
    val __obj = js.Dynamic.literal(GetLineRect = js.Any.fromFunction0(GetLineRect), GetWordContent = js.Any.fromFunction1(GetWordContent), GetWordCount = js.Any.fromFunction0(GetWordCount))
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
    def setGetLineRect(value: () => String): Self = this.set("GetLineRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWordContent(value: Double => Word): Self = this.set("GetWordContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWordCount(value: () => Double): Self = this.set("GetWordCount", js.Any.fromFunction0(value))
  }
}
