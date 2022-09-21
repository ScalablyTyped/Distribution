package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutBuilder
  extends StObject
     with Builder[CalloutOperation] {
  
  def withEndDate(date: String): this.type = js.native
  def withEndDate(date: GoogleAdsDate): this.type = js.native
  
  def withMobilePreferred(isMobilePreferred: Boolean): this.type = js.native
  
  def withSchedules(schedules: js.Array[ExtensionScheduleLiteral]): this.type = js.native
  
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
  
  def withText(text: String): this.type = js.native
}
