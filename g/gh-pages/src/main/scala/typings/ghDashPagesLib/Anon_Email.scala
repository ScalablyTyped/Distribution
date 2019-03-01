package typings
package ghDashPagesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
}

object Anon_Email {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String): Anon_Email = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Email]
  }
}

