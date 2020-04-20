package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a bookmark.
  *
  *     // Insert a bookmark at the cursor position and log its ID.
  *     var doc = DocumentApp.getActiveDocument();
  *     var cursor = doc.getCursor();
  *     var bookmark = doc.addBookmark(cursor);
  *     Logger.log(bookmark.getId());
  */
trait Bookmark extends js.Object {
  def getId(): String
  def getPosition(): Position
  def remove(): Unit
}

object Bookmark {
  @scala.inline
  def apply(getId: () => String, getPosition: () => Position, remove: () => Unit): Bookmark = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Bookmark]
  }
}

