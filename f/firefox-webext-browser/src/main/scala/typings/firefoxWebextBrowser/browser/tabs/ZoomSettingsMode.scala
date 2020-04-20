package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page;
  * defaults to `automatic`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.automatic
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disabled
*/
trait ZoomSettingsMode extends js.Object

object ZoomSettingsMode {
  @scala.inline
  def automatic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.automatic = "automatic".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.automatic]
  @scala.inline
  def disabled: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disabled = "disabled".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disabled]
  @scala.inline
  def manual: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual = "manual".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual]
}

