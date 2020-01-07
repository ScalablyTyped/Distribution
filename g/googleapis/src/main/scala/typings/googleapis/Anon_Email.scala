package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_Email {
  @scala.inline
  def apply(email: String = null, `type`: String = null): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Email]
  }
}

