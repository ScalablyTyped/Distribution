package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsGroupsContentGroupsGalleryItem extends js.Object {
  
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.native
  
  /** Specifies the custom tooltip for gallery content. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.native
  
  /** Sets text for the gallery content.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Sets tooltip for the gallery content.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
}
object TabsGroupsContentGroupsGalleryItem {
  
  @scala.inline
  def apply(): TabsGroupsContentGroupsGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroupsGalleryItem]
  }
  
  @scala.inline
  implicit class TabsGroupsContentGroupsGalleryItemOps[Self <: TabsGroupsContentGroupsGalleryItem] (val x: Self) extends AnyVal {
    
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
    def setButtonSettings(value: js.Any): Self = this.set("buttonSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonSettings: Self = this.set("buttonSettings", js.undefined)
    
    @scala.inline
    def setCustomToolTip(value: js.Any): Self = this.set("customToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolTip: Self = this.set("customToolTip", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
  }
}
