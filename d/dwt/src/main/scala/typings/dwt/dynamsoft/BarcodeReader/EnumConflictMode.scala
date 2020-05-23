package typings.dwt.dynamsoft.BarcodeReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumConflictMode extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumConflictMode")
@js.native
object EnumConflictMode extends js.Object {
  @js.native
  sealed trait ECM_Ignore extends EnumConflictMode
  
  @js.native
  sealed trait ECM_Overwrite extends EnumConflictMode
  
}

