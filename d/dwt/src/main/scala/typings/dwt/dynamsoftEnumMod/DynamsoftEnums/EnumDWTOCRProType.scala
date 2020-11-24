package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRProType extends js.Object
/** OCRPro Type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProType")
@js.native
object EnumDWTOCRProType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRProType with Double] = js.native
  
  @js.native
  sealed trait OCRDT_File extends EnumDWTOCRProType
  /* 0 */ @js.native
  object OCRDT_File extends TopLevel[OCRDT_File with Double]
  
  @js.native
  sealed trait OCRDT_Index extends EnumDWTOCRProType
  /* 1 */ @js.native
  object OCRDT_Index extends TopLevel[OCRDT_Index with Double]
}
