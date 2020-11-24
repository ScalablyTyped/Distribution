package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationTabBackstageSettingsPage extends js.Object {
  
  /** Specifies the id of HTML elements like div,ul, etc., as ribbon backstage page's tab content.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.native
  
  /** Specifies the separator between backstage page's tab and button elements.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.native
  
  /** Specifies the id for ribbon backstage page's tab and button elements.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  
  /** Specifies the type for ribbon backstage page's contents. Set &quot;ej.Ribbon.BackStageItemType.Tab&quot; to render the tab or &quot;ej.Ribbon.BackStageItemType.Button&quot; to
    * render the button.
    * @Default {ej.Ribbon.ItemType.Tab}
    */
  var itemType: js.UndefOr[ItemType | String] = js.native
  
  /** Specifies the text for ribbon backstage page's tab header and button elements.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}
object ApplicationTabBackstageSettingsPage {
  
  @scala.inline
  def apply(): ApplicationTabBackstageSettingsPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTabBackstageSettingsPage]
  }
  
  @scala.inline
  implicit class ApplicationTabBackstageSettingsPageOps[Self <: ApplicationTabBackstageSettingsPage] (val x: Self) extends AnyVal {
    
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
    def setContentID(value: String): Self = this.set("contentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentID: Self = this.set("contentID", js.undefined)
    
    @scala.inline
    def setEnableSeparator(value: Boolean): Self = this.set("enableSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSeparator: Self = this.set("enableSeparator", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemType(value: ItemType | String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
