package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Type extends js.Object {
  var `type`: js.UndefOr[String] = js.native
  var userId: js.UndefOr[String] = js.native
}

object Anon_Type {
  @scala.inline
  def apply(`type`: String = null, userId: String = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

