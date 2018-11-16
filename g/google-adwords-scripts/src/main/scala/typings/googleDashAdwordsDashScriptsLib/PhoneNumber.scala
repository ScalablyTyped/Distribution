package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats {
  def getCountry(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getPhoneNumber(): java.lang.String = js.native
  def setCountry(country: java.lang.String): scala.Unit = js.native
  def setPhoneNumber(phoneNumber: java.lang.String): scala.Unit = js.native
}

