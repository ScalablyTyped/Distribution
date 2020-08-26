package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCalendarlistUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list
    * method. If you want to access the primary calendar of the currently
    * logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.native
  /**
    * Whether to use the foregroundColor and backgroundColor fields to write
    * the calendar colors (RGB). If this feature is used, the index-based
    * colorId field will be set to the best matching option automatically.
    * Optional. The default is False.
    */
  var colorRgbFormat: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCalendarListEntry] = js.native
}

object ParamsResourceCalendarlistUpdate {
  @scala.inline
  def apply(): ParamsResourceCalendarlistUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCalendarlistUpdate]
  }
  @scala.inline
  implicit class ParamsResourceCalendarlistUpdateOps[Self <: ParamsResourceCalendarlistUpdate] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarId: Self = this.set("calendarId", js.undefined)
    @scala.inline
    def setColorRgbFormat(value: Boolean): Self = this.set("colorRgbFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRgbFormat: Self = this.set("colorRgbFormat", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaCalendarListEntry): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

