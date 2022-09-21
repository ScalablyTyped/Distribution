package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.managed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
  *
  * Permissions: `bookmarks`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object bookmarks {
  
  /**
    * A node (either a bookmark or a folder) in the bookmark tree. Child nodes are ordered within their parent folder.
    */
  trait BookmarkTreeNode extends StObject {
    
    /** An ordered list of children of this node. */
    var children: js.UndefOr[js.Array[BookmarkTreeNode]] = js.undefined
    
    /** When this node was created, in milliseconds since the epoch (`new Date(dateAdded)`). */
    var dateAdded: js.UndefOr[Double] = js.undefined
    
    /** When the contents of this folder last changed, in milliseconds since the epoch. */
    var dateGroupModified: js.UndefOr[Double] = js.undefined
    
    /**
      * The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the browser is restarted.
      */
    var id: String
    
    /** The 0-based position of this node within its parent folder. */
    var index: js.UndefOr[Double] = js.undefined
    
    /** The `id` of the parent folder. Omitted for the root node. */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** The text displayed for the node. */
    var title: String
    
    /** Indicates the type of the BookmarkTreeNode, which can be one of bookmark, folder or separator. */
    var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
    
    /**
      * Indicates the reason why this node is unmodifiable. The `managed` value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
      */
    var unmodifiable: js.UndefOr[BookmarkTreeNodeUnmodifiable] = js.undefined
    
    /** The URL navigated to when a user clicks the bookmark. Omitted for folders. */
    var url: js.UndefOr[String] = js.undefined
  }
  object BookmarkTreeNode {
    
    inline def apply(id: String, title: String): BookmarkTreeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkTreeNode]
    }
    
    extension [Self <: BookmarkTreeNode](x: Self) {
      
      inline def setChildren(value: js.Array[BookmarkTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: BookmarkTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDateAdded(value: Double): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
      
      inline def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
      
      inline def setDateGroupModified(value: Double): Self = StObject.set(x, "dateGroupModified", value.asInstanceOf[js.Any])
      
      inline def setDateGroupModifiedUndefined: Self = StObject.set(x, "dateGroupModified", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: BookmarkTreeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnmodifiable(value: BookmarkTreeNodeUnmodifiable): Self = StObject.set(x, "unmodifiable", value.asInstanceOf[js.Any])
      
      inline def setUnmodifiableUndefined: Self = StObject.set(x, "unmodifiable", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /** Indicates the type of a BookmarkTreeNode, which can be one of bookmark, folder or separator. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
  */
  trait BookmarkTreeNodeType extends StObject
  object BookmarkTreeNodeType {
    
    inline def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
    
    inline def folder: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder = "folder".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder]
    
    inline def separator: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = "separator".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator]
  }
  
  /* bookmarks types */
  /**
    * Indicates the reason why this node is unmodifiable. The `managed` value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
    */
  type BookmarkTreeNodeUnmodifiable = managed
  
  /** Object passed to the create() function. */
  trait CreateDetails extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    /** Defaults to the Other Bookmarks folder. */
    var parentId: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    /** Indicates the type of BookmarkTreeNode to create, which can be one of bookmark, folder or separator. */
    var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CreateDetails {
    
    inline def apply(): CreateDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDetails]
    }
    
    extension [Self <: CreateDetails](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: BookmarkTreeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait MoveDestination extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parentId: js.UndefOr[String] = js.undefined
  }
  object MoveDestination {
    
    inline def apply(): MoveDestination = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveDestination]
    }
    
    extension [Self <: MoveDestination](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
  
  trait OnChangedChangeInfo extends StObject {
    
    var title: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object OnChangedChangeInfo {
    
    inline def apply(title: String): OnChangedChangeInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangedChangeInfo]
    }
    
    extension [Self <: OnChangedChangeInfo](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait OnChildrenReorderedReorderInfo extends StObject {
    
    var childIds: js.Array[String]
  }
  object OnChildrenReorderedReorderInfo {
    
    inline def apply(childIds: js.Array[String]): OnChildrenReorderedReorderInfo = {
      val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChildrenReorderedReorderInfo]
    }
    
    extension [Self <: OnChildrenReorderedReorderInfo](x: Self) {
      
      inline def setChildIds(value: js.Array[String]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      inline def setChildIdsVarargs(value: String*): Self = StObject.set(x, "childIds", js.Array(value*))
    }
  }
  
  trait OnMovedMoveInfo extends StObject {
    
    var index: Double
    
    var oldIndex: Double
    
    var oldParentId: String
    
    var parentId: String
  }
  object OnMovedMoveInfo {
    
    inline def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): OnMovedMoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnMovedMoveInfo]
    }
    
    extension [Self <: OnMovedMoveInfo](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setOldParentId(value: String): Self = StObject.set(x, "oldParentId", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnRemovedRemoveInfo extends StObject {
    
    var index: Double
    
    var node: BookmarkTreeNode
    
    var parentId: String
  }
  object OnRemovedRemoveInfo {
    
    inline def apply(index: Double, node: BookmarkTreeNode, parentId: String): OnRemovedRemoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnRemovedRemoveInfo]
    }
    
    extension [Self <: OnRemovedRemoveInfo](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNode(value: BookmarkTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateChanges extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UpdateChanges {
    
    inline def apply(): UpdateChanges = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateChanges]
    }
    
    extension [Self <: UpdateChanges](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
