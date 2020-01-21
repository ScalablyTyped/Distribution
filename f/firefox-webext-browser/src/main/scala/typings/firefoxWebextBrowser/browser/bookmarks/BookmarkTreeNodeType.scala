package typings.firefoxWebextBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the type of a BookmarkTreeNode, which can be one of bookmark, folder or separator. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
*/
trait BookmarkTreeNodeType extends js.Object

object BookmarkTreeNodeType {
  @scala.inline
  def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def folder: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.folder = this.cast("folder")
  @scala.inline
  def separator: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = this.cast("separator")
}

