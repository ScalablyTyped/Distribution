package typings
package ftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  /**
  			 * An empty string or any combination of 'r', 'w', 'x'.
  			 */
  var group: java.lang.String
  /**
  			 * An empty string or any combination of 'r', 'w', 'x'.
  			 */
  var other: java.lang.String
  /**
  			 * An empty string or any combination of 'r', 'w', 'x'.
  			 */
  var user: java.lang.String
}

object Anon_Group {
  @scala.inline
  def apply(group: java.lang.String, other: java.lang.String, user: java.lang.String): Anon_Group = {
    val __obj = js.Dynamic.literal(group = group, other = other, user = user)
  
    __obj.asInstanceOf[Anon_Group]
  }
}

