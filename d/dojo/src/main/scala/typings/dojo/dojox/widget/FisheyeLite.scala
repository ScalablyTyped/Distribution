package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.Fn_Void
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.durationIn
import typings.dojo.dojoStrings.durationOut
import typings.dojo.dojoStrings.properties
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.units
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/FisheyeLite.html
  *
  * A Light-weight Fisheye Component, or an exhanced version
  * of dojo/fx/Toggler ...
  * A Simple FisheyeList-like widget which (in the interest of
  * performance) relies on well-styled content for positioning,
  * and natural page layout for rendering.
  *
  * use position:absolute/relative nodes to prevent layout
  * changes, and use caution when seleting properties to
  * scale. Negative scaling works, but some properties
  * react poorly to being set to negative values, IE being
  * particularly annoying in that regard.
  *
  * quirk: uses the domNode as the target of the animation
  * unless it finds a node class="fisheyeTarget" in the container
  * being turned into a FisheyeLite instance
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.widget.FisheyeLite")
@js.native
class FisheyeLite protected () extends _WidgetBase {
  def this(props: js.Any, node: js.Any) = this()
  /**
    * The time (in ms) the run the show animation
    *
    */
  var durationIn: Double = js.native
  /**
    * The Time (in ms) to run the hide animation
    *
    */
  var durationOut: Double = js.native
  /**
    *
    */
  @JSName("isValid")
  var isValid_Original: Fn_Void = js.native
  /**
    * An object of "property":scale pairs, or "property":{} pairs.
    * defaults to font-size with a scale of 2.75
    * If a named property is an integer or float, the "scale multiplier"
    * is used. If the named property is an object, that object is mixed
    * into the animation directly. eg: height:{ end:20, units:"em" }
    *
    */
  var properties: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_FisheyeLite: String = js.native
  /**
    * Sometimes, you need to specify a unit. Should be part of
    * properties attrib, but was trying to shorthand the logic there
    *
    */
  var units: String = js.native
  /**
    * An easing function to use for the show animation
    *
    * @param n               Optional
    */
  def easeIn(n: Double): Double = js.native
  /**
    * An easing function to use for the hide animation
    *
    * @param n               Optional
    */
  def easeOut(n: Double): js.Any = js.native
  @JSName("get")
  def get_durationIn(property: durationIn): Double = js.native
  @JSName("get")
  def get_durationOut(property: durationOut): Double = js.native
  @JSName("get")
  def get_properties(property: properties): js.Object = js.native
  @JSName("get")
  def get_units(property: units): String = js.native
  /**
    * Hide this fisheye item on mouse leave
    *
    */
  def hide(): Unit = js.native
  /**
    *
    */
  @JSName("isValid")
  def isValid_MFisheyeLite(): Unit = js.native
  /**
    * stub function fired when target is clicked
    * connect or override to use.
    *
    * @param e
    */
  def onClick(e: Event): Unit = js.native
  /**
    * stub function fired when Fisheye Item is fully visible and
    * hovered. connect or override use.
    *
    * @param e
    */
  def onSelected(e: js.Object): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_durationIn(property: durationIn, value: Double): Unit = js.native
  @JSName("set")
  def set_durationOut(property: durationOut, value: Double): Unit = js.native
  @JSName("set")
  def set_properties(property: properties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_units(property: units, value: String): Unit = js.native
  /**
    * Show this Fisheye item.
    *
    */
  def show(): Unit = js.native
  @JSName("watch")
  def watch_durationIn(property: durationIn, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_durationOut(property: durationOut, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_properties(property: properties, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_units(property: units, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

