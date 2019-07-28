package typings.expo

import typings.expo.expoMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Origin extends js.Object {
  var origin: Point
  var size: Anon_Height
}

object Anon_Origin {
  @scala.inline
  def apply(origin: Point, size: Anon_Height): Anon_Origin = {
    val __obj = js.Dynamic.literal(origin = origin, size = size)
  
    __obj.asInstanceOf[Anon_Origin]
  }
}

