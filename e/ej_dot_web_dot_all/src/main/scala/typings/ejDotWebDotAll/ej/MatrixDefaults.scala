package typings.ejDotWebDotAll.ej

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
  
  /* 0 */ val m11: typings.ejDotWebDotAll.ej.MatrixDefaults.m11 with Double = js.native
  /* 1 */ val m12: typings.ejDotWebDotAll.ej.MatrixDefaults.m12 with Double = js.native
  /* 2 */ val m21: typings.ejDotWebDotAll.ej.MatrixDefaults.m21 with Double = js.native
  /* 3 */ val m22: typings.ejDotWebDotAll.ej.MatrixDefaults.m22 with Double = js.native
  /* 4 */ val offsetX: typings.ejDotWebDotAll.ej.MatrixDefaults.offsetX with Double = js.native
  /* 5 */ val offsetY: typings.ejDotWebDotAll.ej.MatrixDefaults.offsetY with Double = js.native
  /* 6 */ val `type`: typings.ejDotWebDotAll.ej.MatrixDefaults.`type` with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatrixDefaults with Double] = js.native
}

