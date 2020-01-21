package typings.dojo.dojox.dgauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.endThickness
import typings.dojo.dojoStrings.fill
import typings.dojo.dojoStrings.paddingBottom
import typings.dojo.dojoStrings.paddingLeft
import typings.dojo.dojoStrings.paddingRight
import typings.dojo.dojoStrings.paddingTop
import typings.dojo.dojoStrings.start
import typings.dojo.dojoStrings.startThickness
import typings.dojo.dojoStrings.stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/RectangularRangeIndicator.html
  *
  * A RectangularRangeIndicator is used to represent a range of values on a scale.
  * For adding this kind of indicator instance to the gauge, use the addIndicator
  * method of RectangularScale.
  *
  */
@JSGlobal("dojox.dgauges.RectangularRangeIndicator")
@js.native
class RectangularRangeIndicator () extends ScaleIndicatorBase {
  /**
    * The thickness in pixels of the shape at the position defined by the value property.
    * Default is 10.
    *
    */
  var endThickness: Double = js.native
  /**
    * A fill object that will be passed to the setFill method of GFX.
    *
    */
  var fill: js.Object = js.native
  /**
    * The bottom padding. Not used for vertical gauges.
    *
    */
  var paddingBottom: Double = js.native
  /**
    * The left padding. Not used for horizontal gauges.
    *
    */
  var paddingLeft: Double = js.native
  /**
    * The right padding. Not used for horizontal gauges.
    *
    */
  var paddingRight: Double = js.native
  /**
    * The top padding. Not used for vertical gauges.
    *
    */
  var paddingTop: Double = js.native
  /**
    * The start value of the range. Default is 0.
    *
    */
  var start: Double = js.native
  /**
    * The thickness in pixels of the shape at the position defined by the start property.
    * Default is 10.
    *
    */
  var startThickness: Double = js.native
  /**
    * A stroke object that will be passed to the setStroke method of GFX.
    *
    */
  var stroke: js.Object = js.native
  @JSName("get")
  def get_endThickness(property: endThickness): Double = js.native
  @JSName("get")
  def get_fill(property: fill): js.Object = js.native
  @JSName("get")
  def get_paddingBottom(property: paddingBottom): Double = js.native
  @JSName("get")
  def get_paddingLeft(property: paddingLeft): Double = js.native
  @JSName("get")
  def get_paddingRight(property: paddingRight): Double = js.native
  @JSName("get")
  def get_paddingTop(property: paddingTop): Double = js.native
  @JSName("get")
  def get_start(property: start): Double = js.native
  @JSName("get")
  def get_startThickness(property: startThickness): Double = js.native
  @JSName("get")
  def get_stroke(property: stroke): js.Object = js.native
  @JSName("set")
  def set_endThickness(property: endThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_fill(property: fill, value: js.Object): Unit = js.native
  @JSName("set")
  def set_paddingBottom(property: paddingBottom, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingLeft(property: paddingLeft, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingRight(property: paddingRight, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingTop(property: paddingTop, value: Double): Unit = js.native
  @JSName("set")
  def set_start(property: start, value: Double): Unit = js.native
  @JSName("set")
  def set_startThickness(property: startThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_stroke(property: stroke, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_endThickness(
    property: endThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fill(
    property: fill,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingBottom(
    property: paddingBottom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingLeft(
    property: paddingLeft,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingRight(
    property: paddingRight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingTop(
    property: paddingTop,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_start(
    property: start,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_startThickness(
    property: startThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_stroke(
    property: stroke,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

