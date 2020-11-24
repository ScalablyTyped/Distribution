package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectsAndTexts extends js.Object {
  
  var rectsAndTexts: RectList = js.native
  
  var textList: String = js.native
}
object RectsAndTexts {
  
  @scala.inline
  def apply(rectsAndTexts: RectList, textList: String): RectsAndTexts = {
    val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectsAndTexts]
  }
  
  @scala.inline
  implicit class RectsAndTextsOps[Self <: RectsAndTexts] (val x: Self) extends AnyVal {
    
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
    def setRectsAndTexts(value: RectList): Self = this.set("rectsAndTexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextList(value: String): Self = this.set("textList", value.asInstanceOf[js.Any])
  }
}
