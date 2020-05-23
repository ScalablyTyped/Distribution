package typings.fabric.anon

import typings.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tr extends js.Object {
  var bl: Point
  var br: Point
  var tl: Point
  var tr: Point
}

object Tr {
  @scala.inline
  def apply(bl: Point, br: Point, tl: Point, tr: Point): Tr = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tr]
  }
}

