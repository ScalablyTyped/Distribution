package typings.ejWebAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxSuccessEventArgs extends js.Object {
  
  /** returns the current URL of the AJAX post.
    */
  var URL: js.UndefOr[String] = js.native
  
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the AJAX current content.
    */
  var content: js.UndefOr[String] = js.native
  
  /** returns the current item index.
    */
  var index: js.UndefOr[Double] = js.native
  
  /** returns the current list item.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /** returns the model value of the control.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the current item text.
    */
  var text: js.UndefOr[String] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object AjaxSuccessEventArgs {
  
  @scala.inline
  def apply(): AjaxSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSuccessEventArgs]
  }
  
  @scala.inline
  implicit class AjaxSuccessEventArgsOps[Self <: AjaxSuccessEventArgs] (val x: Self) extends AnyVal {
    
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
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
