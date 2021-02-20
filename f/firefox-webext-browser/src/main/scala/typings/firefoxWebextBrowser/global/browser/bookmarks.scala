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
    * Creates a bookmark or folder under the specified parentId. If url is NULL or missing, it will be a folder.
    */
  @JSGlobal("browser.bookmarks.create")
  @js.native
  def create(bookmark: CreateDetails): js.Promise[BookmarkTreeNode] = js.native
  
  /* bookmarks functions */
  /**
    * Retrieves the specified BookmarkTreeNode(s).
    * @param idOrIdList A single string-valued id, or an array of string-valued ids
    */
  @JSGlobal("browser.bookmarks.get")
  @js.native
  def get(idOrIdList: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  @JSGlobal("browser.bookmarks.get")
  @js.native
  def get(idOrIdList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /** Retrieves the children of the specified BookmarkTreeNode id. */
  @JSGlobal("browser.bookmarks.getChildren")
  @js.native
  def getChildren(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /**
    * Retrieves the recently added bookmarks.
    * @param numberOfItems The maximum number of items to return.
    */
  @JSGlobal("browser.bookmarks.getRecent")
  @js.native
  def getRecent(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /**
    * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
    * @param id The ID of the root of the subtree to retrieve.
    */
  @JSGlobal("browser.bookmarks.getSubTree")
  @js.native
  def getSubTree(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /** Retrieves the entire Bookmarks hierarchy. */
  @JSGlobal("browser.bookmarks.getTree")
  @js.native
  def getTree(): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /** Moves the specified BookmarkTreeNode to the provided location. */
  @JSGlobal("browser.bookmarks.move")
  @js.native
  def move(id: String, destination: MoveDestination): js.Promise[BookmarkTreeNode] = js.native
  
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
  @JSGlobal("browser.bookmarks.remove")
  @js.native
  def remove(id: String): js.Promise[Unit] = js.native
  
  /** Recursively removes a bookmark folder. */
  @JSGlobal("browser.bookmarks.removeTree")
  @js.native
  def removeTree(id: String): js.Promise[Unit] = js.native
  
  /**
    * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce BookmarkTreeNodes matching all specified properties.
    * @param query Either a string of words that are matched against bookmark URLs and titles, or an object. If an object, the properties `query`, `url`, and `title` may be specified and bookmarks matching all specified properties will be produced.
    */
  @JSGlobal("browser.bookmarks.search")
  @js.native
  def search(query: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  @JSGlobal("browser.bookmarks.search")
  @js.native
  def search(query: Query): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /**
    * Updates the properties of a bookmark or folder. Specify only the properties that you want to change; unspecified properties will be left unchanged. **Note:** Currently, only 'title' and 'url' are supported.
    */
  @JSGlobal("browser.bookmarks.update")
  @js.native
  def update(id: String, changes: UpdateChanges): js.Promise[BookmarkTreeNode] = js.native
}
