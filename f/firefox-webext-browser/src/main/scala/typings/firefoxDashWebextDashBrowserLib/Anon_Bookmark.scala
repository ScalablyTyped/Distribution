package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bookmark extends js.Object {
  /**
    * Fired when a bookmark or folder changes. **Note:** Currently, only title and url changes trigger this.
    */
  val onChanged: WebExtEvent[
    js.Function2[/* id */ java.lang.String, /* changeInfo */ Anon_TitleUrl, scala.Unit]
  ] = js.native
  /**
    * Fired when the children of a folder have changed their order due to the order being sorted in the UI. This is
    * not called as a result of a move().
    * @deprecated Unsupported on Firefox at this time.
    */
  val onChildrenReordered: js.UndefOr[
    WebExtEvent[
      js.Function2[/* id */ java.lang.String, /* reorderInfo */ Anon_ChildIds, scala.Unit]
    ]
  ] = js.native
  /* bookmarks events */
  /** Fired when a bookmark or folder is created. */
  val onCreated: WebExtEvent[
    js.Function2[
      /* id */ java.lang.String, 
      /* bookmark */ firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when a bookmark or folder is moved to a different parent folder. */
  val onMoved: WebExtEvent[
    js.Function2[/* id */ java.lang.String, /* moveInfo */ Anon_IndexOldIndex, scala.Unit]
  ] = js.native
  /**
    * Fired when a bookmark or folder is removed. When a folder is removed recursively, a single notification is fired
    * for the folder, and none for its contents.
    */
  val onRemoved: WebExtEvent[
    js.Function2[/* id */ java.lang.String, /* removeInfo */ Anon_IndexNode, scala.Unit]
  ] = js.native
  /**
    * Creates a bookmark or folder under the specified parentId. If url is NULL or missing, it will be a folder.
    */
  def create(bookmark: firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.CreateDetails): js.Promise[
    js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]
  ] = js.native
  /* bookmarks functions */
  /**
    * Retrieves the specified BookmarkTreeNode(s).
    * @param idOrIdList A single string-valued id, or an array of string-valued ids
    */
  def get(idOrIdList: java.lang.String): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  def get(idOrIdList: js.Array[java.lang.String]): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /** Retrieves the children of the specified BookmarkTreeNode id. */
  def getChildren(id: java.lang.String): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /**
    * Retrieves the recently added bookmarks.
    * @param numberOfItems The maximum number of items to return.
    */
  def getRecent(numberOfItems: scala.Double): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /**
    * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
    * @param id The ID of the root of the subtree to retrieve.
    */
  def getSubTree(id: java.lang.String): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /** Retrieves the entire Bookmarks hierarchy. */
  def getTree(): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /** Moves the specified BookmarkTreeNode to the provided location. */
  def move(id: java.lang.String, destination: Anon_Index): js.Promise[
    js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]
  ] = js.native
  /** Removes a bookmark or an empty bookmark folder. */
  def remove(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Recursively removes a bookmark folder. */
  def removeTree(id: java.lang.String): js.Promise[scala.Unit] = js.native
  def search(query: Anon_Query): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /**
    * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce
    * BookmarkTreeNodes matching all specified properties.
    * @param query Either a string of words and quoted phrases that are matched against bookmark URLs and titles, or
    *     an object. If an object, the properties `query`, `url`, and `title` may be specified and bookmarks matching
    *     all specified properties will be produced.
    */
  def search(query: java.lang.String): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]] = js.native
  /**
    * Updates the properties of a bookmark or folder. Specify only the properties that you want to change; unspecified
    * properties will be left unchanged. **Note:** Currently, only 'title' and 'url' are supported.
    */
  def update(id: java.lang.String, changes: Anon_Title): js.Promise[
    js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode]
  ] = js.native
}

