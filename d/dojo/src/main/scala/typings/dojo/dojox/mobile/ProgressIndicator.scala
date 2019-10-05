package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.center
import typings.dojo.dojoStrings.colors
import typings.dojo.dojoStrings.interval
import typings.dojo.dojoStrings.removeOnStop
import typings.dojo.dojoStrings.size
import typings.dojo.dojoStrings.startSpinning
import typings.dojo.dojoStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ProgressIndicator.html
  *
  * A progress indication widget.
  * ProgressIndicator is a round spinning graphical representation
  * that indicates the current task is ongoing.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling */ @JSGlobal("dojox.mobile.ProgressIndicator")
@js.native
class ProgressIndicator () extends _WidgetBase {
  /**
    * If true, the indicator is displayed as center aligned.
    *
    */
  var center: Boolean = js.native
  /**
    * An array of indicator colors. 12 colors have to be given.
    * If colors are not specified, CSS styles
    * (mblProg0Color - mblProg11Color) are used.
    *
    */
  var colors: js.Object = js.native
  /**
    * The time interval in milliseconds for updating the spinning
    * indicator.
    *
    */
  var interval: Double = js.native
  /**
    * If true, this widget is removed from the parent node
    * when stop() is called.
    *
    */
  var removeOnStop: Boolean = js.native
  /**
    * The size of the indicator in pixels.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var size: Double = js.native
  /**
    * If true, calls start() to run the indicator at startup.
    *
    */
  var startSpinning: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_ProgressIndicator: String = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    *
    * @param props
    */
  def getInstance(props: js.Any): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  @JSName("get")
  def get_center(property: center): Boolean = js.native
  @JSName("get")
  def get_colors(property: colors): js.Object = js.native
  @JSName("get")
  def get_interval(property: interval): Double = js.native
  @JSName("get")
  def get_removeOnStop(property: removeOnStop): Boolean = js.native
  @JSName("get")
  def get_size(property: size): Double = js.native
  @JSName("get")
  def get_startSpinning(property: startSpinning): Boolean = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    * @param size
    */
  def scale(size: Double): Unit = js.native
  /**
    * Sets an indicator icon image file (typically animated GIF).
    * If null is specified, restores the default spinner.
    *
    * @param file
    */
  def setImage(file: String): Unit = js.native
  @JSName("set")
  def set_center(property: center, value: Boolean): Unit = js.native
  @JSName("set")
  def set_colors(property: colors, value: js.Object): Unit = js.native
  @JSName("set")
  def set_interval(property: interval, value: Double): Unit = js.native
  @JSName("set")
  def set_removeOnStop(property: removeOnStop, value: Boolean): Unit = js.native
  @JSName("set")
  def set_size(property: size, value: Double): Unit = js.native
  @JSName("set")
  def set_startSpinning(property: startSpinning, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  /**
    * Starts the spinning of the ProgressIndicator.
    *
    */
  def start(): Unit = js.native
  /**
    * Stops the spinning of the ProgressIndicator.
    *
    */
  def stop(): Unit = js.native
  @JSName("watch")
  def watch_center(property: center, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_colors(property: colors, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_interval(property: interval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_removeOnStop(property: removeOnStop, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_size(property: size, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startSpinning(property: startSpinning, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

