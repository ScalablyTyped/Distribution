package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapClientSparkline extends BootstrapUIWidgetBase {
  @JSName("OptionChanged")
  var OptionChanged_BootstrapClientSparkline: ASPxClientEvent[BootstrapClientSparklineOptionChangedEventHandler[BootstrapClientSparkline]]
  var TooltipHidden: ASPxClientEvent[BootstrapClientSparklineTooltipHiddenEventHandler[BootstrapClientSparkline]]
  var TooltipShown: ASPxClientEvent[BootstrapClientSparklineTooltipShownEventHandler[BootstrapClientSparkline]]
}

object BootstrapClientSparkline {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]],
    ExportTo: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]],
    Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]],
    FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetDataSource: js.Function0[js.Object],
    GetHeight: js.Function0[scala.Double],
    GetInstance: js.Function0[js.Object],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    OptionChanged: ASPxClientEvent[BootstrapClientSparklineOptionChangedEventHandler[BootstrapClientSparkline]],
    Print: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetDataSource: js.Function1[js.Object, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetOptions: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    TooltipHidden: ASPxClientEvent[BootstrapClientSparklineTooltipHiddenEventHandler[BootstrapClientSparkline]],
    TooltipShown: ASPxClientEvent[BootstrapClientSparklineTooltipShownEventHandler[BootstrapClientSparkline]],
    name: java.lang.String
  ): BootstrapClientSparkline = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Disposing = Disposing, Drawn = Drawn, ExportTo = ExportTo, Exported = Exported, Exporting = Exporting, FileSaving = FileSaving, GetClientVisible = GetClientVisible, GetDataSource = GetDataSource, GetHeight = GetHeight, GetInstance = GetInstance, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, IncidentOccurred = IncidentOccurred, Init = Init, OptionChanged = OptionChanged, Print = Print, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetDataSource = SetDataSource, SetHeight = SetHeight, SetOptions = SetOptions, SetVisible = SetVisible, SetWidth = SetWidth, TooltipHidden = TooltipHidden, TooltipShown = TooltipShown, name = name)
  
    __obj.asInstanceOf[BootstrapClientSparkline]
  }
}

