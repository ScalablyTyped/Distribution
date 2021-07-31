package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDriver extends StObject
/**
  * Driver Type
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_Driver")
@js.native
object EnumDWTDriver extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDriver & Double] = js.native
  
  @js.native
  sealed trait ICA
    extends StObject
       with EnumDWTDriver
  /* 3 */ val ICA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver.ICA & Double = js.native
  
  @js.native
  sealed trait SANE
    extends StObject
       with EnumDWTDriver
  /* 3 */ val SANE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver.SANE & Double = js.native
  
  @js.native
  sealed trait TWAIN
    extends StObject
       with EnumDWTDriver
  /* 0 */ val TWAIN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver.TWAIN & Double = js.native
  
  @js.native
  sealed trait TWAIN64
    extends StObject
       with EnumDWTDriver
  /* 5 */ val TWAIN64: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver.TWAIN64 & Double = js.native
  
  @js.native
  sealed trait TWAIN_AND_ICA
    extends StObject
       with EnumDWTDriver
  /* 4 */ val TWAIN_AND_ICA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver.TWAIN_AND_ICA & Double = js.native
  
  @js.native
  sealed trait TWAIN_AND_TWAIN64
    extends StObject
       with EnumDWTDriver
  /* 4 */ val TWAIN_AND_TWAIN64: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver.TWAIN_AND_TWAIN64 & Double = js.native
}
