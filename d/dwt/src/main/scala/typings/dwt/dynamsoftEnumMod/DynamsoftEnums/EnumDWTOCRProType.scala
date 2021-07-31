package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRProType extends StObject
/** OCRPro Type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProType")
@js.native
object EnumDWTOCRProType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRProType & Double] = js.native
  
  @js.native
  sealed trait OCRDT_File
    extends StObject
       with EnumDWTOCRProType
  /* 0 */ val OCRDT_File: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProType.OCRDT_File & Double = js.native
  
  @js.native
  sealed trait OCRDT_Index
    extends StObject
       with EnumDWTOCRProType
  /* 1 */ val OCRDT_Index: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProType.OCRDT_Index & Double = js.native
}
