package typings.fabric

import typings.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMl extends js.Object {
  var bl: Point
  var br: Point
  var mb: Point
  var ml: Point
  var mr: Point
  var mt: Point
  var mtr: Point
  var tl: Point
  var tr: Point
}

object AnonMl {
  @scala.inline
  def apply(bl: Point, br: Point, mb: Point, ml: Point, mr: Point, mt: Point, mtr: Point, tl: Point, tr: Point): AnonMl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMl]
  }
}

