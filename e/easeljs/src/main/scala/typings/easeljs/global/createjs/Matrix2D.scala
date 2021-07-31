package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Matrix2D")
@js.native
class Matrix2D protected ()
  extends StObject
     with typings.easeljs.createjs.Matrix2D {
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
object Matrix2D {
  
  @JSGlobal("createjs.Matrix2D")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.Matrix2D.DEG_TO_RAD")
  @js.native
  def DEG_TO_RAD: Double = js.native
  @scala.inline
  def DEG_TO_RAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEG_TO_RAD")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Matrix2D.identity")
  @js.native
  def identity: typings.easeljs.createjs.Matrix2D = js.native
  @scala.inline
  def identity_=(x: typings.easeljs.createjs.Matrix2D): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
}
