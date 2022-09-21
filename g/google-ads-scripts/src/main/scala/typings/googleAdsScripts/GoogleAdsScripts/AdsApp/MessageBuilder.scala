package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBuilder
  extends StObject
     with Builder[MessageOperation] {
  
  def withBusinessName(businessName: String): this.type = js.native
  
  def withCountryCode(countryCode: String): this.type = js.native
  
  def withEndDate(date: String): this.type = js.native
  def withEndDate(date: GoogleAdsDate): this.type = js.native
  
  def withExtensionText(extensionText: String): this.type = js.native
  
  def withMessageText(messageText: String): this.type = js.native
  
  def withMobilePreferred(isMobilePreferred: Boolean): this.type = js.native
  
  def withPhoneNumber(phoneNumber: String): this.type = js.native
  
  def withSchedules(schedules: js.Array[ExtensionScheduleLiteral]): this.type = js.native
  
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
}
