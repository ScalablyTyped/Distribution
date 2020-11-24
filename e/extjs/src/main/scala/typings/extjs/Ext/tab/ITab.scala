package typings.extjs.Ext.tab

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.button.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITab extends IButton {
  
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var closableCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var closeText: js.UndefOr[String] = js.native
  
  /** [Property] (Boolean) */
  var isTab: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets this tab s attached card
    * @param card Ext.Component The card to set
    */
  var setCard: js.UndefOr[js.Function1[/* card */ js.UndefOr[IComponent], Unit]] = js.native
  
  /** [Method] Sets the tab as either closable or not
    * @param closable Boolean Pass false to make the tab not closable. Otherwise the tab will be made closable (eg a close button will appear on the tab)
    */
  var setClosable: js.UndefOr[js.Function1[/* closable */ js.UndefOr[Boolean], Unit]] = js.native
}
object ITab {
  
  @scala.inline
  def apply(): ITab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITab]
  }
  
  @scala.inline
  implicit class ITabOps[Self <: ITab] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setActiveCls(value: String): Self = this.set("activeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveCls: Self = this.set("activeCls", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setClosableCls(value: String): Self = this.set("closableCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosableCls: Self = this.set("closableCls", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    
    @scala.inline
    def setIsTab(value: Boolean): Self = this.set("isTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTab: Self = this.set("isTab", js.undefined)
    
    @scala.inline
    def setSetCard(value: /* card */ js.UndefOr[IComponent] => Unit): Self = this.set("setCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCard: Self = this.set("setCard", js.undefined)
    
    @scala.inline
    def setSetClosable(value: /* closable */ js.UndefOr[Boolean] => Unit): Self = this.set("setClosable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetClosable: Self = this.set("setClosable", js.undefined)
  }
}
