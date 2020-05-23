package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTOCRFindTextFlags extends js.Object

@JSGlobal("EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWTOCRFindTextFlags extends js.Object {
  @js.native
  sealed trait OCRFT_FUZZYMATCH extends EnumDWTOCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_MATCHCASE extends EnumDWTOCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_WHOLEWORD extends EnumDWTOCRFindTextFlags
  
}

