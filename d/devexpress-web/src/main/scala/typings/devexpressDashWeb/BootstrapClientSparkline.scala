package typings.devexpressDashWeb

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
    AdjustControl: () => Unit,
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]],
    ExportTo: (String, String) => Unit,
    Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]],
    Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]],
    FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]],
    GetClientVisible: () => Boolean,
    GetDataSource: () => js.Object,
    GetHeight: () => Double,
    GetInstance: () => js.Object,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    OptionChanged: ASPxClientEvent[BootstrapClientSparklineOptionChangedEventHandler[BootstrapClientSparkline]],
    Print: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetDataSource: js.Object => Unit,
    SetHeight: Double => Unit,
    SetOptions: js.Object => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    TooltipHidden: ASPxClientEvent[BootstrapClientSparklineTooltipHiddenEventHandler[BootstrapClientSparkline]],
    TooltipShown: ASPxClientEvent[BootstrapClientSparklineTooltipShownEventHandler[BootstrapClientSparkline]],
    name: String
  ): BootstrapClientSparkline = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Disposing = Disposing, Drawn = Drawn, ExportTo = js.Any.fromFunction2(ExportTo), Exported = Exported, Exporting = Exporting, FileSaving = FileSaving, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDataSource = js.Any.fromFunction0(GetDataSource), GetHeight = js.Any.fromFunction0(GetHeight), GetInstance = js.Any.fromFunction0(GetInstance), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), IncidentOccurred = IncidentOccurred, Init = Init, OptionChanged = OptionChanged, Print = js.Any.fromFunction0(Print), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDataSource = js.Any.fromFunction1(SetDataSource), SetHeight = js.Any.fromFunction1(SetHeight), SetOptions = js.Any.fromFunction1(SetOptions), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TooltipHidden = TooltipHidden, TooltipShown = TooltipShown, name = name)
  
    __obj.asInstanceOf[BootstrapClientSparkline]
  }
}

