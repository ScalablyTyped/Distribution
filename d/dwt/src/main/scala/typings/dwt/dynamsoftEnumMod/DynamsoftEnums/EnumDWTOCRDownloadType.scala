package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRDownloadType extends StObject
/** OCR Download Type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRDownloadType")
@js.native
object EnumDWTOCRDownloadType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRDownloadType & Double] = js.native
  
  @js.native
  sealed trait OCRDT_Dll
    extends StObject
       with EnumDWTOCRDownloadType
  /* 0 */ val OCRDT_Dll: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRDownloadType.OCRDT_Dll & Double = js.native
  
  @js.native
  sealed trait OCRDT_LANGUAGE
    extends StObject
       with EnumDWTOCRDownloadType
  /* 1 */ val OCRDT_LANGUAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRDownloadType.OCRDT_LANGUAGE & Double = js.native
}
