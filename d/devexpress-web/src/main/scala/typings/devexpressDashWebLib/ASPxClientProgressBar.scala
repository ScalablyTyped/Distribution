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
    AdjustControl: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetDisplayText: js.Function0[java.lang.String],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetMaximum: js.Function0[scala.Double],
    GetMinimum: js.Function0[scala.Double],
    GetParentControl: js.Function0[js.Object],
    GetPercent: js.Function0[scala.Double],
    GetPosition: js.Function0[scala.Double],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetCustomDisplayFormat: js.Function1[java.lang.String, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetMaximum: js.Function1[scala.Double, scala.Unit],
    SetMinMaxValues: js.Function2[scala.Double, scala.Double, scala.Unit],
    SetMinimum: js.Function1[scala.Double, scala.Unit],
    SetPosition: js.Function1[scala.Double, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetDisplayText")(GetDisplayText)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetMaximum")(GetMaximum)
    __obj.updateDynamic("GetMinimum")(GetMinimum)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetPercent")(GetPercent)
    __obj.updateDynamic("GetPosition")(GetPosition)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetCustomDisplayFormat")(SetCustomDisplayFormat)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetMaximum")(SetMaximum)
    __obj.updateDynamic("SetMinMaxValues")(SetMinMaxValues)
    __obj.updateDynamic("SetMinimum")(SetMinimum)
    __obj.updateDynamic("SetPosition")(SetPosition)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientProgressBar]
  }
}

