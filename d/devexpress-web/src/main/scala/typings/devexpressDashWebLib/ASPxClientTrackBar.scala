package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxTrackBar control.
  */
trait ASPxClientTrackBar extends ASPxClientEdit {
  /**
    * Fires after the editor's position has been changed.
    */
  var PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  /**
    * Fires on the client side before a track bar position is changed and allows you to cancel the action.
    */
  var PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]]
  /**
    * Occurs on the client-side when an end-user moves a cursor while the drag handle is held down.
    */
  var Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  /**
    * Occurs on the client-side when an end-user releases a drag handle after moving it.
    */
  var TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  /**
    * Occurs on the client-side when an end-user presses a drag handle and moves it.
    */
  var TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]
  /**
    * Returns the number of the track bar items that are maintained by the item collection.
    */
  def GetItemCount(): scala.Double
  /**
    * Returns a track bar item index by the item's value.
    * @param value An object that specifies the item's value.
    */
  def GetItemIndexByValue(value: js.Object): scala.Double
  /**
    * Returns a track bar item text.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemText(index: scala.Double): java.lang.String
  /**
    * Returns a track bar item's tooltip text.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemToolTip(index: scala.Double): java.lang.String
  /**
    * Returns a track bar item's associated value.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemValue(index: scala.Double): js.Object
  /**
    * Gets a drag handle position.
    */
  def GetPosition(): scala.Double
  /**
    * Returns the secondary drag handle position.
    */
  def GetPositionEnd(): scala.Double
  /**
    * Returns the main drag handle position.
    */
  def GetPositionStart(): scala.Double
  /**
    * Specifies a drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPosition(position: scala.Double): scala.Unit
  /**
    * Specifies the secondary drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPositionEnd(position: scala.Double): scala.Unit
  /**
    * Specifies the main drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPositionStart(position: scala.Double): scala.Unit
}

object ASPxClientTrackBar {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    Focus: () => scala.Unit,
    GetCaption: () => java.lang.String,
    GetClientVisible: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetErrorText: () => java.lang.String,
    GetHeight: () => scala.Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => scala.Boolean,
    GetItemCount: () => scala.Double,
    GetItemIndexByValue: js.Object => scala.Double,
    GetItemText: scala.Double => java.lang.String,
    GetItemToolTip: scala.Double => java.lang.String,
    GetItemValue: scala.Double => js.Object,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetPosition: () => scala.Double,
    GetPositionEnd: () => scala.Double,
    GetPositionStart: () => scala.Double,
    GetReadOnly: () => scala.Boolean,
    GetValue: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetCaption: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetErrorText: java.lang.String => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetIsValid: scala.Boolean => scala.Unit,
    SetPosition: scala.Double => scala.Unit,
    SetPositionEnd: scala.Double => scala.Unit,
    SetPositionStart: scala.Double => scala.Unit,
    SetReadOnly: scala.Boolean => scala.Unit,
    SetValue: js.Object => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    Validate: () => scala.Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientTrackBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetItemCount = js.Any.fromFunction0(GetItemCount), GetItemIndexByValue = js.Any.fromFunction1(GetItemIndexByValue), GetItemText = js.Any.fromFunction1(GetItemText), GetItemToolTip = js.Any.fromFunction1(GetItemToolTip), GetItemValue = js.Any.fromFunction1(GetItemValue), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetPosition = js.Any.fromFunction0(GetPosition), GetPositionEnd = js.Any.fromFunction0(GetPositionEnd), GetPositionStart = js.Any.fromFunction0(GetPositionStart), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, LostFocus = LostFocus, PositionChanged = PositionChanged, PositionChanging = PositionChanging, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetPosition = js.Any.fromFunction1(SetPosition), SetPositionEnd = js.Any.fromFunction1(SetPositionEnd), SetPositionStart = js.Any.fromFunction1(SetPositionStart), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Track = Track, TrackEnd = TrackEnd, TrackStart = TrackStart, Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientTrackBar]
  }
}

