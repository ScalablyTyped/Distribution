package typings.dwt.dynamsoftNs.BarcodeReaderNs

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
  
  /* 2 */ val EDT_CandidateText: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumResultType.EDT_CandidateText with Double = js.native
  /* 3 */ val EDT_PartialText: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumResultType.EDT_PartialText with Double = js.native
  /* 1 */ val EDT_RawText: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumResultType.EDT_RawText with Double = js.native
  /* 0 */ val EDT_StandardText: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumResultType.EDT_StandardText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultType with Double] = js.native
}

