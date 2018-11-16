package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBuilder[Message]
  extends AdWordsBuilder[Message]
     with hasMobilePreferredBuilder[MessageBuilder[Message]]
     with hasStartAndEndDateBuilder[MessageBuilder[Message]]
     with hasSchedulesBuilder[MessageBuilder[Message]] {
  def withBusinessName(businessName: java.lang.String): MessageBuilder[Message] = js.native
  def withCountryCode(countryCode: java.lang.String): MessageBuilder[Message] = js.native
  def withExtensionText(extensionText: java.lang.String): MessageBuilder[Message] = js.native
  def withMessageText(messageText: java.lang.String): MessageBuilder[Message] = js.native
  def withPhoneNumber(phoneNumber: java.lang.String): MessageBuilder[Message] = js.native
}

