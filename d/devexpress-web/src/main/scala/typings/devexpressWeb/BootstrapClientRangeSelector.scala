package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapRangeSelector control.
  */
@js.native
trait BootstrapClientRangeSelector extends BootstrapUIWidgetBase {
  /**
    * Fires after the selected range has been changed by moving one of the sliders.
    */
  var ValueChanged: ASPxClientEvent[
    BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
  ] = js.native
  /**
    * Gets the Range Selector's selected value range.
    */
  def GetValue(): js.Array[_] = js.native
  /**
    * Gets the Range Selector's selected value range.
    * @param value An array containing the value range.
    */
  def SetValue(value: js.Array[_]): Unit = js.native
}

object BootstrapClientRangeSelector {
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
    GetDataSource: () => js.Any,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetInstance: () => js.Any,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetValue: () => js.Array[_],
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    Print: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetDataSource: js.Any => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetOptions: js.Any => Unit,
    SetValue: js.Array[_] => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ValueChanged: ASPxClientEvent[
      BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
    ],
    name: String
  ): BootstrapClientRangeSelector = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Disposing = Disposing.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2(ExportTo), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDataSource = js.Any.fromFunction0(GetDataSource), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetInstance = js.Any.fromFunction0(GetInstance), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], Print = js.Any.fromFunction0(Print), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDataSource = js.Any.fromFunction1(SetDataSource), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetOptions = js.Any.fromFunction1(SetOptions), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientRangeSelector]
  }
  @scala.inline
  implicit class BootstrapClientRangeSelectorOps[Self <: BootstrapClientRangeSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetValue(value: () => js.Array[_]): Self = this.set("GetValue", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: js.Array[_] => Unit): Self = this.set("SetValue", js.Any.fromFunction1(value))
    @scala.inline
    def setValueChanged(
      value: ASPxClientEvent[
          BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
        ]
    ): Self = this.set("ValueChanged", value.asInstanceOf[js.Any])
  }
  
}

