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
  def apply(
    getId: js.Function0[java.lang.String],
    getPosition: js.Function0[Position],
    remove: js.Function0[scala.Unit]
  ): Bookmark = {
    val __obj = js.Dynamic.literal(getId = getId, getPosition = getPosition, remove = remove)
  
    __obj.asInstanceOf[Bookmark]
  }
}

