package typings.emotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnim extends js.Object {
  var anim: Double
  var name: String
  var styles: String
}

object AnonAnim {
  @scala.inline
  def apply(anim: Double, name: String, styles: String): AnonAnim = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnim]
  }
}

