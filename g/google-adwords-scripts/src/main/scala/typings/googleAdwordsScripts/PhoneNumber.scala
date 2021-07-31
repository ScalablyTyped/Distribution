package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumber
  extends StObject
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats
     with isAdGroupChild {
  
  def getCountry(): String = js.native
  
  def getId(): Double = js.native
  
  def getPhoneNumber(): String = js.native
  
  def setCountry(country: String): Unit = js.native
  
  def setPhoneNumber(phoneNumber: String): Unit = js.native
}
