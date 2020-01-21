package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCornerPosition extends js.Object {
  /**
    * The corner of the player where the promoted item will appear.
    */
  var cornerPosition: String
  /**
    * The manner in which the promoted item is positioned in the video player.
    */
  var `type`: String
}

object AnonCornerPosition {
  @scala.inline
  def apply(cornerPosition: String, `type`: String): AnonCornerPosition = {
    val __obj = js.Dynamic.literal(cornerPosition = cornerPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCornerPosition]
  }
}

