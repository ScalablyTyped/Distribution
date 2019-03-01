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
    AdjustControl: js.Function0[scala.Unit],
    Focus: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetErrorText: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetInputElement: js.Function0[js.Object],
    GetIsValid: js.Function0[scala.Boolean],
    GetItemCount: js.Function0[scala.Double],
    GetItemIndexByValue: js.Function1[js.Object, scala.Double],
    GetItemText: js.Function1[scala.Double, java.lang.String],
    GetItemToolTip: js.Function1[scala.Double, java.lang.String],
    GetItemValue: js.Function1[scala.Double, js.Object],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetPosition: js.Function0[scala.Double],
    GetPositionEnd: js.Function0[scala.Double],
    GetPositionStart: js.Function0[scala.Double],
    GetReadOnly: js.Function0[scala.Boolean],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetPosition: js.Function1[scala.Double, scala.Unit],
    SetPositionEnd: js.Function1[scala.Double, scala.Unit],
    SetPositionStart: js.Function1[scala.Double, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientTrackBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetErrorText")(GetErrorText)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInputElement")(GetInputElement)
    __obj.updateDynamic("GetIsValid")(GetIsValid)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetItemIndexByValue")(GetItemIndexByValue)
    __obj.updateDynamic("GetItemText")(GetItemText)
    __obj.updateDynamic("GetItemToolTip")(GetItemToolTip)
    __obj.updateDynamic("GetItemValue")(GetItemValue)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetPosition")(GetPosition)
    __obj.updateDynamic("GetPositionEnd")(GetPositionEnd)
    __obj.updateDynamic("GetPositionStart")(GetPositionStart)
    __obj.updateDynamic("GetReadOnly")(GetReadOnly)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("GotFocus")(GotFocus)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("LostFocus")(LostFocus)
    __obj.updateDynamic("PositionChanged")(PositionChanged)
    __obj.updateDynamic("PositionChanging")(PositionChanging)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetErrorText")(SetErrorText)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetIsValid")(SetIsValid)
    __obj.updateDynamic("SetPosition")(SetPosition)
    __obj.updateDynamic("SetPositionEnd")(SetPositionEnd)
    __obj.updateDynamic("SetPositionStart")(SetPositionStart)
    __obj.updateDynamic("SetReadOnly")(SetReadOnly)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Track")(Track)
    __obj.updateDynamic("TrackEnd")(TrackEnd)
    __obj.updateDynamic("TrackStart")(TrackStart)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValueChanged")(ValueChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientTrackBar]
  }
}

