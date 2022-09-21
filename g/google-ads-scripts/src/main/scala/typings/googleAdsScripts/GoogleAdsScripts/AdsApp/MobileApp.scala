package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileApp
  extends StObject
     with StatsFor {
  
  def clearEndDate(): Unit = js.native
  
  def clearLinkUrl(): Unit = js.native
  
  def clearStartDate(): Unit = js.native
  
  def getAppId(): String = js.native
  
  def getEndDate(): GoogleAdsDate = js.native
  
  def getEntityType(): String = js.native
  
  def getExtensionText(): String = js.native
  
  def getId(): Double = js.native
  
  def getLinkText(): String = js.native
  
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  
  def getStartDate(): GoogleAdsDate = js.native
  
  def getStore(): String = js.native
  
  def isMobilePreferred(): Boolean = js.native
  
  def setAppId(appId: String): Unit = js.native
  
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  def setLinkText(linkText: String): Unit = js.native
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  
  def setSchedules(schedules: js.Array[ExtensionScheduleLiteral]): Unit = js.native
  
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
  
  def setStore(store: String): Unit = js.native
  
  def urls(): MobileAppUrls = js.native
}
