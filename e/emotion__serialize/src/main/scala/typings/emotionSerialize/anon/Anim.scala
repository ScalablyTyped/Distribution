package typings.emotionSerialize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anim extends js.Object {
  var anim: Double
  var name: String
  var styles: String
}

object Anim {
  @scala.inline
  def apply(anim: Double, name: String, styles: String): Anim = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anim]
  }
}

