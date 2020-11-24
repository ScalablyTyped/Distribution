package typings.ejWebAll.ej.Tab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemActiveEventArgs extends js.Object {
  
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[HTMLElement] = js.native
  
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[Double] = js.native
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns, is it triggered by interaction or not.
    */
  var isInteraction: js.UndefOr[Boolean] = js.native
  
  /** returns the tab model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[HTMLElement] = js.native
  
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[Double] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ItemActiveEventArgs {
  
  @scala.inline
  def apply(): ItemActiveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActiveEventArgs]
  }
  
  @scala.inline
  implicit class ItemActiveEventArgsOps[Self <: ItemActiveEventArgs] (val x: Self) extends AnyVal {
    
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
    def setActiveHeader(value: HTMLElement): Self = this.set("activeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveHeader: Self = this.set("activeHeader", js.undefined)
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setIsInteraction(value: Boolean): Self = this.set("isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteraction: Self = this.set("isInteraction", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPrevActiveHeader(value: HTMLElement): Self = this.set("prevActiveHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevActiveHeader: Self = this.set("prevActiveHeader", js.undefined)
    
    @scala.inline
    def setPrevActiveIndex(value: Double): Self = this.set("prevActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevActiveIndex: Self = this.set("prevActiveIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
