package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientChartDesigner
  extends StObject
     with ASPxClientControl {
  
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientChartDesigner]] = js.native
  
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientChartDesigner]] = js.native
  
  var CustomizeMenuActions: ASPxClientEvent[ASPxClientChartDesignerCustomizeMenuActionsEventHandler[ASPxClientChartDesigner]] = js.native
  
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientChartDesigner]] = js.native
  
  def GetDesignerModel(): Any = js.native
  
  def GetJsonChartModel(): String = js.native
  
  def PerformCallback(arg: String): Unit = js.native
  def PerformCallback(arg: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  var SaveCommandExecute: ASPxClientEvent[ASPxClientChartDesignerSaveCommandExecuteEventHandler[ASPxClientChartDesigner]] = js.native
  
  def UpdateLocalization(localization: StringDictionary[String]): Unit = js.native
}
