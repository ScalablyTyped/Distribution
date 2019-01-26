package typings
package dwtLib.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumConflictMode extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumConflictMode")
@js.native
object EnumConflictMode extends js.Object {
  @js.native
  sealed trait ECM_Ignore
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumConflictMode
  
  @js.native
  sealed trait ECM_Overwrite
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumConflictMode
  
  /* 1 */ val ECM_Ignore: ECM_Ignore with scala.Double = js.native
  /* 2 */ val ECM_Overwrite: ECM_Overwrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.dynamsoftNs.BarcodeReaderNs.EnumConflictMode with scala.Double] = js.native
}

