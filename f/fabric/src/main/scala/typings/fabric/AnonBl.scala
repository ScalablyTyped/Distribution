package typings.fabric

import typings.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBl extends js.Object {
  var bl: Point
  var br: Point
  var tl: Point
  var tr: Point
}

object AnonBl {
  @scala.inline
  def apply(bl: Point, br: Point, tl: Point, tr: Point): AnonBl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBl]
  }
}

