package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message
  extends StObject
     with StatsFor {
  
  def clearEndDate(): Unit = js.native
  
  def clearStartDate(): Unit = js.native
  
  def getBusinessName(): String = js.native
  
  def getCountryCode(): String = js.native
  
  def getEndDate(): GoogleAdsDate = js.native
  
  def getEntityType(): String = js.native
  
  def getExtensionText(): String = js.native
  
  def getId(): Double = js.native
  
  def getMessageText(): String = js.native
  
  def getPhoneNumber(): String = js.native
  
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  
  def getStartDate(): GoogleAdsDate = js.native
  
  def isMobilePreferred(): Boolean = js.native
  
  def setBusinessName(businessName: String): Unit = js.native
  
  def setCountryCode(countryCode: String): Unit = js.native
  
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  def setExtensionText(extensionText: String): Unit = js.native
  
  def setMessageText(messageText: String): Unit = js.native
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  
  def setPhoneNumber(phoneNumber: String): Unit = js.native
  
  def setSchedules(schedules: js.Array[ExtensionScheduleLiteral]): Unit = js.native
  
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
}
