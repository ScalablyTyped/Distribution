package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_MouseShape extends js.Object

@JSGlobal("EnumDWT_MouseShape")
@js.native
object EnumDWT_MouseShape extends js.Object {
  @js.native
  sealed trait Crosshair extends EnumDWT_MouseShape
  
  @js.native
  sealed trait Default extends EnumDWT_MouseShape
  
  @js.native
  sealed trait Hand extends EnumDWT_MouseShape
  
  @js.native
  sealed trait Zoom extends EnumDWT_MouseShape
  
  /* 2 */ val Crosshair: typings.dwt.EnumDWT_MouseShape.Crosshair with Double = js.native
  /* 0 */ val Default: typings.dwt.EnumDWT_MouseShape.Default with Double = js.native
  /* 1 */ val Hand: typings.dwt.EnumDWT_MouseShape.Hand with Double = js.native
  /* 3 */ val Zoom: typings.dwt.EnumDWT_MouseShape.Zoom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_MouseShape with Double] = js.native
}

