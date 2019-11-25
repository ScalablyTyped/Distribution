package typings.atEmotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anim extends js.Object {
  var anim: Double
  var name: String
  var styles: String
}

object Anon_Anim {
  @scala.inline
  def apply(anim: Double, name: String, styles: String): Anon_Anim = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Anim]
  }
}

