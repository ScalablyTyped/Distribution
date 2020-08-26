package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTOCRProType extends js.Object

/** OCRPro Type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRProType")
@js.native
object EnumDWTOCRProType extends js.Object {
  @js.native
  sealed trait OCRDT_File extends EnumDWTOCRProType
  
  @js.native
  sealed trait OCRDT_Index extends EnumDWTOCRProType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRProType with Double] = js.native
  /* 0 */ @js.native
  object OCRDT_File extends TopLevel[OCRDT_File with Double]
  
  /* 1 */ @js.native
  object OCRDT_Index extends TopLevel[OCRDT_Index with Double]
  
}

