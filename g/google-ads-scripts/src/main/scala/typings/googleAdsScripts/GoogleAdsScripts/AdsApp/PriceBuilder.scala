package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceBuilder
  extends StObject
     with Builder[PriceOperation] {
  
  def addPriceItem(priceItem: PriceItem): this.type = js.native
  
  def withEndDate(date: String): this.type = js.native
  def withEndDate(date: GoogleAdsDate): this.type = js.native
  
  def withLanguage(language: PriceLanguageType): this.type = js.native
  
  def withMobilePreferred(isMobilePreferred: Boolean): this.type = js.native
  
  def withPriceQualifier(priceQualifier: PriceQualifierType): this.type = js.native
  
  def withPriceType(priceType: PriceTypeType): this.type = js.native
  
  def withSchedules(schedules: js.Array[ExtensionScheduleLiteral]): this.type = js.native
  
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
  
  def withTrackingTemplate(trackingTemplate: String): this.type = js.native
}
