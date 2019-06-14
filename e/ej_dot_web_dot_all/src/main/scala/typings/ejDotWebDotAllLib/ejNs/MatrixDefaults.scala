package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatrixDefaults extends js.Object

@JSGlobal("ej.MatrixDefaults")
@js.native
object MatrixDefaults extends js.Object {
  @js.native
  sealed trait m11
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  @js.native
  sealed trait m12
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  @js.native
  sealed trait m21
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  @js.native
  sealed trait m22
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  @js.native
  sealed trait offsetX
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  @js.native
  sealed trait offsetY
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  @js.native
  sealed trait `type`
    extends ejDotWebDotAllLib.ejNs.MatrixDefaults
  
  /* 0 */ val m11: m11 with scala.Double = js.native
  /* 1 */ val m12: m12 with scala.Double = js.native
  /* 2 */ val m21: m21 with scala.Double = js.native
  /* 3 */ val m22: m22 with scala.Double = js.native
  /* 4 */ val offsetX: offsetX with scala.Double = js.native
  /* 5 */ val offsetY: offsetY with scala.Double = js.native
  /* 6 */ val `type`: `type` with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.MatrixDefaults with scala.Double] = js.native
}

