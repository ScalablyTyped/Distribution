package typings.extjs.Ext.toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextItem extends IItem {
  
  /** [Method] Updates this item s text setting the text to be used as innerHTML
    * @param text String The text to display (html accepted).
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
}
object ITextItem {
  
  @scala.inline
  def apply(): ITextItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextItem]
  }
  
  @scala.inline
  implicit class ITextItemOps[Self <: ITextItem] (val x: Self) extends AnyVal {
    
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
    def setSetText(value: /* text */ js.UndefOr[String] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
