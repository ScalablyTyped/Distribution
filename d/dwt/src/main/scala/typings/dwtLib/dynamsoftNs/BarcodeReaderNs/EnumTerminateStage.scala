package typings
package dwtLib.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumTerminateStage extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumTerminateStage")
@js.native
object EnumTerminateStage extends js.Object {
  @js.native
  sealed trait ETS_Localized
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage
  
  @js.native
  sealed trait ETS_Prelocalized
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage
  
  @js.native
  sealed trait ETS_Recognized
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage
  
  /* 1 */ val ETS_Localized: ETS_Localized with scala.Double = js.native
  /* 0 */ val ETS_Prelocalized: ETS_Prelocalized with scala.Double = js.native
  /* 2 */ val ETS_Recognized: ETS_Recognized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.dynamsoftNs.BarcodeReaderNs.EnumTerminateStage with scala.Double] = js.native
}

