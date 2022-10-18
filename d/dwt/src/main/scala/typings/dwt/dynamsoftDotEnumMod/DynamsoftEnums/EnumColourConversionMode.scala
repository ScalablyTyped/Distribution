package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumColourConversionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumColourConversionMode")
@js.native
object EnumColourConversionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumColourConversionMode & Double] = js.native
  
  @js.native
  sealed trait CICM_GENERAL
    extends StObject
       with EnumColourConversionMode
  /* 1 */ val CICM_GENERAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumColourConversionMode.CICM_GENERAL & Double = js.native
  
  @js.native
  sealed trait CICM_SKIP
    extends StObject
       with EnumColourConversionMode
  /* 0 */ val CICM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumColourConversionMode.CICM_SKIP & Double = js.native
}
