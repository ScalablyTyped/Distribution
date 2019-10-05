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
  
  /* 1 */ val ECM_Ignore: typings.dwt.dynamsoft.BarcodeReader.EnumConflictMode.ECM_Ignore with Double = js.native
  /* 2 */ val ECM_Overwrite: typings.dwt.dynamsoft.BarcodeReader.EnumConflictMode.ECM_Overwrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumConflictMode with Double] = js.native
}

