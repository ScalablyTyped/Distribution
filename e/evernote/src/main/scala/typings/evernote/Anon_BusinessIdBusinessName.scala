package typings.evernote

import typings.evernote.evernoteMod.Evernote.BusinessUserRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessIdBusinessName extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var businessName: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[BusinessUserRole] = js.undefined
}

object Anon_BusinessIdBusinessName {
  @scala.inline
  def apply(
    businessId: Int | Double = null,
    businessName: String = null,
    email: String = null,
    role: BusinessUserRole = null
  ): Anon_BusinessIdBusinessName = {
    val __obj = js.Dynamic.literal()
    if (businessId != null) __obj.updateDynamic("businessId")(businessId.asInstanceOf[js.Any])
    if (businessName != null) __obj.updateDynamic("businessName")(businessName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BusinessIdBusinessName]
  }
}

