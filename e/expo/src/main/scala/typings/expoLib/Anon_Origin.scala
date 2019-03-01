package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Origin extends js.Object {
  var origin: expoLib.expoMod.Point
  var size: Anon_Height
}

object Anon_Origin {
  @scala.inline
  def apply(origin: expoLib.expoMod.Point, size: Anon_Height): Anon_Origin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Origin]
  }
}

