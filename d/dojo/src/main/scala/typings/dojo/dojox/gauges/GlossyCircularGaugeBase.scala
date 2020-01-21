package typings.dojo.dojox.gauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.color
import typings.dojo.dojoStrings.font
import typings.dojo.dojoStrings.majorTicksColor
import typings.dojo.dojoStrings.majorTicksInterval
import typings.dojo.dojoStrings.majorTicksLabelPlacement
import typings.dojo.dojoStrings.minorTicksColor
import typings.dojo.dojoStrings.minorTicksInterval
import typings.dojo.dojoStrings.needleColor
import typings.dojo.dojoStrings.noChange
import typings.dojo.dojoStrings.scalePrecision
import typings.dojo.dojoStrings.textIndicatorColor
import typings.dojo.dojoStrings.textIndicatorFont
import typings.dojo.dojoStrings.textIndicatorPrecision
import typings.dojo.dojoStrings.textIndicatorVisible
import typings.dojo.dojoStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/GlossyCircularGaugeBase.html
  *
  * The base class for GlossyCircularGauge and GlossySemiCircularGauge.
  *
  */
@JSGlobal("dojox.gauges.GlossyCircularGaugeBase")
@js.native
class GlossyCircularGaugeBase () extends AnalogGauge {
  /**
    * The main color of the gauge.
    *
    */
  var color: String = js.native
  /**
    * The font of the gauge
    *
    */
  var font: js.Object = js.native
  /**
    * Color of major tick marks
    *
    */
  var majorTicksColor: js.Object = js.native
  /**
    * Interval between major ticks
    *
    */
  var majorTicksInterval: Double = js.native
  /**
    * Placement of major tick labels
    *
    */
  var majorTicksLabelPlacement: String = js.native
  /**
    * Color of minor tick marks
    *
    */
  var minorTicksColor: js.Object = js.native
  /**
    * Interval between minor ticks
    *
    */
  var minorTicksInterval: Double = js.native
  /**
    * The main color of the needle.
    *
    */
  var needleColor: js.Object = js.native
  /**
    * Indicates if the gauge reacts to touch events
    *
    */
  var noChange: Boolean = js.native
  /**
    * The precision for the formatting of numbers in the scale (default is 0)
    *
    */
  var scalePrecision: Double = js.native
  /**
    * The color of the text indicator
    *
    */
  var textIndicatorColor: js.Object = js.native
  /**
    * The font of the text indicator
    *
    */
  var textIndicatorFont: String = js.native
  /**
    * The precision for the formatting of numbers in the text indicator (default is 0)
    *
    */
  var textIndicatorPrecision: Double = js.native
  /**
    * Indicates if the text indicator is visible
    *
    */
  var textIndicatorVisible: Boolean = js.native
  /**
    * The value of the gauge.
    *
    */
  var value: Double = js.native
  /**
    * Returns the size of the major ticks.
    *
    */
  def getMajorTicksLength(): js.Any = js.native
  /**
    * Return the distance from gauge's center to major ticks
    *
    */
  def getMajorTicksOffset(): js.Any = js.native
  /**
    * Return the size of the minor ticks.
    *
    */
  def getMinorTicksLength(): js.Any = js.native
  /**
    * Returns the distance from gauge's center to minor ticks
    *
    */
  def getMinorTicksOffset(): js.Any = js.native
  @JSName("get")
  def get_color(property: color): String = js.native
  @JSName("get")
  def get_font(property: font): js.Object = js.native
  @JSName("get")
  def get_majorTicksColor(property: majorTicksColor): js.Object = js.native
  @JSName("get")
  def get_majorTicksInterval(property: majorTicksInterval): Double = js.native
  @JSName("get")
  def get_majorTicksLabelPlacement(property: majorTicksLabelPlacement): String = js.native
  @JSName("get")
  def get_minorTicksColor(property: minorTicksColor): js.Object = js.native
  @JSName("get")
  def get_minorTicksInterval(property: minorTicksInterval): Double = js.native
  @JSName("get")
  def get_needleColor(property: needleColor): js.Object = js.native
  @JSName("get")
  def get_noChange(property: noChange): Boolean = js.native
  @JSName("get")
  def get_scalePrecision(property: scalePrecision): Double = js.native
  @JSName("get")
  def get_textIndicatorColor(property: textIndicatorColor): js.Object = js.native
  @JSName("get")
  def get_textIndicatorFont(property: textIndicatorFont): String = js.native
  @JSName("get")
  def get_textIndicatorPrecision(property: textIndicatorPrecision): Double = js.native
  @JSName("get")
  def get_textIndicatorVisible(property: textIndicatorVisible): Boolean = js.native
  @JSName("get")
  def get_value(property: value): Double = js.native
  /**
    * Invoked when the value of the gauge has changed.
    *
    */
  def onValueChanged(): Unit = js.native
  /**
    * Sets the size of the major ticks.
    *
    * @param length
    */
  def setMajorTicksLength(length: js.Any): js.Function = js.native
  /**
    * Sets the distance from gauge's center to major ticks
    *
    * @param offset
    */
  def setMajorTicksOffset(offset: js.Any): js.Function = js.native
  /**
    * Sets the size of the minor ticks.
    *
    * @param length
    */
  def setMinorTicksLength(length: js.Any): js.Function = js.native
  /**
    * Sets the distance from gauge's center to minor ticks
    *
    * @param offset
    */
  def setMinorTicksOffset(offset: js.Any): js.Function = js.native
  @JSName("set")
  def set_color(property: color, value: String): Unit = js.native
  @JSName("set")
  def set_font(property: font, value: js.Object): Unit = js.native
  @JSName("set")
  def set_majorTicksColor(property: majorTicksColor, value: js.Object): Unit = js.native
  @JSName("set")
  def set_majorTicksInterval(property: majorTicksInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_majorTicksLabelPlacement(property: majorTicksLabelPlacement, value: String): Unit = js.native
  @JSName("set")
  def set_minorTicksColor(property: minorTicksColor, value: js.Object): Unit = js.native
  @JSName("set")
  def set_minorTicksInterval(property: minorTicksInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_needleColor(property: needleColor, value: js.Object): Unit = js.native
  @JSName("set")
  def set_noChange(property: noChange, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scalePrecision(property: scalePrecision, value: Double): Unit = js.native
  @JSName("set")
  def set_textIndicatorColor(property: textIndicatorColor, value: js.Object): Unit = js.native
  @JSName("set")
  def set_textIndicatorFont(property: textIndicatorFont, value: String): Unit = js.native
  @JSName("set")
  def set_textIndicatorPrecision(property: textIndicatorPrecision, value: Double): Unit = js.native
  @JSName("set")
  def set_textIndicatorVisible(property: textIndicatorVisible, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  @JSName("watch")
  def watch_color(
    property: color,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_font(
    property: font,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_majorTicksColor(
    property: majorTicksColor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_majorTicksInterval(
    property: majorTicksInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_majorTicksLabelPlacement(
    property: majorTicksLabelPlacement,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minorTicksColor(
    property: minorTicksColor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minorTicksInterval(
    property: minorTicksInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_needleColor(
    property: needleColor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_noChange(
    property: noChange,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scalePrecision(
    property: scalePrecision,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_textIndicatorColor(
    property: textIndicatorColor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_textIndicatorFont(
    property: textIndicatorFont,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_textIndicatorPrecision(
    property: textIndicatorPrecision,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_textIndicatorVisible(
    property: textIndicatorVisible,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

