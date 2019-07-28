package typings.fabric

import typings.fabric.fabricDashImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bl extends js.Object {
  var bl: Point
  var br: Point
  var tl: Point
  var tr: Point
}

object Anon_Bl {
  @scala.inline
  def apply(bl: Point, br: Point, tl: Point, tr: Point): Anon_Bl = {
    val __obj = js.Dynamic.literal(bl = bl, br = br, tl = tl, tr = tr)
  
    __obj.asInstanceOf[Anon_Bl]
  }
}

