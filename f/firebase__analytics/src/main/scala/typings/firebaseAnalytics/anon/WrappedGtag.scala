package typings.firebaseAnalytics.anon

import typings.firebaseAnalytics.distSrcPublicTypesMod.ConsentSettings
import typings.firebaseAnalytics.distSrcPublicTypesMod.ControlParams
import typings.firebaseAnalytics.distSrcPublicTypesMod.CustomParams
import typings.firebaseAnalytics.distSrcPublicTypesMod.EventParams
import typings.firebaseAnalytics.distSrcTypesMod.Gtag
import typings.firebaseAnalytics.firebaseAnalyticsStrings.config
import typings.firebaseAnalytics.firebaseAnalyticsStrings.consent
import typings.firebaseAnalytics.firebaseAnalyticsStrings.default
import typings.firebaseAnalytics.firebaseAnalyticsStrings.event
import typings.firebaseAnalytics.firebaseAnalyticsStrings.set
import typings.firebaseAnalytics.firebaseAnalyticsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedGtag extends StObject {
  
  def gtagCore(command: consent, subCommand: default | update, consentSettings: ConsentSettings): Unit
  @JSName("gtagCore")
  var gtagCore_Original: Gtag
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String): Unit
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: ControlParams): Unit
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: CustomParams): Unit
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: EventParams): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: ControlParams): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: CustomParams): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: EventParams): Unit
  @JSName("gtagCore")
  def gtagCore_set(command: set, config: CustomParams): Unit
  
  def wrappedGtag(command: consent, subCommand: default | update, consentSettings: ConsentSettings): Unit
  @JSName("wrappedGtag")
  var wrappedGtag_Original: Gtag
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: ControlParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: CustomParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: EventParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: ControlParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: CustomParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: EventParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_set(command: set, config: CustomParams): Unit
}
object WrappedGtag {
  
  inline def apply(gtagCore: Gtag, wrappedGtag: Gtag): WrappedGtag = {
    val __obj = js.Dynamic.literal(gtagCore = gtagCore.asInstanceOf[js.Any], wrappedGtag = wrappedGtag.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedGtag]
  }
  
  extension [Self <: WrappedGtag](x: Self) {
    
    inline def setGtagCore(value: Gtag): Self = StObject.set(x, "gtagCore", value.asInstanceOf[js.Any])
    
    inline def setWrappedGtag(value: Gtag): Self = StObject.set(x, "wrappedGtag", value.asInstanceOf[js.Any])
  }
}
