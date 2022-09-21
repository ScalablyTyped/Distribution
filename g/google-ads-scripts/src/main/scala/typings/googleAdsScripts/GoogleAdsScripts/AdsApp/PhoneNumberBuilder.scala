package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberBuilder
  extends StObject
     with Builder[PhoneNumberOperation] {
  
  def withAppId(appId: String): this.type = js.native
  
  def withCustomParameters(customParameters: String): this.type = js.native
  
  def withEndDate(date: String): this.type = js.native
  def withEndDate(date: GoogleAdsDate): this.type = js.native
  
  def withFinalUrl(finalUrl: String): this.type = js.native
  
  def withFinalUrlSuffix(suffix: String): this.type = js.native
  
  def withLinkText(linkText: String): this.type = js.native
  
  def withMessageText(messageText: String): this.type = js.native
  
  def withMobileFinalUrl(mobileFinalUrl: String): this.type = js.native
  
  def withMobilePreferred(isMobilePreferred: Boolean): this.type = js.native
  
  def withSchedules(schedules: js.Array[ExtensionScheduleLiteral]): this.type = js.native
  
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
  
  def withStore(store: String): this.type = js.native
  
  def withTrackingTemplate(trackingTemplate: String): this.type = js.native
}
