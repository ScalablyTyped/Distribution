package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxProgressBar control.
  */
@JSGlobal("ASPxClientProgressBar")
@js.native
class ASPxClientProgressBar () extends ASPxClientEditBase {
  /**
    * Returns the text displayed within the progress bar.
    */
  def GetDisplayText(): String = js.native
  /**
    * Gets the maximum range value of the progress bar.
    */
  def GetMaximum(): Double = js.native
  /**
    * Gets the minimum range value of the progress bar.
    */
  def GetMinimum(): Double = js.native
  /**
    * Sets the percentage representation of the progress position.
    */
  def GetPercent(): Double = js.native
  /**
    * Gets the position of the operation's progress.
    */
  def GetPosition(): Double = js.native
  /**
    * Sets the pattern used to format the displayed text for the progress bar.
    * @param text A  value that is the format pattern.
    */
  def SetCustomDisplayFormat(text: String): Unit = js.native
  /**
    * Sets the maximum range value of the progress bar.
    * @param max An integer value specifying the maximum value of the progress bar range.
    */
  def SetMaximum(max: Double): Unit = js.native
  /**
    * Sets the minimum and maximum range values of the progress bar.
    * @param minValue An integer value specifying the minimum value of the progress bar range.
    * @param maxValue An integer value specifying the maximum value of the progress bar range.
    */
  def SetMinMaxValues(minValue: Double, maxValue: Double): Unit = js.native
  /**
    * Sets the minimum range value of the progress bar.
    * @param min An integer value specifying the minimum value of the progress bar range.
    */
  def SetMinimum(min: Double): Unit = js.native
  /**
    * Sets the position of the operation's progress.
    * @param position An integer value specifying the progress position.
    */
  def SetPosition(position: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientProgressBar")
@js.native
object ASPxClientProgressBar extends js.Object {
  /**
    * Converts the specified object to the ASPxClientProgressBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientProgressBar = js.native
}

