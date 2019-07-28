package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameIdName extends js.Object {
  /** Open a port to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
  /** Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}

object Anon_FrameIdName {
  @scala.inline
  def apply(frameId: Int | Double = null, name: String = null): Anon_FrameIdName = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_FrameIdName]
  }
}

