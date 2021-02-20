package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTMouseShape extends StObject
/**
  * Mouse cursor shape.
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MouseShape")
@js.native
object EnumDWTMouseShape extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMouseShape with Double] = js.native
  
  @js.native
  sealed trait Crosshair extends EnumDWTMouseShape
  /* 2 */ val Crosshair: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMouseShape.Crosshair with Double = js.native
  
  @js.native
  sealed trait Default extends EnumDWTMouseShape
  /* 0 */ val Default: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMouseShape.Default with Double = js.native
  
  @js.native
  sealed trait Hand extends EnumDWTMouseShape
  /* 1 */ val Hand: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMouseShape.Hand with Double = js.native
  
  @js.native
  sealed trait Zoom extends EnumDWTMouseShape
  /* 3 */ val Zoom: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMouseShape.Zoom with Double = js.native
}
