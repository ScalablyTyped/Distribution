package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sitelink
  extends StObject
     with StatsFor {
  
  def clearDescription1(): Unit = js.native
  
  def clearDescription2(): Unit = js.native
  
  def clearEndDate(): Unit = js.native
  
  def clearLinkUrl(): Unit = js.native
  
  def clearStartDate(): Unit = js.native
  
  def getDescription1(): String = js.native
  
  def getDescription2(): String = js.native
  
  def getEndDate(): GoogleAdsDate = js.native
  
  def getEntityType(): String = js.native
  
  def getId(): Double = js.native
  
  def getLinkText(): String = js.native
  
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  
  def getStartDate(): GoogleAdsDate = js.native
  
  def getText(): String = js.native
  
  def isMobilePreferred(): Boolean = js.native
  
  def setDescription1(description1: String): Unit = js.native
  
  def setDescription2(description2: String): Unit = js.native
  
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  def setLinkText(linkText: String): Unit = js.native
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  
  def setSchedules(schedules: js.Array[ExtensionScheduleLiteral]): Unit = js.native
  
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
  
  def urls(): SitelinkUrls = js.native
}
