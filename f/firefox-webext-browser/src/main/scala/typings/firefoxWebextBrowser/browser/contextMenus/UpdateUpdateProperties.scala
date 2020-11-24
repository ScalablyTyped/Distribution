package typings.firefoxWebextBrowser.browser.contextMenus

import typings.firefoxWebextBrowser.browser.extension.ViewType
import typings.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties to update. Accepts the same values as the create function. */
@js.native
trait UpdateUpdateProperties extends js.Object {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var contexts: js.UndefOr[js.Array[ContextType]] = js.native
  
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[UpdateUpdatePropertiesIcons] = js.native
  
  /**
    * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
    */
  var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.native
  
  /** Note: You cannot change an item to be a child of one of its own descendants. */
  var parentId: js.UndefOr[Double | String] = js.native
  
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ItemType] = js.native
  
  var viewTypes: js.UndefOr[js.Array[ViewType]] = js.native
  
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[Boolean] = js.native
}
object UpdateUpdateProperties {
  
  @scala.inline
  def apply(): UpdateUpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUpdateProperties]
  }
  
  @scala.inline
  implicit class UpdateUpdatePropertiesOps[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: ContextType*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[ContextType]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDocumentUrlPatternsVarargs(value: String*): Self = this.set("documentUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setDocumentUrlPatterns(value: js.Array[String]): Self = this.set("documentUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentUrlPatterns: Self = this.set("documentUrlPatterns", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIcons(value: UpdateUpdatePropertiesIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = this.set("onclick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setParentId(value: Double | String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setTargetUrlPatternsVarargs(value: String*): Self = this.set("targetUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setTargetUrlPatterns(value: js.Array[String]): Self = this.set("targetUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetUrlPatterns: Self = this.set("targetUrlPatterns", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: ItemType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setViewTypesVarargs(value: ViewType*): Self = this.set("viewTypes", js.Array(value :_*))
    
    @scala.inline
    def setViewTypes(value: js.Array[ViewType]): Self = this.set("viewTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewTypes: Self = this.set("viewTypes", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
