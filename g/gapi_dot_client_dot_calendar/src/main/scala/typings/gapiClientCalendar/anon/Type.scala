package typings.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /**
    * The type of the scope. Possible values are:
    * - "default" - The public scope. This is the default value.
    * - "user" - Limits the scope to a single user.
    * - "group" - Limits the scope to a group.
    * - "domain" - Limits the scope to a domain.  Note: The permissions granted to the "default", or public, scope apply to any user, authenticated or not.
    */
  var `type`: js.UndefOr[String] = js.native
  /** The email address of a user or group, or the name of a domain, depending on the scope type. Omitted for type "default". */
  var value: js.UndefOr[String] = js.native
}

object Type {
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

