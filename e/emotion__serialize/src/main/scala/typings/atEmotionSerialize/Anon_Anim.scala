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
  def apply(anim: Double, name: String, styles: String, toString: () => String): Anon_Anim = {
    val __obj = js.Dynamic.literal(anim = anim, name = name, styles = styles, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Anon_Anim]
  }
}

