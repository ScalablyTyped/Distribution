package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserFacingMessage extends js.Object {
  /**
    * The default message that gets displayed if no localized message is specified, or the user's locale does not match with any of the localized messages. A
    * default message must be provided if any localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String] = js.native
  /** A map which contains <locale, message> pairs. The locale is a BCP 47 language code, e.g. en-US, es-ES, fr. */
  var localizedMessages: js.UndefOr[Record[String, String]] = js.native
}

object UserFacingMessage {
  @scala.inline
  def apply(): UserFacingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFacingMessage]
  }
  @scala.inline
  implicit class UserFacingMessageOps[Self <: UserFacingMessage] (val x: Self) extends AnyVal {
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
    def setDefaultMessage(value: String): Self = this.set("defaultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessage: Self = this.set("defaultMessage", js.undefined)
    @scala.inline
    def setLocalizedMessages(value: Record[String, String]): Self = this.set("localizedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedMessages: Self = this.set("localizedMessages", js.undefined)
  }
  
}

