package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends js.Object {
  
  /** It receives the child level or inner level data source such as Essential DataManager object and JSON object.
    */
  var child: js.UndefOr[js.Any] = js.native
  
  /** It receives Essential DataManager object and JSON object.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Specifies the node to be in expanded state.
    */
  var expanded: js.UndefOr[String] = js.native
  
  /** Its allow us to indicate whether the node has child or not in load on demand
    */
  var hasChild: js.UndefOr[String] = js.native
  
  /** Specifies the HTML Attributes to &quot;li&quot; item list.
    */
  var htmlAttribute: js.UndefOr[js.Any] = js.native
  
  /** Specifies the id to TreeView node items list.
    */
  var id: js.UndefOr[String] = js.native
  
  /** Specifies the image attribute to â€œimgâ€ tag inside items list
    */
  var imageAttribute: js.UndefOr[js.Any] = js.native
  
  /** Specifies the HTML Attributes to &quot;li&quot; item list.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** If its true Checkbox node will be checked when rendered with checkbox.
    */
  var isChecked: js.UndefOr[String] = js.native
  
  /** Specifies the link attribute to â€œaâ€ tag in item list.
    */
  var linkAttribute: js.UndefOr[js.Any] = js.native
  
  /** Specifies the parent id of the node. The nodes are listed as child nodes of the specified parent node by using its parent id.
    */
  var parentId: js.UndefOr[String] = js.native
  
  /** It receives query to retrieve data from the table (query is same as SQL).
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Allow us to specify the node to be in selected state
    */
  var selected: js.UndefOr[String] = js.native
  
  /** Specifies the sprite CSS class to &quot;li&quot; item list.
    */
  var spriteCssClass: js.UndefOr[String] = js.native
  
  /** It receives the table name to execute query on the corresponding table.
    */
  var tableName: js.UndefOr[String] = js.native
  
  /** Specifies the text of TreeView node items list.
    */
  var text: js.UndefOr[String] = js.native
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
    def setChild(value: js.Any): Self = this.set("child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExpanded(value: String): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHasChild(value: String): Self = this.set("hasChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChild: Self = this.set("hasChild", js.undefined)
    
    @scala.inline
    def setHtmlAttribute(value: js.Any): Self = this.set("htmlAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttribute: Self = this.set("htmlAttribute", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageAttribute(value: js.Any): Self = this.set("imageAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageAttribute: Self = this.set("imageAttribute", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setIsChecked(value: String): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    
    @scala.inline
    def setLinkAttribute(value: js.Any): Self = this.set("linkAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkAttribute: Self = this.set("linkAttribute", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpriteCssClass: Self = this.set("spriteCssClass", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
