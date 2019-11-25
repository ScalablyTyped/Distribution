package typings.gapiDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hidden extends js.Object {
  var hidden: Boolean
  var modified: Boolean
  var restricted: Boolean
  var starred: Boolean
  var trashed: Boolean
  var viewed: Boolean
}

object Anon_Hidden {
  @scala.inline
  def apply(
    hidden: Boolean,
    modified: Boolean,
    restricted: Boolean,
    starred: Boolean,
    trashed: Boolean,
    viewed: Boolean
  ): Anon_Hidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], starred = starred.asInstanceOf[js.Any], trashed = trashed.asInstanceOf[js.Any], viewed = viewed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hidden]
  }
}

