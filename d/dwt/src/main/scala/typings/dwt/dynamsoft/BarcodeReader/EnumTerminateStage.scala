package typings.dwt.dynamsoft.BarcodeReader

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
  
}

