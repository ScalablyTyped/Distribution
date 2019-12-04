package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.font
import typings.dojo.dojoStrings.labelGap
import typings.dojo.dojoStrings.labelPosition
import typings.dojo.dojoStrings.scaler
import typings.dojo.dojoStrings.tickStroke
import typings.dojo.dojox.gfx.Group
import typings.dojo.dojox.widget._Invalidating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/ScaleBase.html
  *
  * The ScaleBase class is the base class for the circular and rectangular scales.
  * A scaler must be set to use this class. A scaler is responsible for
  * tick generation and various data-transform operations.
  *
  */
@JSGlobal("dojox.dgauges.ScaleBase")
@js.native
class ScaleBase () extends _Invalidating {
  /**
    * The font used for the ticks labels.
    * This is null by default which means this scale use the font defined
    * on the gauge.
    *
    */
  var font: js.Object = js.native
  /**
    * The label gap between the ticks and their labels. Default value is 1.
    *
    */
  var labelGap: Double = js.native
  /**
    * See CircularScale and RectangularScale for valid values.
    *
    */
  var labelPosition: String = js.native
  /**
    * The scaler used for tick generation and data-transform operations.
    * This property is mandatory for using the scale.
    *
    */
  var scaler: js.Object = js.native
  /**
    * The GFX stroke used by the default tickShapeFunc implementation.
    *
    */
  var tickStroke: js.Object = js.native
  /**
    * Add an indicator to the scale. Before calling this function, ensure
    * this scale has already been added to a gauge using the addElement method
    * of the gauge.
    *
    * @param name The name of the indicator to be added.
    * @param indicator The indicator to add to this scale.
    * @param behindScale If true, this indicator is drawn behind the scale. Default value is false.
    */
  def addIndicator(name: String, indicator: IndicatorBase, behindScale: Boolean): js.Any = js.native
  /**
    * Get an indicator instance.
    *
    * @param name The name of the indicator as defined using addIndicator.
    */
  def getIndicator(name: String): js.Any = js.native
  /**
    * Gets the GFX shape of an indicator.
    *
    * @param name The name of the indicator as defined using addIndicator.
    */
  def getIndicatorRenderer(name: String): js.Any = js.native
  @JSName("get")
  def get_font(property: font): js.Object = js.native
  @JSName("get")
  def get_labelGap(property: labelGap): Double = js.native
  @JSName("get")
  def get_labelPosition(property: labelPosition): String = js.native
  @JSName("get")
  def get_scaler(property: scaler): js.Object = js.native
  @JSName("get")
  def get_tickStroke(property: tickStroke): js.Object = js.native
  /**
    * See CircularScale and Rectangular for more informations.
    *
    * @param value The value to convert.
    */
  def positionForValue(value: Double): js.Any = js.native
  /**
    * Removes an indicator.
    *
    * @param name The name of the indicator as defined using addIndicator.
    */
  def removeIndicator(name: String): js.Any = js.native
  @JSName("set")
  def set_font(property: font, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelGap(property: labelGap, value: Double): Unit = js.native
  @JSName("set")
  def set_labelPosition(property: labelPosition, value: String): Unit = js.native
  @JSName("set")
  def set_scaler(property: scaler, value: js.Object): Unit = js.native
  @JSName("set")
  def set_tickStroke(property: tickStroke, value: js.Object): Unit = js.native
  /**
    * Customize the text of ticks labels.
    *
    * @param tickItem An object containing the tick informations.
    */
  def tickLabelFunc(tickItem: js.Object): js.Any = js.native
  /**
    * Customize the shape of ticks.
    *
    * @param group The GFX group used for drawing the tick.
    * @param scale The scale being processed.
    * @param tickItem An object containing the tick informations.
    */
  def tickShapeFunc(group: Group, scale: ScaleBase, tickItem: js.Object): js.Any = js.native
  /**
    * See CircularScale and Rectangular for more informations.
    *
    * @param position The position to convert.
    */
  def valueForPosition(position: Double): Double = js.native
  @JSName("watch")
  def watch_font(
    property: font,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelGap(
    property: labelGap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelPosition(
    property: labelPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scaler(
    property: scaler,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tickStroke(
    property: tickStroke,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

