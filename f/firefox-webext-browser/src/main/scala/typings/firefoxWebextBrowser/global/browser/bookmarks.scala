package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.anon.Query
import typings.firefoxWebextBrowser.browser.bookmarks.BookmarkTreeNode
import typings.firefoxWebextBrowser.browser.bookmarks.CreateDetails
import typings.firefoxWebextBrowser.browser.bookmarks.MoveDestination
import typings.firefoxWebextBrowser.browser.bookmarks.OnChangedChangeInfo
import typings.firefoxWebextBrowser.browser.bookmarks.OnChildrenReorderedReorderInfo
import typings.firefoxWebextBrowser.browser.bookmarks.OnMovedMoveInfo
import typings.firefoxWebextBrowser.browser.bookmarks.OnRemovedRemoveInfo
import typings.firefoxWebextBrowser.browser.bookmarks.UpdateChanges
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
  
  @JSGlobal("browser.bookmarks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a bookmark or folder under the specified parentId. If url is NULL or missing, it will be a folder.
    */
  inline def create(bookmark: CreateDetails): js.Promise[BookmarkTreeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(bookmark.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BookmarkTreeNode]]
  
  /* bookmarks functions */
  /**
    * Retrieves the specified BookmarkTreeNode(s).
    * @param idOrIdList A single string-valued id, or an array of string-valued ids
    */
  inline def get(idOrIdList: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(idOrIdList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def get(idOrIdList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(idOrIdList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  
  /** Retrieves the children of the specified BookmarkTreeNode id. */
  inline def getChildren(id: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  
  /**
    * Retrieves the recently added bookmarks.
    * @param numberOfItems The maximum number of items to return.
    */
  inline def getRecent(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecent")(numberOfItems.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  
  /**
    * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
    * @param id The ID of the root of the subtree to retrieve.
    */
  inline def getSubTree(id: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubTree")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  
  /** Retrieves the entire Bookmarks hierarchy. */
  inline def getTree(): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTree")().asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  
  /** Moves the specified BookmarkTreeNode to the provided location. */
  inline def move(id: String, destination: MoveDestination): js.Promise[BookmarkTreeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(id.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BookmarkTreeNode]]
  
  /**
    * Fired when a bookmark or folder changes. **Note:** Currently, only title and url changes trigger this.
    */
  @JSGlobal("browser.bookmarks.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function2[/* id */ String, /* changeInfo */ OnChangedChangeInfo, Unit]] = js.native
  
  /**
    * Fired when the children of a folder have changed their order due to the order being sorted in the UI. This is not called as a result of a move().
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.bookmarks.onChildrenReordered")
  @js.native
  val onChildrenReordered: js.UndefOr[
    WebExtEvent[
      js.Function2[/* id */ String, /* reorderInfo */ OnChildrenReorderedReorderInfo, Unit]
    ]
  ] = js.native
  
  /* bookmarks events */
  /** Fired when a bookmark or folder is created. */
  @JSGlobal("browser.bookmarks.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function2[/* id */ String, /* bookmark */ BookmarkTreeNode, Unit]] = js.native
  
  /** Fired when a bookmark or folder is moved to a different parent folder. */
  @JSGlobal("browser.bookmarks.onMoved")
  @js.native
  val onMoved: WebExtEvent[js.Function2[/* id */ String, /* moveInfo */ OnMovedMoveInfo, Unit]] = js.native
  
  /**
    * Fired when a bookmark or folder is removed. When a folder is removed recursively, a single notification is fired for the folder, and none for its contents.
    */
  @JSGlobal("browser.bookmarks.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function2[/* id */ String, /* removeInfo */ OnRemovedRemoveInfo, Unit]] = js.native
  
  /** Removes a bookmark or an empty bookmark folder. */
  inline def remove(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Recursively removes a bookmark folder. */
  inline def removeTree(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTree")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce BookmarkTreeNodes matching all specified properties.
    * @param query Either a string of words that are matched against bookmark URLs and titles, or an object. If an object, the properties `query`, `url`, and `title` may be specified and bookmarks matching all specified properties will be produced.
    */
  inline def search(query: String): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  inline def search(query: Query): js.Promise[js.Array[BookmarkTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BookmarkTreeNode]]]
  
  /**
    * Updates the properties of a bookmark or folder. Specify only the properties that you want to change; unspecified properties will be left unchanged. **Note:** Currently, only 'title' and 'url' are supported.
    */
  inline def update(id: String, changes: UpdateChanges): js.Promise[BookmarkTreeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BookmarkTreeNode]]
}
