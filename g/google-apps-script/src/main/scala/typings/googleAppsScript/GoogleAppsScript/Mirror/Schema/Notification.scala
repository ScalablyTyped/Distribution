package typings.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var collection: js.UndefOr[String] = js.native
  var itemId: js.UndefOr[String] = js.native
  var operation: js.UndefOr[String] = js.native
  var userActions: js.UndefOr[js.Array[UserAction]] = js.native
  var userToken: js.UndefOr[String] = js.native
  var verifyToken: js.UndefOr[String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setUserActionsVarargs(value: UserAction*): Self = this.set("userActions", js.Array(value :_*))
    @scala.inline
    def setUserActions(value: js.Array[UserAction]): Self = this.set("userActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserActions: Self = this.set("userActions", js.undefined)
    @scala.inline
    def setUserToken(value: String): Self = this.set("userToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserToken: Self = this.set("userToken", js.undefined)
    @scala.inline
    def setVerifyToken(value: String): Self = this.set("verifyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyToken: Self = this.set("verifyToken", js.undefined)
  }
  
}

