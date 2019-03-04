package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerPosition extends js.Object {
  /**
    * The corner of the player where the promoted item will appear.
    */
  var cornerPosition: java.lang.String
  /**
    * The manner in which the promoted item is positioned in the video player.
    */
  var `type`: java.lang.String
}

object Anon_CornerPosition {
  @scala.inline
  def apply(cornerPosition: java.lang.String, `type`: java.lang.String): Anon_CornerPosition = {
    val __obj = js.Dynamic.literal(cornerPosition = cornerPosition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_CornerPosition]
  }
}

