package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFacingMessage extends js.Object {
  /**
    * The default message that gets displayed if no localized message is specified, or the user's locale does not match with any of the localized messages. A
    * default message must be provided if any localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String] = js.undefined
  /** A map which contains <locale, message> pairs. The locale is a BCP 47 language code, e.g. en-US, es-ES, fr. */
  var localizedMessages: js.UndefOr[Record[String, String]] = js.undefined
}

object UserFacingMessage {
  @scala.inline
  def apply(defaultMessage: String = null, localizedMessages: Record[String, String] = null): UserFacingMessage = {
    val __obj = js.Dynamic.literal()
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (localizedMessages != null) __obj.updateDynamic("localizedMessages")(localizedMessages)
    __obj.asInstanceOf[UserFacingMessage]
  }
}

