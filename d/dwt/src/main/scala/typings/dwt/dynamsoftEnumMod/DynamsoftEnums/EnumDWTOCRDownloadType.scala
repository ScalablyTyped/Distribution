package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRDownloadType extends StObject
/** OCR Download Type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRDownloadType")
@js.native
object EnumDWTOCRDownloadType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRDownloadType with Double] = js.native
  
  @js.native
  sealed trait OCRDT_Dll extends EnumDWTOCRDownloadType
  /* 0 */ val OCRDT_Dll: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRDownloadType.OCRDT_Dll with Double = js.native
  
  @js.native
  sealed trait OCRDT_LANGUAGE extends EnumDWTOCRDownloadType
  /* 1 */ val OCRDT_LANGUAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRDownloadType.OCRDT_LANGUAGE with Double = js.native
}
