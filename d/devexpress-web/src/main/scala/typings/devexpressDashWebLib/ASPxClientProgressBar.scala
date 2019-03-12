package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxProgressBar control.
  */
trait ASPxClientProgressBar extends ASPxClientEditBase {
  /**
    * Returns the text displayed within the progress bar.
    */
  def GetDisplayText(): java.lang.String
  /**
    * Gets the maximum range value of the progress bar.
    */
  def GetMaximum(): scala.Double
  /**
    * Gets the minimum range value of the progress bar.
    */
  def GetMinimum(): scala.Double
  /**
    * Sets the percentage representation of the progress position.
    */
  def GetPercent(): scala.Double
  /**
    * Gets the position of the operation's progress.
    */
  def GetPosition(): scala.Double
  /**
    * Sets the pattern used to format the displayed text for the progress bar.
    * @param text A  value that is the format pattern.
    */
  def SetCustomDisplayFormat(text: java.lang.String): scala.Unit
  /**
    * Sets the maximum range value of the progress bar.
    * @param max An integer value specifying the maximum value of the progress bar range.
    */
  def SetMaximum(max: scala.Double): scala.Unit
  /**
    * Sets the minimum and maximum range values of the progress bar.
    * @param minValue An integer value specifying the minimum value of the progress bar range.
    * @param maxValue An integer value specifying the maximum value of the progress bar range.
    */
  def SetMinMaxValues(minValue: scala.Double, maxValue: scala.Double): scala.Unit
  /**
    * Sets the minimum range value of the progress bar.
    * @param min An integer value specifying the minimum value of the progress bar range.
    */
  def SetMinimum(min: scala.Double): scala.Unit
  /**
    * Sets the position of the operation's progress.
    * @param position An integer value specifying the progress position.
    */
  def SetPosition(position: scala.Double): scala.Unit
}

object ASPxClientProgressBar {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    GetCaption: () => java.lang.String,
    GetClientVisible: () => scala.Boolean,
    GetDisplayText: () => java.lang.String,
    GetEnabled: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetMaximum: () => scala.Double,
    GetMinimum: () => scala.Double,
    GetParentControl: () => js.Object,
    GetPercent: () => scala.Double,
    GetPosition: () => scala.Double,
    GetValue: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetCaption: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetCustomDisplayFormat: java.lang.String => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetMaximum: scala.Double => scala.Unit,
    SetMinMaxValues: (scala.Double, scala.Double) => scala.Unit,
    SetMinimum: scala.Double => scala.Unit,
    SetPosition: scala.Double => scala.Unit,
    SetValue: js.Object => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientProgressBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaximum = js.Any.fromFunction0(GetMaximum), GetMinimum = js.Any.fromFunction0(GetMinimum), GetParentControl = js.Any.fromFunction0(GetParentControl), GetPercent = js.Any.fromFunction0(GetPercent), GetPosition = js.Any.fromFunction0(GetPosition), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetCustomDisplayFormat = js.Any.fromFunction1(SetCustomDisplayFormat), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetMaximum = js.Any.fromFunction1(SetMaximum), SetMinMaxValues = js.Any.fromFunction2(SetMinMaxValues), SetMinimum = js.Any.fromFunction1(SetMinimum), SetPosition = js.Any.fromFunction1(SetPosition), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientProgressBar]
  }
}

