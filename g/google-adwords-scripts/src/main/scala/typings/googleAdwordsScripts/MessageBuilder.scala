package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBuilder[Message]
  extends AdWordsBuilder[Message]
     with hasMobilePreferredBuilder[MessageBuilder[Message]]
     with hasStartAndEndDateBuilder[MessageBuilder[Message]]
     with hasSchedulesBuilder[MessageBuilder[Message]] {
  def withBusinessName(businessName: String): MessageBuilder[Message] = js.native
  def withCountryCode(countryCode: String): MessageBuilder[Message] = js.native
  def withExtensionText(extensionText: String): MessageBuilder[Message] = js.native
  def withMessageText(messageText: String): MessageBuilder[Message] = js.native
  def withPhoneNumber(phoneNumber: String): MessageBuilder[Message] = js.native
}

