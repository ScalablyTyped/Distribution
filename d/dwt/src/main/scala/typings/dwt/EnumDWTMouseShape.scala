package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTMouseShape extends js.Object

@JSGlobal("EnumDWT_MouseShape")
@js.native
object EnumDWTMouseShape extends js.Object {
  @js.native
  sealed trait Crosshair extends EnumDWTMouseShape
  
  @js.native
  sealed trait Default extends EnumDWTMouseShape
  
  @js.native
  sealed trait Hand extends EnumDWTMouseShape
  
  @js.native
  sealed trait Zoom extends EnumDWTMouseShape
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMouseShape with Double] = js.native
  /* 2 */ @js.native
  object Crosshair extends TopLevel[Crosshair with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Hand extends TopLevel[Hand with Double]
  
  /* 3 */ @js.native
  object Zoom extends TopLevel[Zoom with Double]
  
}

