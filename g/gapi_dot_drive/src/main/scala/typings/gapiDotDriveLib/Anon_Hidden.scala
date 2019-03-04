package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hidden extends js.Object {
  var hidden: scala.Boolean
  var modified: scala.Boolean
  var restricted: scala.Boolean
  var starred: scala.Boolean
  var trashed: scala.Boolean
  var viewed: scala.Boolean
}

object Anon_Hidden {
  @scala.inline
  def apply(
    hidden: scala.Boolean,
    modified: scala.Boolean,
    restricted: scala.Boolean,
    starred: scala.Boolean,
    trashed: scala.Boolean,
    viewed: scala.Boolean
  ): Anon_Hidden = {
    val __obj = js.Dynamic.literal(hidden = hidden, modified = modified, restricted = restricted, starred = starred, trashed = trashed, viewed = viewed)
  
    __obj.asInstanceOf[Anon_Hidden]
  }
}

