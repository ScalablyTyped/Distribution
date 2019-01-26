package typings
package dwtLib.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumResultType extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumResultType")
@js.native
object EnumResultType extends js.Object {
  @js.native
  sealed trait EDT_CandidateText
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumResultType
  
  @js.native
  sealed trait EDT_PartialText
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumResultType
  
  @js.native
  sealed trait EDT_RawText
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumResultType
  
  @js.native
  sealed trait EDT_StandardText
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumResultType
  
  /* 2 */ val EDT_CandidateText: EDT_CandidateText with scala.Double = js.native
  /* 3 */ val EDT_PartialText: EDT_PartialText with scala.Double = js.native
  /* 1 */ val EDT_RawText: EDT_RawText with scala.Double = js.native
  /* 0 */ val EDT_StandardText: EDT_StandardText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.dynamsoftNs.BarcodeReaderNs.EnumResultType with scala.Double] = js.native
}

