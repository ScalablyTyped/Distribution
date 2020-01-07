package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the spatial position of a visual widget inside a video. It is a
  * union of various position types, out of which only will be set one.
  */
@js.native
trait Schema$InvideoPosition extends js.Object {
  /**
    * Describes in which corner of the video the visual widget will appear.
    */
  var cornerPosition: js.UndefOr[String] = js.native
  /**
    * Defines the position type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$InvideoPosition {
  @scala.inline
  def apply(cornerPosition: String = null, `type`: String = null): Schema$InvideoPosition = {
    val __obj = js.Dynamic.literal()
    if (cornerPosition != null) __obj.updateDynamic("cornerPosition")(cornerPosition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InvideoPosition]
  }
}

