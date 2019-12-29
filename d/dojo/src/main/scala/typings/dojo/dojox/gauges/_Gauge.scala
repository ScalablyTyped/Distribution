package typings.dojo.dojox.gauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.background
import typings.dojo.dojoStrings.defaultColors
import typings.dojo.dojoStrings.gaugeContent
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.hideValues
import typings.dojo.dojoStrings.image
import typings.dojo.dojoStrings.majorTicks
import typings.dojo.dojoStrings.max
import typings.dojo.dojoStrings.min
import typings.dojo.dojoStrings.minorTicks
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.surface
import typings.dojo.dojoStrings.useRangeStyles
import typings.dojo.dojoStrings.useTooltip
import typings.dojo.dojoStrings.width
import typings.dojo.dojox.gfx.Group
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/_Gauge.html
  *
  * The abstract base class for gauges.
  * using dojo.gfx (and thus either SVG or VML based on what is supported), this widget
  * builds a gauge component, used to display numerical data in a familiar format.
  * This widget is not to be used alone. it is meant to be subclassed, such as
  * dojox.gauges.BarGauge or dojox.gauges.AnalogGauge
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges._Gauge")
@js.native
class _Gauge () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The color of the background.  This must be an object of one of two forms:
    * {'color': 'color-name'}
    * OR
    * (for a gradient:)
    * {'type': 'linear', 'x1': 0, 'x2': 0, 'y1': 0, 'y2': 200, 'colors': [{offset: 0, color:'#C0C0C0'}, {offset: 1, color: '#E0E0E0'}] }
    *
    */
  var background: js.Object = js.native
  /**
    * Set of default colors to color ranges with.
    *
    */
  var defaultColors: js.Array[_] = js.native
  /**
    *
    */
  var gaugeContent: js.Array[_] = js.native
  /**
    * The height of the gauge (default is 200)
    *
    */
  var height: Double = js.native
  /**
    * Indicates whether the text boxes showing the value of the indicator (as text
    * content) should be hidden or shown.  Default is not hidden, aka shown.
    *
    */
  var hideValues: Boolean = js.native
  /**
    * Background image for gauge (default is no image)
    *
    */
  var image: String = js.native
  /**
    * An object representing the tick marks that should be added to the gauge. Major tick marks have a text label
    * indicating the value.  The object can have the following attributes (required are marked with a *):
    *
    * offset: the distance from the 'center' of the gauge.  Used differently for Analog vs. Bar
    * width: The width of the mark
    * length: The length of the mark
    * interval: The interval the ticks should be added on
    * color: The color of the mark and text
    * font: an object with any/all of the following parameters:
    *   {family: "Helvetica", style: "italic", variant: 'small-caps', weight: 'bold', size: "18pt"}
    *
    *
    */
  var majorTicks: js.Object = js.native
  /**
    * The maximum value of the gauge.  Normally not set explicitly, as it will be determined by
    * the ranges that are added.
    *
    */
  var max: Double = js.native
  /**
    * The minimum value of the gauge.  Normally not set explicitly, as it will be determined by
    * the ranges that are added.
    *
    */
  var min: Double = js.native
  /**
    * An object of the same format as majorTicks, indicating where the minor (label-less) marks should be placed
    * The font parameter is ignored if provided since minor tick marks have no text label.
    *
    */
  var minorTicks: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__Gauge: String = js.native
  /**
    * The GFX surface that the shapes are drawn on.  Can be accessed/used by indicators to draw themselves
    *
    */
  var surface: js.Object = js.native
  /**
    * Indicates whether to use given css classes (dojoxGaugeRangeXX)
    * to determine the color (and other style attributes?) of the ranges
    * this value should be the number of dojoxGaugeRange classes that are
    * defined, starting at dojoxGaugeRange1 (0 indicates falling to default
    * hardcoded colors)
    *
    */
  var useRangeStyles: Double = js.native
  /**
    * Indicates whether tooltips should be displayed for ranges, indicators, etc.
    *
    */
  var useTooltip: Boolean = js.native
  /**
    * The width of the gauge (default is 300)
    *
    */
  var width: Double = js.native
  /**
    * This method is used to add an indicator to the gauge.
    * This method adds an indicator, such as a t needle,
    * to the gauge.
    *
    * @param indicator A dojox.gauges._Indicator or an object with similar parameters(value, color, offset, etc.).
    */
  def addIndicator(indicator: _Indicator): js.Any = js.native
  /**
    * This method is used to add a range to the gauge.
    * Creates a range (colored area on the background of the gauge)
    * based on the given arguments.
    *
    * @param range A range is either a dojox.gauges.Range object, or a objectwith similar parameters (low, high, hover, etc.).
    */
  def addRange(range: Range): Unit = js.native
  /**
    * This method is used to add ranges to the gauge.
    * Creates a range (colored area on the background of the gauge)
    * based on the given arguments.
    *
    * @param ranges
    */
  def addRanges(ranges: js.Array[_]): Unit = js.native
  /**
    * Internal method used by the gauge to create the graphics surface area
    *
    */
  def createSurface(): Unit = js.native
  /**
    * This function is used to draw (or redraw) the gauge.
    * Draws the gauge by drawing the surface, the ranges, and the indicators.
    *
    */
  def draw(): Unit = js.native
  /**
    * This function is used to draw (or redraw) the background of the gauge.
    * The method may be used by subclasses to draw (or redraw) the background of the gauge.
    *
    * @param group
    */
  def drawBackground(group: js.Any): Unit = js.native
  /**
    * This function is used to draw (or redraw) the foreground of the gauge.
    * The method may be used by subclasses to draw (or redraw) the foreground of the gauge.
    *
    * @param group
    */
  def drawForeground(group: js.Any): Unit = js.native
  /**
    * This function is used draw text onto the gauge.  The text object
    * is also returned by the function so that may be removed later
    * by calling removeText
    *
    * @param group The GFX Group where the text will be added.
    * @param txt The text to be drawn
    * @param x The x coordinate at which to place the text
    * @param y The y coordinate at which to place the text
    * @param align               OptionalIndicates how to align the textValid value is 'right', otherwise text is left-aligned
    * @param color               OptionalIndicates the color of the text
    * @param font               OptionalA font object, generally of the following format:{family: "Helvetica", style: "italic", variant: 'small-caps', weight: 'bold', size: "18pt"}
    */
  def drawText(group: Group, txt: String, x: Double, y: Double, align: String, color: String, font: js.Object): js.Any = js.native
  @JSName("get")
  def get_background(property: background): js.Object = js.native
  @JSName("get")
  def get_defaultColors(property: defaultColors): js.Array[_] = js.native
  @JSName("get")
  def get_gaugeContent(property: gaugeContent): js.Array[_] = js.native
  @JSName("get")
  def get_height(property: height): Double = js.native
  @JSName("get")
  def get_hideValues(property: hideValues): Boolean = js.native
  @JSName("get")
  def get_image(property: image): String = js.native
  @JSName("get")
  def get_majorTicks(property: majorTicks): js.Object = js.native
  @JSName("get")
  def get_max(property: max): Double = js.native
  @JSName("get")
  def get_min(property: min): Double = js.native
  @JSName("get")
  def get_minorTicks(property: minorTicks): js.Object = js.native
  @JSName("get")
  def get_surface(property: surface): js.Object = js.native
  @JSName("get")
  def get_useRangeStyles(property: useRangeStyles): Double = js.native
  @JSName("get")
  def get_useTooltip(property: useTooltip): Boolean = js.native
  @JSName("get")
  def get_width(property: width): Double = js.native
  /**
    * This is an internal handler used by the gauge to support using
    * the mouse to move indicators
    *
    * @param e The event object
    */
  def handleMouseDown(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support using
    * the mouse to show the tooltips
    *
    * @param e The event object
    */
  def handleMouseMove(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support
    * hover text
    *
    * @param e The event object
    */
  def handleMouseOut(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support
    * hover text
    *
    * @param e The event object
    */
  def handleMouseOver(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support using
    * touch events to drag an indicator to modify it's value
    *
    * @param e The touch e object
    */
  def handleTouchEnd(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support using
    * touch events to drag an indicator to modify it's value
    *
    * @param e The touch event object
    */
  def handleTouchMove(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support using
    * touch events to drag an indicator to modify it's value
    *
    * @param e The touch event object
    */
  def handleTouchStart(e: js.Object): Unit = js.native
  /**
    * This is an internal handler used by the gauge to support using
    * touch events to drag an indicator to modify it's value
    *
    * @param indicator The indicator object
    * @param e The event object
    */
  def handleTouchStartIndicator(indicator: _Indicator, e: js.Object): Unit = js.native
  /**
    * Returns true if widget has children, i.e. if this.containerNode contains something.
    *
    */
  def hasChildren(): Boolean = js.native
  /**
    * This function is used to move an indicator the the front (top)
    * of the gauge
    *
    * @param indicator A dojox.gauges._Indicator or an object with similar parameters(value, color, offset, etc.).
    */
  def moveIndicatorToFront(indicator: _Indicator): Unit = js.native
  /**
    * Removes the given indicator from the gauge by calling it's remove function
    * and removing it from the local cache.
    *
    * @param indicator The indicator to remove.
    */
  def removeIndicator(indicator: _Indicator): Unit = js.native
  /**
    * Removes a text element from the gauge.
    *
    * @param t The text to remove.
    */
  def removeText(t: String): Unit = js.native
  /**
    * This method is used to set the background of the gauge after it is created.
    * Sets the background using the given object.  Must be the same 'type' of object
    * as the original background argument.
    *
    * @param background An object in one of the two forms:{'color': 'color-name'}OR (for a gradient:){'type': 'linear', 'colors': [{offset: 0, color:'#C0C0C0'}, {offset: 1, color: '#E0E0E0'}] }If background is null or undefined, this will set the fill to this._backgroundDefault
    */
  def setBackground(background: js.Object): Unit = js.native
  /**
    * Creates and draws the major tick marks based on the passed object (expecting the same format
    * as the majorTicks object documented above)
    *
    * @param ticks
    */
  def setMajorTicks(ticks: js.Object): Unit = js.native
  /**
    * Creates and draws the minor tick marks based on the passed object (expecting the same format
    * as the minorTicks object documented above)
    *
    * @param ticks
    */
  def setMinorTicks(ticks: js.Object): Unit = js.native
  @JSName("set")
  def set_background(property: background, value: js.Object): Unit = js.native
  @JSName("set")
  def set_defaultColors(property: defaultColors, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_gaugeContent(property: gaugeContent, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: Double): Unit = js.native
  @JSName("set")
  def set_hideValues(property: hideValues, value: Boolean): Unit = js.native
  @JSName("set")
  def set_image(property: image, value: String): Unit = js.native
  @JSName("set")
  def set_majorTicks(property: majorTicks, value: js.Object): Unit = js.native
  @JSName("set")
  def set_max(property: max, value: Double): Unit = js.native
  @JSName("set")
  def set_min(property: min, value: Double): Unit = js.native
  @JSName("set")
  def set_minorTicks(property: minorTicks, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_surface(property: surface, value: js.Object): Unit = js.native
  @JSName("set")
  def set_useRangeStyles(property: useRangeStyles, value: Double): Unit = js.native
  @JSName("set")
  def set_useTooltip(property: useTooltip, value: Boolean): Unit = js.native
  @JSName("set")
  def set_width(property: width, value: Double): Unit = js.native
  /**
    * Updates the tooltip for the gauge to display the given text.
    *
    * @param txt The text to put in the tooltip.
    * @param e
    */
  def updateTooltip(txt: String, e: Event): Unit = js.native
  @JSName("watch")
  def watch_background(
    property: background,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultColors(
    property: defaultColors,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_gaugeContent(
    property: gaugeContent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_height(
    property: height,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hideValues(
    property: hideValues,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_image(
    property: image,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_majorTicks(
    property: majorTicks,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_max(
    property: max,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_min(
    property: min,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minorTicks(
    property: minorTicks,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_surface(
    property: surface,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useRangeStyles(
    property: useRangeStyles,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useTooltip(
    property: useTooltip,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_width(
    property: width,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

