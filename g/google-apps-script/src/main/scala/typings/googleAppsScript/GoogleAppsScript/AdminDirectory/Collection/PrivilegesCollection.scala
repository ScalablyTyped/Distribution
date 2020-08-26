package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Privileges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivilegesCollection extends js.Object {
  // Retrieves a paginated list of all privileges for a customer.
  def list(customer: String): Privileges = js.native
}

object PrivilegesCollection {
  @scala.inline
  def apply(list: String => Privileges): PrivilegesCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PrivilegesCollection]
  }
  @scala.inline
  implicit class PrivilegesCollectionOps[Self <: PrivilegesCollection] (val x: Self) extends AnyVal {
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
    def setList(value: String => Privileges): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

