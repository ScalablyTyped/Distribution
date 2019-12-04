package typings.dojo.dojox.html.styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/styles.metrics.html
  *
  *
  */
trait metrics extends js.Object {
  /**
    *
    * @param recalculate
    */
  def getCachedFontMeasurements(recalculate: js.Any): js.Any
  /**
    * Returns an object that has pixel equivilents of standard font size values.
    *
    */
  def getFontMeasurements(): js.Object
  /**
    *
    */
  def getScrollbar(): js.Object
  /**
    *
    * @param text
    * @param style
    * @param className               Optional
    */
  def getTextBox(text: String, style: js.Object, className: String): Unit
  /**
    *
    */
  def initOnFontResize(): Unit
}

object metrics {
  @scala.inline
  def apply(
    getCachedFontMeasurements: js.Any => js.Any,
    getFontMeasurements: () => js.Object,
    getScrollbar: () => js.Object,
    getTextBox: (String, js.Object, String) => Unit,
    initOnFontResize: () => Unit
  ): metrics = {
    val __obj = js.Dynamic.literal(getCachedFontMeasurements = js.Any.fromFunction1(getCachedFontMeasurements), getFontMeasurements = js.Any.fromFunction0(getFontMeasurements), getScrollbar = js.Any.fromFunction0(getScrollbar), getTextBox = js.Any.fromFunction3(getTextBox), initOnFontResize = js.Any.fromFunction0(initOnFontResize))
  
    __obj.asInstanceOf[metrics]
  }
}

