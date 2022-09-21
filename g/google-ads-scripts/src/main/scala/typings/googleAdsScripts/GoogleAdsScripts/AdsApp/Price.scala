package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Price
  extends StObject
     with StatsFor {
  
  def addPriceItem(priceItem: PriceItem): Unit = js.native
  
  def clearEndDate(): Unit = js.native
  
  def clearStartDate(): Unit = js.native
  
  def clearTrackingTemplate(): Unit = js.native
  
  def getEndDate(): GoogleAdsDate = js.native
  
  def getEntityType(): String = js.native
  
  def getId(): Double = js.native
  
  def getLanguage(): String = js.native
  
  def getPriceItems(): js.Array[PriceItem] = js.native
  
  def getPriceQualifier(): String = js.native
  
  def getPriceType(): String = js.native
  
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  
  def getStartDate(): GoogleAdsDate = js.native
  
  def getTrackingTemplate(): String = js.native
  
  def isMobilePreferred(): Boolean = js.native
  
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  def setLanguage(language: PriceLanguageType): Unit = js.native
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  
  def setPriceQualifier(priceQualifier: PriceQualifierType): Unit = js.native
  
  def setPriceType(priceType: PriceTypeType): Unit = js.native
  
  def setSchedules(schedules: js.Array[ExtensionScheduleLiteral]): Unit = js.native
  
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
  
  def setTrackingTemplate(trackingTemplate: String): Unit = js.native
}
