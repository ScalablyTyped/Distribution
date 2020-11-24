package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* urlbar types */
/**
  * The state of an engagement made with the urlbar by the user. `start`: The user has started an engagement. `engagement`: The user has completed an engagement by picking a result. `abandonment`: The user has abandoned their engagement, for example by blurring the urlbar. `discard`: The engagement ended in a way that should be ignored by listeners.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard
*/
trait EngagementState extends js.Object
object EngagementState {
  
  @scala.inline
  def abandonment: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment = "abandonment".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment]
  
  @scala.inline
  def discard: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard = "discard".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard]
  
  @scala.inline
  def engagement: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement = "engagement".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement]
  
  @scala.inline
  def start: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start = "start".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start]
}
