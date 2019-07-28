package typings.dwt.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumTerminateStage extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumTerminateStage")
@js.native
object EnumTerminateStage extends js.Object {
  @js.native
  sealed trait ETS_Localized extends EnumTerminateStage
  
  @js.native
  sealed trait ETS_Prelocalized extends EnumTerminateStage
  
  @js.native
  sealed trait ETS_Recognized extends EnumTerminateStage
  
  /* 1 */ val ETS_Localized: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage.ETS_Localized with Double = js.native
  /* 0 */ val ETS_Prelocalized: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage.ETS_Prelocalized with Double = js.native
  /* 2 */ val ETS_Recognized: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage.ETS_Recognized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTerminateStage with Double] = js.native
}

