package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTMouseShape extends js.Object
/**
  * Mouse cursor shape.
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MouseShape")
@js.native
object EnumDWTMouseShape extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMouseShape with Double] = js.native
  
  @js.native
  sealed trait Crosshair extends EnumDWTMouseShape
  /* 2 */ @js.native
  object Crosshair extends TopLevel[Crosshair with Double]
  
  @js.native
  sealed trait Default extends EnumDWTMouseShape
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  @js.native
  sealed trait Hand extends EnumDWTMouseShape
  /* 1 */ @js.native
  object Hand extends TopLevel[Hand with Double]
  
  @js.native
  sealed trait Zoom extends EnumDWTMouseShape
  /* 3 */ @js.native
  object Zoom extends TopLevel[Zoom with Double]
}
