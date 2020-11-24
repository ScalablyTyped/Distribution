package typings.firebaseAnalytics.anon

import typings.firebaseAnalytics.firebaseAnalyticsStrings.config
import typings.firebaseAnalytics.firebaseAnalyticsStrings.event
import typings.firebaseAnalytics.firebaseAnalyticsStrings.set
import typings.firebaseAnalyticsTypes.mod.ControlParams
import typings.firebaseAnalyticsTypes.mod.CustomParams
import typings.firebaseAnalyticsTypes.mod.EventParams
import typings.firebaseAnalyticsTypes.mod.Gtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GtagCore extends js.Object {
  
  @JSName("gtagCore")
  var gtagCore_Original: Gtag = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: ControlParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: CustomParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: EventParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_set(command: set, config: CustomParams): Unit = js.native
  
  @JSName("wrappedGtag")
  var wrappedGtag_Original: Gtag = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: ControlParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: CustomParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: EventParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_set(command: set, config: CustomParams): Unit = js.native
}
