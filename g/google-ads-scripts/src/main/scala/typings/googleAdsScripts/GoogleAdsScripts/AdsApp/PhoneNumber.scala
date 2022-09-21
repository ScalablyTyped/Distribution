package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumber
  extends StObject
     with StatsFor {
  
  def clearEndDate(): Unit = js.native
  
  def clearStartDate(): Unit = js.native
  
  def getCountry(): String = js.native
  
  def getEndDate(): GoogleAdsDate = js.native
  
  def getEntityType(): String = js.native
  
  def getId(): Double = js.native
  
  def getPhoneNumber(): String = js.native
  
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  
  def getStartDate(): GoogleAdsDate = js.native
  
  def isMobilePreferred(): Boolean = js.native
  
  def setCountry(appId: String): Unit = js.native
  
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  
  def setPhoneNumber(isMobilePreferred: Boolean): Unit = js.native
  
  def setSchedules(schedules: js.Array[ExtensionScheduleLiteral]): Unit = js.native
  
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
}
