package typings.dwt.addonOCRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Word extends js.Object {
  
  /**
    * Return the font name/size of the word.
    */
  def GetFontName(): String = js.native
  
  def GetFontSize(): Double = js.native
  
  /**
    * Return the text of the word.
    */
  def GetText(): String = js.native
  
  /**
    * Return the coordinates for the rectangle that contains the specified word. The coordinates are in the sequence of "left,top,right,bottom" like "121,126,157,139".
    * @index Specify the word.
    */
  def GetWordRect(index: Double): String = js.native
}
object Word {
  
  @scala.inline
  def apply(
    GetFontName: () => String,
    GetFontSize: () => Double,
    GetText: () => String,
    GetWordRect: Double => String
  ): Word = {
    val __obj = js.Dynamic.literal(GetFontName = js.Any.fromFunction0(GetFontName), GetFontSize = js.Any.fromFunction0(GetFontSize), GetText = js.Any.fromFunction0(GetText), GetWordRect = js.Any.fromFunction1(GetWordRect))
    __obj.asInstanceOf[Word]
  }
  
  @scala.inline
  implicit class WordOps[Self <: Word] (val x: Self) extends AnyVal {
    
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
    def setGetFontName(value: () => String): Self = this.set("GetFontName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontSize(value: () => Double): Self = this.set("GetFontSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWordRect(value: Double => String): Self = this.set("GetWordRect", js.Any.fromFunction1(value))
  }
}
