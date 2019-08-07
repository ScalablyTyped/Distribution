package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxTrackBar control.
  */
@JSGlobal("ASPxClientTrackBar")
@js.native
class ASPxClientTrackBar () extends ASPxClientEdit {
  /**
    * Fires after the editor's position has been changed.
    */
  var PositionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTrackBar]] = js.native
  /**
    * Fires on the client side before a track bar position is changed and allows you to cancel the action.
    */
  var PositionChanging: ASPxClientEvent[ASPxClientTrackBarPositionChangingEventHandler[ASPxClientTrackBar]] = js.native
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
}

/* static members */
@JSGlobal("ASPxClientTrackBar")
@js.native
object ASPxClientTrackBar extends js.Object {
  /**
    * Converts the specified object to the ASPxClientTrackBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientTrackBar = js.native
}

