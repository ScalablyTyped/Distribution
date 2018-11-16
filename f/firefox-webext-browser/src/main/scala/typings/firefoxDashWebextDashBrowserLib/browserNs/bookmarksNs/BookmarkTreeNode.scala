package typings
package firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A node (either a bookmark or a folder) in the bookmark tree. Child nodes are ordered within their parent folder.
     */

trait BookmarkTreeNode extends js.Object {
  /** An ordered list of children of this node. */
  var children: js.UndefOr[js.Array[BookmarkTreeNode]] = js.undefined
  /** When this node was created, in milliseconds since the epoch (`new Date(dateAdded)`). */
  var dateAdded: js.UndefOr[scala.Double] = js.undefined
  /** When the contents of this folder last changed, in milliseconds since the epoch. */
  var dateGroupModified: js.UndefOr[scala.Double] = js.undefined
  /**
           * The unique identifier for the node. IDs are unique within the current profile, and they remain valid even
           * after the browser is restarted.
           */
  var id: java.lang.String
  /** The 0-based position of this node within its parent folder. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** The `id` of the parent folder. Omitted for the root node. */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** The text displayed for the node. */
  var title: java.lang.String
  /** Indicates the type of the BookmarkTreeNode, which can be one of bookmark, folder or separator. */
  var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
  /**
           * Indicates the reason why this node is unmodifiable. The `managed` value indicates that this node was
           * configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be
           * modified by the user and the extension (default).
           */
  var unmodifiable: js.UndefOr[BookmarkTreeNodeUnmodifiable] = js.undefined
  /** The URL navigated to when a user clicks the bookmark. Omitted for folders. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

