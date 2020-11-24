package typings.firefoxWebextBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A node (either a bookmark or a folder) in the bookmark tree. Child nodes are ordered within their parent folder.
  */
@js.native
trait BookmarkTreeNode extends js.Object {
  
  /** An ordered list of children of this node. */
  var children: js.UndefOr[js.Array[BookmarkTreeNode]] = js.native
  
  /** When this node was created, in milliseconds since the epoch (`new Date(dateAdded)`). */
  var dateAdded: js.UndefOr[Double] = js.native
  
  /** When the contents of this folder last changed, in milliseconds since the epoch. */
  var dateGroupModified: js.UndefOr[Double] = js.native
  
  /**
    * The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the browser is restarted.
    */
  var id: String = js.native
  
  /** The 0-based position of this node within its parent folder. */
  var index: js.UndefOr[Double] = js.native
  
  /** The `id` of the parent folder. Omitted for the root node. */
  var parentId: js.UndefOr[String] = js.native
  
  /** The text displayed for the node. */
  var title: String = js.native
  
  /** Indicates the type of the BookmarkTreeNode, which can be one of bookmark, folder or separator. */
  var `type`: js.UndefOr[BookmarkTreeNodeType] = js.native
  
  /**
    * Indicates the reason why this node is unmodifiable. The `managed` value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
    */
  var unmodifiable: js.UndefOr[BookmarkTreeNodeUnmodifiable] = js.native
  
  /** The URL navigated to when a user clicks the bookmark. Omitted for folders. */
  var url: js.UndefOr[String] = js.native
}
object BookmarkTreeNode {
  
  @scala.inline
  def apply(id: String, title: String): BookmarkTreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkTreeNode]
  }
  
  @scala.inline
  implicit class BookmarkTreeNodeOps[Self <: BookmarkTreeNode] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: BookmarkTreeNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[BookmarkTreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDateAdded(value: Double): Self = this.set("dateAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAdded: Self = this.set("dateAdded", js.undefined)
    
    @scala.inline
    def setDateGroupModified(value: Double): Self = this.set("dateGroupModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateGroupModified: Self = this.set("dateGroupModified", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setType(value: BookmarkTreeNodeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnmodifiable(value: BookmarkTreeNodeUnmodifiable): Self = this.set("unmodifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmodifiable: Self = this.set("unmodifiable", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
