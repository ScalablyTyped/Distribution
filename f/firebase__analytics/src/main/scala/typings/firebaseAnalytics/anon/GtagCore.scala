package typings.firebaseAnalytics.anon

import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.ConsentSettings
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.ControlParams
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.CustomParams
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventParams
import typings.firebaseAnalytics.distEsmSrcTypesMod.Gtag
import typings.firebaseAnalytics.firebaseAnalyticsStrings.config
import typings.firebaseAnalytics.firebaseAnalyticsStrings.consent
import typings.firebaseAnalytics.firebaseAnalyticsStrings.default
import typings.firebaseAnalytics.firebaseAnalyticsStrings.event
import typings.firebaseAnalytics.firebaseAnalyticsStrings.set
import typings.firebaseAnalytics.firebaseAnalyticsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GtagCore extends StObject {
  
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
object GtagCore {
  
  inline def apply(gtagCore: Gtag, wrappedGtag: Gtag): GtagCore = {
    val __obj = js.Dynamic.literal(gtagCore = gtagCore.asInstanceOf[js.Any], wrappedGtag = wrappedGtag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GtagCore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GtagCore] (val x: Self) extends AnyVal {
    
    inline def setGtagCore(value: Gtag): Self = StObject.set(x, "gtagCore", value.asInstanceOf[js.Any])
    
    inline def setWrappedGtag(value: Gtag): Self = StObject.set(x, "wrappedGtag", value.asInstanceOf[js.Any])
  }
}
