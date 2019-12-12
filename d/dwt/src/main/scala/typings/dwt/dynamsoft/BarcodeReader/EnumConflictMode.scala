package typings.dwt.dynamsoft.BarcodeReader

import org.scalablytyped.runtime.TopLevel
import typings.dwt.dynamsoft.BarcodeReader.EnumConflictMode.ECM_Ignore
import typings.dwt.dynamsoft.BarcodeReader.EnumConflictMode.ECM_Overwrite
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumConflictMode with Double] = js.native
  /* 1 */ @js.native
  object ECM_Ignore extends TopLevel[ECM_Ignore with Double]
  
  /* 2 */ @js.native
  object ECM_Overwrite extends TopLevel[ECM_Overwrite with Double]
  
}

