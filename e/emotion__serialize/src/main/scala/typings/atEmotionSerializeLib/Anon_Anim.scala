package typings
package atEmotionSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anim extends js.Object {
  var anim: scala.Double
  var name: java.lang.String
  var styles: java.lang.String
}

object Anon_Anim {
  @scala.inline
  def apply(
    anim: scala.Double,
    name: java.lang.String,
    styles: java.lang.String,
    toString: () => java.lang.String
  ): Anon_Anim = {
    val __obj = js.Dynamic.literal(anim = anim, name = name, styles = styles, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Anon_Anim]
  }
}

