package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[EnumDWTMouseShape & Double] = js.native
  
  @js.native
  sealed trait Crosshair
    extends StObject
       with EnumDWTMouseShape
  /* 2 */ val Crosshair: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMouseShape.Crosshair & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EnumDWTMouseShape
  /* 0 */ val Default: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMouseShape.Default & Double = js.native
  
  @js.native
  sealed trait Hand
    extends StObject
       with EnumDWTMouseShape
  /* 1 */ val Hand: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMouseShape.Hand & Double = js.native
  
  @js.native
  sealed trait Zoom
    extends StObject
       with EnumDWTMouseShape
  /* 3 */ val Zoom: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMouseShape.Zoom & Double = js.native
}
