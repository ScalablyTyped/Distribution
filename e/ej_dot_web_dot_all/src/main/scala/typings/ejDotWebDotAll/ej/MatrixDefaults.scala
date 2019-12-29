package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatrixDefaults with Double] = js.native
  /* 0 */ @js.native
  object m11 extends TopLevel[m11 with Double]
  
  /* 1 */ @js.native
  object m12 extends TopLevel[m12 with Double]
  
  /* 2 */ @js.native
  object m21 extends TopLevel[m21 with Double]
  
  /* 3 */ @js.native
  object m22 extends TopLevel[m22 with Double]
  
  /* 4 */ @js.native
  object offsetX extends TopLevel[offsetX with Double]
  
  /* 5 */ @js.native
  object offsetY extends TopLevel[offsetY with Double]
  
  /* 6 */ @js.native
  object `type` extends TopLevel[`type` with Double]
  
}

