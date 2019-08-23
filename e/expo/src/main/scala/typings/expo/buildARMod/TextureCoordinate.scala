package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureCoordinate extends js.Object {
  var u: Double
  var v: Double
}

object TextureCoordinate {
  @scala.inline
  def apply(u: Double, v: Double): TextureCoordinate = {
    val __obj = js.Dynamic.literal(u = u, v = v)
  
    __obj.asInstanceOf[TextureCoordinate]
  }
}

