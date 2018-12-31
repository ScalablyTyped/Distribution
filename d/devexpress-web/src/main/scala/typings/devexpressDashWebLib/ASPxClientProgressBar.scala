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

