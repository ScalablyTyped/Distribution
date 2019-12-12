package typings.dwt.dynamsoft.BarcodeReader

import org.scalablytyped.runtime.TopLevel
import typings.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Localized
import typings.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Prelocalized
import typings.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Recognized
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTerminateStage with Double] = js.native
  /* 1 */ @js.native
  object ETS_Localized extends TopLevel[ETS_Localized with Double]
  
  /* 0 */ @js.native
  object ETS_Prelocalized extends TopLevel[ETS_Prelocalized with Double]
  
  /* 2 */ @js.native
  object ETS_Recognized extends TopLevel[ETS_Recognized with Double]
  
}

