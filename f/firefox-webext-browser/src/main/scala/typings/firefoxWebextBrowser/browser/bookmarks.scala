package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.managed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @js.native
  trait BookmarkTreeNode extends StObject {
    
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
    implicit class BookmarkTreeNodeMutableBuilder[Self <: BookmarkTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[BookmarkTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: BookmarkTreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDateAdded(value: Double): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
      
      @scala.inline
      def setDateGroupModified(value: Double): Self = StObject.set(x, "dateGroupModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateGroupModifiedUndefined: Self = StObject.set(x, "dateGroupModified", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: BookmarkTreeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmodifiable(value: BookmarkTreeNodeUnmodifiable): Self = StObject.set(x, "unmodifiable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmodifiableUndefined: Self = StObject.set(x, "unmodifiable", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
    
    @scala.inline
    def folder: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder = "folder".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder]
    
    @scala.inline
    def separator: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = "separator".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator]
  }
  
  /* bookmarks types */
  /**
    * Indicates the reason why this node is unmodifiable. The `managed` value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
    */
  type BookmarkTreeNodeUnmodifiable = managed
  
  /** Object passed to the create() function. */
  @js.native
  trait CreateDetails extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    /** Defaults to the Other Bookmarks folder. */
    var parentId: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    /** Indicates the type of BookmarkTreeNode to create, which can be one of bookmark, folder or separator. */
    var `type`: js.UndefOr[BookmarkTreeNodeType] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object CreateDetails {
    
    @scala.inline
    def apply(): CreateDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDetails]
    }
    
    @scala.inline
    implicit class CreateDetailsMutableBuilder[Self <: CreateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: BookmarkTreeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait MoveDestination extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    var parentId: js.UndefOr[String] = js.native
  }
  object MoveDestination {
    
    @scala.inline
    def apply(): MoveDestination = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveDestination]
    }
    
    @scala.inline
    implicit class MoveDestinationMutableBuilder[Self <: MoveDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
  
  @js.native
  trait OnChangedChangeInfo extends StObject {
    
    var title: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object OnChangedChangeInfo {
    
    @scala.inline
    def apply(title: String): OnChangedChangeInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangedChangeInfo]
    }
    
    @scala.inline
    implicit class OnChangedChangeInfoMutableBuilder[Self <: OnChangedChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait OnChildrenReorderedReorderInfo extends StObject {
    
    var childIds: js.Array[String] = js.native
  }
  object OnChildrenReorderedReorderInfo {
    
    @scala.inline
    def apply(childIds: js.Array[String]): OnChildrenReorderedReorderInfo = {
      val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChildrenReorderedReorderInfo]
    }
    
    @scala.inline
    implicit class OnChildrenReorderedReorderInfoMutableBuilder[Self <: OnChildrenReorderedReorderInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildIds(value: js.Array[String]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdsVarargs(value: String*): Self = StObject.set(x, "childIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OnMovedMoveInfo extends StObject {
    
    var index: Double = js.native
    
    var oldIndex: Double = js.native
    
    var oldParentId: String = js.native
    
    var parentId: String = js.native
  }
  object OnMovedMoveInfo {
    
    @scala.inline
    def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): OnMovedMoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnMovedMoveInfo]
    }
    
    @scala.inline
    implicit class OnMovedMoveInfoMutableBuilder[Self <: OnMovedMoveInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldParentId(value: String): Self = StObject.set(x, "oldParentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnRemovedRemoveInfo extends StObject {
    
    var index: Double = js.native
    
    var node: BookmarkTreeNode = js.native
    
    var parentId: String = js.native
  }
  object OnRemovedRemoveInfo {
    
    @scala.inline
    def apply(index: Double, node: BookmarkTreeNode, parentId: String): OnRemovedRemoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnRemovedRemoveInfo]
    }
    
    @scala.inline
    implicit class OnRemovedRemoveInfoMutableBuilder[Self <: OnRemovedRemoveInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: BookmarkTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateChanges extends StObject {
    
    var title: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object UpdateChanges {
    
    @scala.inline
    def apply(): UpdateChanges = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateChanges]
    }
    
    @scala.inline
    implicit class UpdateChangesMutableBuilder[Self <: UpdateChanges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
