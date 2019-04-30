package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Corner extends js.Object {
  var corner: java.lang.String
  var originX: java.lang.String
  var originY: java.lang.String
  var original: fabricLib.fabricDashImplMod.Object
  var width: scala.Double
}

object Anon_Corner {
  @scala.inline
  def apply(
    corner: java.lang.String,
    originX: java.lang.String,
    originY: java.lang.String,
    original: fabricLib.fabricDashImplMod.Object,
    width: scala.Double
  ): Anon_Corner = {
    val __obj = js.Dynamic.literal(corner = corner, originX = originX, originY = originY, original = original, width = width)
  
    __obj.asInstanceOf[Anon_Corner]
  }
}

