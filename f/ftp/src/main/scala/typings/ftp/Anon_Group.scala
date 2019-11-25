package typings.ftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  /**
  			 * An empty string or any combination of 'r', 'w', 'x'.
  			 */
  var group: String
  /**
  			 * An empty string or any combination of 'r', 'w', 'x'.
  			 */
  var other: String
  /**
  			 * An empty string or any combination of 'r', 'w', 'x'.
  			 */
  var user: String
}

object Anon_Group {
  @scala.inline
  def apply(group: String, other: String, user: String): Anon_Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Group]
  }
}

