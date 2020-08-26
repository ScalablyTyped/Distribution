package typings.googleCloudStorage.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNotificationOptions extends js.Object {
  /**
    * Automatically create the object if it does not exist. Default: `false`.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the project which will be billed for the request.
    */
  var userProject: js.UndefOr[String] = js.native
}

object GetNotificationOptions {
  @scala.inline
  def apply(): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationOptions]
  }
  @scala.inline
  implicit class GetNotificationOptionsOps[Self <: GetNotificationOptions] (val x: Self) extends AnyVal {
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
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

