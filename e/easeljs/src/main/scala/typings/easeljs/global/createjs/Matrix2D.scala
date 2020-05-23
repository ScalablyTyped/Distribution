package typings.easeljs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Matrix2D")
@js.native
class Matrix2D protected ()
  extends typings.easeljs.createjs.Matrix2D {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
}

/* static members */
@JSGlobal("createjs.Matrix2D")
@js.native
object Matrix2D extends js.Object {
  var DEG_TO_RAD: Double = js.native
  var identity: typings.easeljs.createjs.Matrix2D = js.native
}

