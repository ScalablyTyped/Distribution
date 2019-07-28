package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatrixDefaults extends js.Object

@JSGlobal("ej.MatrixDefaults")
@js.native
object MatrixDefaults extends js.Object {
  @js.native
  sealed trait m11 extends MatrixDefaults
  
  @js.native
  sealed trait m12 extends MatrixDefaults
  
  @js.native
  sealed trait m21 extends MatrixDefaults
  
  @js.native
  sealed trait m22 extends MatrixDefaults
  
  @js.native
  sealed trait offsetX extends MatrixDefaults
  
  @js.native
  sealed trait offsetY extends MatrixDefaults
  
  @js.native
  sealed trait `type` extends MatrixDefaults
  
  /* 0 */ val m11: typings.ejDotWebDotAll.ejNs.MatrixDefaults.m11 with Double = js.native
  /* 1 */ val m12: typings.ejDotWebDotAll.ejNs.MatrixDefaults.m12 with Double = js.native
  /* 2 */ val m21: typings.ejDotWebDotAll.ejNs.MatrixDefaults.m21 with Double = js.native
  /* 3 */ val m22: typings.ejDotWebDotAll.ejNs.MatrixDefaults.m22 with Double = js.native
  /* 4 */ val offsetX: typings.ejDotWebDotAll.ejNs.MatrixDefaults.offsetX with Double = js.native
  /* 5 */ val offsetY: typings.ejDotWebDotAll.ejNs.MatrixDefaults.offsetY with Double = js.native
  /* 6 */ val `type`: typings.ejDotWebDotAll.ejNs.MatrixDefaults.`type` with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatrixDefaults with Double] = js.native
}

