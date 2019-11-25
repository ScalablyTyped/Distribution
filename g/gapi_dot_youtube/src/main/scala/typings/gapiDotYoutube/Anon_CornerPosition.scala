package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerPosition extends js.Object {
  /**
    * The corner of the player where the promoted item will appear.
    */
  var cornerPosition: String
  /**
    * The manner in which the promoted item is positioned in the video player.
    */
  var `type`: String
}

object Anon_CornerPosition {
  @scala.inline
  def apply(cornerPosition: String, `type`: String): Anon_CornerPosition = {
    val __obj = js.Dynamic.literal(cornerPosition = cornerPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerPosition]
  }
}

