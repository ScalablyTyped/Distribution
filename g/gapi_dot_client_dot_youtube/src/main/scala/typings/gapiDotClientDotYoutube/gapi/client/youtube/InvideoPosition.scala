package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoPosition extends js.Object {
  /** Describes in which corner of the video the visual widget will appear. */
  var cornerPosition: js.UndefOr[String] = js.undefined
  /** Defines the position type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object InvideoPosition {
  @scala.inline
  def apply(cornerPosition: String = null, `type`: String = null): InvideoPosition = {
    val __obj = js.Dynamic.literal()
    if (cornerPosition != null) __obj.updateDynamic("cornerPosition")(cornerPosition)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InvideoPosition]
  }
}

