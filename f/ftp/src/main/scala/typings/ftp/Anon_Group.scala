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
    val __obj = js.Dynamic.literal(group = group, other = other, user = user)
  
    __obj.asInstanceOf[Anon_Group]
  }
}

