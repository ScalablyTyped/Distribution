package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitelinkBuilder
  extends StObject
     with Builder[SitelinkOperation] {
  
  def withCustomParameters(customParameters: Record[String, String]): this.type = js.native
  
  def withDescription1(description1: String): this.type = js.native
  
  def withDescription2(description2: String): this.type = js.native
  
  def withEndDate(date: String): this.type = js.native
  def withEndDate(date: GoogleAdsDate): this.type = js.native
  
  def withFinalUrl(finalUrl: String): this.type = js.native
  
  def withFinalUrlSuffix(suffix: String): this.type = js.native
  
  def withLinkText(linkText: String): this.type = js.native
  
  def withMobileFinalUrl(mobileFinalUrl: String): this.type = js.native
  
  def withMobilePreferred(isMobilePreferred: Boolean): this.type = js.native
  
  def withSchedules(schedules: js.Array[ExtensionScheduleLiteral]): this.type = js.native
  
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
  
  def withTrackingTemplate(text: String): this.type = js.native
}
