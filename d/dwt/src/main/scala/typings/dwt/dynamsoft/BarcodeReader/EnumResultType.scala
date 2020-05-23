package typings.dwt.dynamsoft.BarcodeReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumResultType extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumResultType")
@js.native
object EnumResultType extends js.Object {
  @js.native
  sealed trait EDT_CandidateText extends EnumResultType
  
  @js.native
  sealed trait EDT_PartialText extends EnumResultType
  
  @js.native
  sealed trait EDT_RawText extends EnumResultType
  
  @js.native
  sealed trait EDT_StandardText extends EnumResultType
  
}

