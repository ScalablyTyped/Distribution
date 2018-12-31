package typings
package firefoxDashWebextDashBrowserLib.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tab sharing state for screen, microphone and camera. */
trait SharingState extends js.Object {
  /** True if the tab is using the camera. */
  var camera: scala.Boolean
  /** True if the tab is using the microphone. */
  var microphone: scala.Boolean
  /**
    * If the tab is sharing the screen the value will be one of "Screen", "Window", or "Application", or undefined
    * if not screen sharing.
    */
  var screen: js.UndefOr[java.lang.String] = js.undefined
}

