package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxClientChartDesigner")
@js.native
class ASPxClientChartDesigner () extends ASPxClientControl {
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientChartDesigner]] = js.native
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientChartDesigner]] = js.native
  var CustomizeMenuActions: ASPxClientEvent[ASPxClientChartDesignerCustomizeMenuActionsEventHandler[ASPxClientChartDesigner]] = js.native
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientChartDesigner]] = js.native
  var SaveCommandExecute: ASPxClientEvent[ASPxClientChartDesignerSaveCommandExecuteEventHandler[ASPxClientChartDesigner]] = js.native
  def GetDesignerModel(): js.Any = js.native
  def GetJsonChartModel(): String = js.native
  def PerformCallback(arg: String): Unit = js.native
  def PerformCallback(arg: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  def UpdateLocalization(localization: StringDictionary[String]): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientChartDesigner")
@js.native
object ASPxClientChartDesigner extends js.Object {
  def Cast(obj: js.Any): ASPxClientChartDesigner = js.native
}

