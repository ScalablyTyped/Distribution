package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_MouseShape.Crosshair
import typings.dwt.EnumDWT_MouseShape.Default
import typings.dwt.EnumDWT_MouseShape.Hand
import typings.dwt.EnumDWT_MouseShape.Zoom
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_MouseShape with Double] = js.native
  /* 2 */ @js.native
  object Crosshair extends TopLevel[Crosshair with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Hand extends TopLevel[Hand with Double]
  
  /* 3 */ @js.native
  object Zoom extends TopLevel[Zoom with Double]
  
}

