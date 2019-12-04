package typings.dojo.dojox.charting.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/bidi/Chart.html
  *
  *
  */
@JSGlobal("dojox.charting.bidi.Chart")
@js.native
class Chart () extends js.Object {
  /**
    * Mirroring support,  the main variable which is responsible for the direction of the chart.
    *
    * Allowed values:
    * 1. "ltr"
    * 2. "rtl"
    *
    * By default is ltr.
    *
    */
  var dir: String = js.native
  /**
    *
    */
  var isMirrored: Boolean = js.native
  /**
    * Bi-directional support, the main variable which is responsible for the direction of the text.
    * The text direction can be different than the GUI direction by using this parameter.
    * Allowed values:
    *
    * "ltr"
    * "rtl"
    * "auto" - contextual the direction of a text defined by first strong letter.
    * By default is as the page direction.
    *
    */
  var textDir: String = js.native
  /**
    * apply the mirroring operation to the current chart plots.
    *
    * @param plot
    * @param dim
    * @param offsets
    */
  def applyMirroring(plot: js.Any, dim: js.Any, offsets: js.Any): js.Function = js.native
  /**
    *
    * @param element
    * @param label
    * @param labelType
    */
  def formatTruncatedLabel(element: js.Any, label: js.Any, labelType: js.Any): Unit = js.native
  /**
    * Return direction of the text.
    * If textDir is ltr or rtl returns the value.
    * If it's auto, calls to another function that responsible
    * for checking the value, and defining the direction.
    *
    * @param text Used in case textDir is "auto", this case the direction is according to the firststrong (directionally - which direction is strong defined) letter.
    */
  def getTextDir(text: js.Any): js.Any = js.native
  /**
    * check the direction of the chart.
    * check the dir attribute to determine the rendering direction
    * of the chart.
    *
    */
  def isRightToLeft(): Boolean = js.native
  /**
    *
    */
  def render(): js.Function = js.native
  /**
    * Setter for the dir attribute.
    * Allows dynamically set the dri attribute, which will used to
    * updates the chart rendering direction.
    * dir : the desired chart direction [rtl: for right to left ,ltr: for left to right]
    *
    * @param dir
    */
  def setDir(dir: js.Any): js.Function = js.native
  /**
    * Setter for the textDir attribute.
    * Allows dynamically set the textDir, goes over all the text-children andupdates their base text direction.
    *
    * @param newTextDir
    * @param obj
    */
  def setTextDir(newTextDir: js.Any, obj: js.Any): js.Function = js.native
}

