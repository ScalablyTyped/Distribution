package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's Parameters Panel.
  */
trait ASPxClientReportParametersPanel extends ASPxClientControl {
  /**
    * Assigns a value to a parameter of the report displayed in the document viewer.
    * @param path A System.String specifying the parameter's path.
    * @param value An object specifying the parameter value.
    */
  def AssignParameter(path: java.lang.String, value: js.Object): scala.Unit
  /**
    * Assigns a value to a parameter of the report displayed in the document viewer.
    * @param parametersInfo An array of ASPxClientReportParameterInfo values specifying parameters and values to assign.
    */
  def AssignParameters(parametersInfo: js.Array[ASPxClientReportParameterInfo]): scala.Unit
  /**
    * Returns a value editor that is associated with a parameter with the specified name.
    * @param parameterName A String value, specifying the parameter name.
    */
  def GetEditorByParameterName(parameterName: java.lang.String): ASPxClientControl
  /**
    * Returns an array storing the names of parameters available in a report.
    */
  def GetParameterNames(): js.Array[java.lang.String]
}

object ASPxClientReportParametersPanel {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    AssignParameter: js.Function2[java.lang.String, js.Object, scala.Unit],
    AssignParameters: js.Function1[js.Array[ASPxClientReportParameterInfo], scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEditorByParameterName: js.Function1[java.lang.String, ASPxClientControl],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParameterNames: js.Function0[js.Array[java.lang.String]],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientReportParametersPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, AssignParameter = AssignParameter, AssignParameters = AssignParameters, GetClientVisible = GetClientVisible, GetEditorByParameterName = GetEditorByParameterName, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParameterNames = GetParameterNames, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientReportParametersPanel]
  }
}

