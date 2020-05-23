package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameIdName extends js.Object {
  /** Open a port to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
  /** Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}

object FrameIdName {
  @scala.inline
  def apply(frameId: js.UndefOr[Double] = js.undefined, name: String = null): FrameIdName = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIdName]
  }
}

