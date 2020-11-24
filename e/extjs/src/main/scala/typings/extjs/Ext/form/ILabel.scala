package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabel extends IComponent {
  
  /** [Config Option] (String) */
  var forId: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[String] = js.native
  
  /** [Method] Updates the label s innerHTML with the specified string
    * @param text String The new label text
    * @param encode Boolean False to skip HTML-encoding the text when rendering it to the label. This might be useful if you want to include tags in the label's innerHTML rather than rendering them as string literals per the default logic.
    * @returns Ext.form.Label this
    */
  var setText: js.UndefOr[
    js.Function2[/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean], this.type]
  ] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
}
object ILabel {
  
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    
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
    def setForId(value: String): Self = this.set("forId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForId: Self = this.set("forId", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setSetText(value: (/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean]) => ILabel): Self = this.set("setText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
