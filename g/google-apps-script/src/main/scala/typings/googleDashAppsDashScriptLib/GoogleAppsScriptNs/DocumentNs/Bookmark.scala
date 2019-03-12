package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookmark extends js.Object {
  def getId(): java.lang.String
  def getPosition(): Position
  def remove(): scala.Unit
}

object Bookmark {
  @scala.inline
  def apply(getId: () => java.lang.String, getPosition: () => Position, remove: () => scala.Unit): Bookmark = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[Bookmark]
  }
}

