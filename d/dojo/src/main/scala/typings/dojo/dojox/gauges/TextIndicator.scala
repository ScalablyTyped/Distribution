package typings.dojo.dojox.gauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.align
import typings.dojo.dojoStrings.fixedPrecision
import typings.dojo.dojoStrings.precision
import typings.dojo.dojoStrings.x
import typings.dojo.dojoStrings.y
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/TextIndicator.html
  *
  * A gauge indicator the simply draws its value as text.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.TextIndicator")
@js.native
class TextIndicator () extends Indicator {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The horizontal alignment of the text, the value can be 'middle' (the default), 'left' or 'right'
    *
    */
  var align: String = js.native
  /**
    * Indicates that the number is displayed in fixed precision or not (precision is defined by the 'precision' property (default is true).
    *
    */
  var fixedPrecision: Boolean = js.native
  /**
    * The number of tailing digits to display the value of the indicator when the 'fixedPrecision' property is set to true (default is 0).
    *
    */
  var precision: Double = js.native
  /**
    * The x coordinate of the indicator
    *
    */
  var x: Double = js.native
  /**
    * The y coordinate of the indicator
    *
    */
  var y: Double = js.native
  /**
    * Override of dojox.gauges._Indicator.draw
    *
    * @param group
    * @param dontAnimate               Optional
    */
  def draw(): Unit = js.native
  def draw(group: js.Any): Unit = js.native
  def draw(group: js.Any, dontAnimate: Boolean): Unit = js.native
  @JSName("get")
  def get_align(property: align): String = js.native
  @JSName("get")
  def get_fixedPrecision(property: fixedPrecision): Boolean = js.native
  @JSName("get")
  def get_precision(property: precision): Double = js.native
  @JSName("get")
  def get_x(property: x): Double = js.native
  @JSName("get")
  def get_y(property: y): Double = js.native
  @JSName("set")
  def set_align(property: align, value: String): Unit = js.native
  @JSName("set")
  def set_fixedPrecision(property: fixedPrecision, value: Boolean): Unit = js.native
  @JSName("set")
  def set_precision(property: precision, value: Double): Unit = js.native
  @JSName("set")
  def set_x(property: x, value: Double): Unit = js.native
  @JSName("set")
  def set_y(property: y, value: Double): Unit = js.native
  @JSName("watch")
  def watch_align(
    property: align,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedPrecision(
    property: fixedPrecision,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_precision(
    property: precision,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_x(
    property: x,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_y(
    property: y,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

