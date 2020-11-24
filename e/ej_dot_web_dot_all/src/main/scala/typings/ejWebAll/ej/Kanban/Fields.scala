package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends js.Object {
  
  /** Get or sets an object that indicates the options to map the cards to the collapsible area.
    * @Default {Object}
    */
  var collapsibleCards: js.UndefOr[FieldsCollapsibleCards] = js.native
  
  /** To customize the card has been Mapped into card color field.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Content field has been Mapped into card text.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.native
  
  /** ImageUrl field has been Mapped into card image.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** The primarykey field is mapped to data source field. And this will used for Drag and drop and editing mainly.
    * @Default {null}
    */
  var primaryKey: js.UndefOr[String] = js.native
  
  /** Priority field has been mapped data source field to maintain cards priority.
    * @Default {null}
    */
  var priority: js.UndefOr[String] = js.native
  
  /** To enable swimlane grouping based on the given key field from datasource mapping.
    * @Default {null}
    */
  var swimlaneKey: js.UndefOr[String] = js.native
  
  /** Tag field has been Mapped into card tag.
    * @Default {null}
    */
  var tag: js.UndefOr[String] = js.native
  
  /** Title field has been Mapped to field in datasource for title content. If title field specified , card expand/collapse will be enabled with header and content section.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
}
object Fields {
  
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    
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
    def setCollapsibleCards(value: FieldsCollapsibleCards): Self = this.set("collapsibleCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsibleCards: Self = this.set("collapsibleCards", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSwimlaneKey(value: String): Self = this.set("swimlaneKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwimlaneKey: Self = this.set("swimlaneKey", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
