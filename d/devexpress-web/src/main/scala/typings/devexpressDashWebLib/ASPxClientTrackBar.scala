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

