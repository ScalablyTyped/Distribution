package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs.TransitionQualifier
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs.TransitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameIdProcessId extends js.Object {
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique within a tab.
    */
  var frameId: Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double
  /** The time when the navigation was committed, in milliseconds since the epoch. */
  var timeStamp: Double
  /**
    * A list of transition qualifiers.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionQualifiers: js.UndefOr[js.Array[TransitionQualifier]] = js.undefined
  /**
    * Cause of the navigation.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionType: js.UndefOr[TransitionType] = js.undefined
  var url: String
}

object Anon_FrameIdProcessId {
  @scala.inline
  def apply(
    frameId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String,
    processId: Int | Double = null,
    transitionQualifiers: js.Array[TransitionQualifier] = null,
    transitionType: TransitionType = null
  ): Anon_FrameIdProcessId = {
    val __obj = js.Dynamic.literal(frameId = frameId, tabId = tabId, timeStamp = timeStamp, url = url)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (transitionQualifiers != null) __obj.updateDynamic("transitionQualifiers")(transitionQualifiers)
    if (transitionType != null) __obj.updateDynamic("transitionType")(transitionType)
    __obj.asInstanceOf[Anon_FrameIdProcessId]
  }
}

