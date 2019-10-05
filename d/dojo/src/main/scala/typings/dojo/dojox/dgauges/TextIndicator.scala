package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojoStrings.align
import typings.dojo.dojoStrings.font
import typings.dojo.dojoStrings.indicator
import typings.dojo.dojoStrings.labelFunc
import typings.dojo.dojoStrings.x
import typings.dojo.dojoStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/TextIndicator.html
  *
  * This type of indicator is used to render text.
  * To render an arbitrary text, set the value property.
  * To render the value of a value indicator or a range indicator, set the indicator property.
  * Setting the indicator property takes precedence on setting the value property.
  * When the indicator property is set, the text is automatically updated on value changes.
  *
  */
@JSGlobal("dojox.dgauges.TextIndicator")
@js.native
class TextIndicator () extends IndicatorBase {
  /**
    * An alignment of a text in regards to the anchor position:
    *
    * "start": A text's baseline starts at the anchor.
    * This is the default value of the align attribute.
    * "middle": A text's baseline is centered on the anchor point.
    * "end": A text's baseline ends at the anchor point.
    *
    */
  var align: String = js.native
  /**
    * The color of the text.
    *
    */
  var color: js.Object = js.native
  /**
    * Font used by this element.
    *
    */
  var font: js.Object = js.native
  /**
    * If this property is set, the value of the indicator is automatically
    * rendered by this text element.
    *
    */
  var indicator: js.Object = js.native
  /**
    * If set, this method allows to format the value of this text indicator.
    * A label function takes the text to render as argument and returns a String.
    *
    */
  var labelFunc: js.Object = js.native
  /**
    * The text anchor x-position. Default is 0.
    *
    */
  var x: Double = js.native
  /**
    * The text anchor y-position. Default is 0.
    *
    */
  var y: Double = js.native
  @JSName("get")
  def get_align(property: align): String = js.native
  @JSName("get")
  def get_color(property: typings.dojo.dojoStrings.color): js.Object = js.native
  @JSName("get")
  def get_font(property: font): js.Object = js.native
  @JSName("get")
  def get_indicator(property: indicator): js.Object = js.native
  @JSName("get")
  def get_labelFunc(property: labelFunc): js.Object = js.native
  @JSName("get")
  def get_x(property: x): Double = js.native
  @JSName("get")
  def get_y(property: y): Double = js.native
  @JSName("set")
  def set_align(property: align, value: String): Unit = js.native
  @JSName("set")
  def set_color(property: typings.dojo.dojoStrings.color, value: js.Object): Unit = js.native
  @JSName("set")
  def set_font(property: font, value: js.Object): Unit = js.native
  @JSName("set")
  def set_indicator(property: indicator, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelFunc(property: labelFunc, value: js.Object): Unit = js.native
  @JSName("set")
  def set_x(property: x, value: Double): Unit = js.native
  @JSName("set")
  def set_y(property: y, value: Double): Unit = js.native
  @JSName("watch")
  def watch_align(property: align, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_color(property: typings.dojo.dojoStrings.color, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_font(property: font, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_indicator(property: indicator, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelFunc(property: labelFunc, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_x(property: x, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_y(property: y, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
}

