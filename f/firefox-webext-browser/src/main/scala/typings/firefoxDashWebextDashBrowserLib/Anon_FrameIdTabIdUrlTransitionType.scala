package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameIdTabIdUrlTransitionType extends js.Object {
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique within a tab.
    */
  var frameId: scala.Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the tab in which the navigation occurs. */
  var tabId: scala.Double
  /** The time when the navigation was committed, in milliseconds since the epoch. */
  var timeStamp: scala.Double
  /**
    * A list of transition qualifiers.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionQualifiers: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs.TransitionQualifier]
  ] = js.undefined
  /**
    * Cause of the navigation.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionType: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs.TransitionType] = js.undefined
  var url: java.lang.String
}

