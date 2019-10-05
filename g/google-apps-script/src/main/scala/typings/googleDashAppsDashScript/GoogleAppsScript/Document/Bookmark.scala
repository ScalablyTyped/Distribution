package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

