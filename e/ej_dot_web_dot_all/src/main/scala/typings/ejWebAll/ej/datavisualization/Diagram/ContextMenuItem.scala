package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuItem extends js.Object {
  
  /** Defines the CssClass for the collection of context menu items
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Defines the image url for the collection of context menu items
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Defines the name for the collection of context menu items
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  
  /** Defines the collection of sub items for the context menu items
    * @Default {[]}
    */
  var subItems: js.UndefOr[js.Array[_]] = js.native
  
  /** Defines the text for the collection of context menu item
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}
object ContextMenuItem {
  
  @scala.inline
  def apply(): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuItem]
  }
  
  @scala.inline
  implicit class ContextMenuItemOps[Self <: ContextMenuItem] (val x: Self) extends AnyVal {
    
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
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubItemsVarargs(value: js.Any*): Self = this.set("subItems", js.Array(value :_*))
    
    @scala.inline
    def setSubItems(value: js.Array[_]): Self = this.set("subItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubItems: Self = this.set("subItems", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
