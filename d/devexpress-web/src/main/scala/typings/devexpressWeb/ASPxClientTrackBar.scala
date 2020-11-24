package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxTrackBar control.
  */
@js.native
trait ASPxClientTrackBar extends ASPxClientEdit {
  
  /**
    * Returns the number of the track bar items that are maintained by the item collection.
    */
  def GetItemCount(): Double = js.native
  
  /**
    * Returns a track bar item index by the item's value. An Int32 value that is an index of the item with the specified value. null (Nothing in Visual Basic) if the item was not found.
    * @param value An object that specifies the item's value.
    */
  def GetItemIndexByValue(value: js.Any): Double = js.native
  
  /**
    * Returns a track bar item text. A String value specifying the track bar item text.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemText(index: Double): String = js.native
  
  /**
    * Returns a track bar item's tooltip text. A String value that specifies the text content of the current item's tooltip.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemToolTip(index: Double): String = js.native
  
  /**
    * Returns a track bar item's associated value. An Object that specifies the item's value.
    * @param index An integer value that specifies the required item's index.
    */
  def GetItemValue(index: Double): js.Any = js.native
  
  /**
    * Gets a drag handle position.
    */
  def GetPosition(): Double = js.native
  
  /**
    * Returns the secondary drag handle position.
    */
  def GetPositionEnd(): Double = js.native
  
  /**
    * Returns the main drag handle position.
    */
  def GetPositionStart(): Double = js.native
  
  /**
    * Fires after the editor's position has been changed.
    */
  var PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]] = js.native
  
  /**
    * Fires on the client side before a track bar position is changed and allows you to cancel the action.
    */
  var PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]] = js.native
  
  /**
    * Specifies a drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPosition(position: Double): Unit = js.native
  
  /**
    * Specifies the secondary drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPositionEnd(position: Double): Unit = js.native
  
  /**
    * Specifies the main drag handle position.
    * @param position A  value that specifies the position.
    */
  def SetPositionStart(position: Double): Unit = js.native
  
  /**
    * Occurs on the client-side when an end-user moves a cursor while the drag handle is held down.
    */
  var Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]] = js.native
  
  /**
    * Occurs on the client-side when an end-user releases a drag handle after moving it.
    */
  var TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]] = js.native
  
  /**
    * Occurs on the client-side when an end-user presses a drag handle and moves it.
    */
  var TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]] = js.native
}
object ASPxClientTrackBar {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Focus: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetItemCount: () => Double,
    GetItemIndexByValue: js.Any => Double,
    GetItemText: Double => String,
    GetItemToolTip: Double => String,
    GetItemValue: Double => js.Any,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetPosition: () => Double,
    GetPositionEnd: () => Double,
    GetPositionStart: () => Double,
    GetReadOnly: () => Boolean,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetPosition: Double => Unit,
    SetPositionEnd: Double => Unit,
    SetPositionStart: Double => Unit,
    SetReadOnly: Boolean => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Track: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackEnd: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    TrackStart: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]],
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientTrackBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetItemCount = js.Any.fromFunction0(GetItemCount), GetItemIndexByValue = js.Any.fromFunction1(GetItemIndexByValue), GetItemText = js.Any.fromFunction1(GetItemText), GetItemToolTip = js.Any.fromFunction1(GetItemToolTip), GetItemValue = js.Any.fromFunction1(GetItemValue), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetPosition = js.Any.fromFunction0(GetPosition), GetPositionEnd = js.Any.fromFunction0(GetPositionEnd), GetPositionStart = js.Any.fromFunction0(GetPositionStart), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], PositionChanged = PositionChanged.asInstanceOf[js.Any], PositionChanging = PositionChanging.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetPosition = js.Any.fromFunction1(SetPosition), SetPositionEnd = js.Any.fromFunction1(SetPositionEnd), SetPositionStart = js.Any.fromFunction1(SetPositionStart), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Track = Track.asInstanceOf[js.Any], TrackEnd = TrackEnd.asInstanceOf[js.Any], TrackStart = TrackStart.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTrackBar]
  }
  
  @scala.inline
  implicit class ASPxClientTrackBarOps[Self <: ASPxClientTrackBar] (val x: Self) extends AnyVal {
    
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
    def setGetItemCount(value: () => Double): Self = this.set("GetItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemIndexByValue(value: js.Any => Double): Self = this.set("GetItemIndexByValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemText(value: Double => String): Self = this.set("GetItemText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemToolTip(value: Double => String): Self = this.set("GetItemToolTip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemValue(value: Double => js.Any): Self = this.set("GetItemValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPosition(value: () => Double): Self = this.set("GetPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPositionEnd(value: () => Double): Self = this.set("GetPositionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPositionStart(value: () => Double): Self = this.set("GetPositionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPositionChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = this.set("PositionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionChanging(value: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]]): Self = this.set("PositionChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPosition(value: Double => Unit): Self = this.set("SetPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPositionEnd(value: Double => Unit): Self = this.set("SetPositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPositionStart(value: Double => Unit): Self = this.set("SetPositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrack(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = this.set("Track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackEnd(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = this.set("TrackEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStart(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]]): Self = this.set("TrackStart", value.asInstanceOf[js.Any])
  }
}
