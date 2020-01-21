package typings.googleAdwordsScripts

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
  def getCountry(): String = js.native
  def getId(): Double = js.native
  def getPhoneNumber(): String = js.native
  def setCountry(country: String): Unit = js.native
  def setPhoneNumber(phoneNumber: String): Unit = js.native
}

