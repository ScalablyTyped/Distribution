package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules
     with hasStats {
  def getBusinessName(): java.lang.String = js.native
  def getCountryCode(): java.lang.String = js.native
  def getExtensionText(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getMessageText(): java.lang.String = js.native
  def getPhoneNumber(): java.lang.String = js.native
  def setBusinessName(businessName: java.lang.String): scala.Unit = js.native
  def setCountryCode(countryCode: java.lang.String): scala.Unit = js.native
  def setExtensionText(extensionText: java.lang.String): scala.Unit = js.native
  def setMessageText(messageText: java.lang.String): scala.Unit = js.native
  def setPhoneNumber(phoneNumber: java.lang.String): scala.Unit = js.native
}

