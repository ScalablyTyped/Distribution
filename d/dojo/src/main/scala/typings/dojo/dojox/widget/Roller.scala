package typings.dojo.dojox.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Roller.html
  *
  * A simple widget to take an unordered-list of Text and roll through them
  * The Roller widget takes an unordered-list of items, and converts
  * them to a single-area (the size of one list-item, however you so choose
  * to style it) and loops continually, fading between items.
  *
  * In it's current state, it requires it be created from an unordered (or ordered)
  * list, though can contain complex markup.
  *
  * You can manipulate the items array at any point during the cycle with
  * standard array manipulation techniques.
  *
  * The class "dojoxRoller" is added to the UL element for styling purposes.
  *
  */
@JSGlobal("dojox.widget.Roller")
@js.native
class Roller () extends js.Object {
  /**
    * Toggle to control starup behavior. Call .start() manually
    * if set to false
    *
    */
  var autoStart: Boolean = js.native
  /**
    * Interval between rolls
    *
    */
  var delay: Double = js.native
  /**
    * Speed (in ms) to apply to the "in" animation (show the node)
    *
    */
  var durationIn: Double = js.native
  /**
    * Speed (in ms) to apply to the "out" animation (hide the showing node)
    *
    */
  var durationOut: Double = js.native
  /**
    * A CSS selector to be used by dojo.query to find the children
    * items in this widget. Defaults to "> li", finding only first-children
    * list-items in the list, allowing for embedded lists to occur.
    *
    */
  var itemSelector: String = js.native
  /**
    * If populated prior to instantiation, is used as the Items over the children
    *
    */
  var items: js.Array[_] = js.native
  /**
    *
    */
  def RollerSlide(): Unit = js.native
  /**
    * Animation creator function. Need to create an 'in' and 'out'
    * Animation stored in _anim Object, which the rest of the widget
    * will reuse.
    *
    */
  def makeAnims(): Unit = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
  /**
    * Starts to Roller looping
    *
    */
  def start(): Unit = js.native
  /**
    * Stops the Roller from looping anymore.
    *
    */
  def stop(): Unit = js.native
}

@JSGlobal("dojox.widget.Roller")
@js.native
object Roller extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Roller.RollerSlide.html
    *
    * An add-on to the Roller to modify animations. This produces
    * a slide-from-bottom like effect. See dojox.widget.Roller for
    * full API information.
    *
    */
  @js.native
  class RollerSlide () extends js.Object {
    /**
      * Toggle to control starup behavior. Call .start() manually
      * if set to false
      *
      */
    var autoStart: Boolean = js.native
    /**
      * Interval between rolls
      *
      */
    var delay: Double = js.native
    /**
      * Speed (in ms) to apply to the "in" animation (show the node)
      *
      */
    var durationIn: Double = js.native
    /**
      *
      */
    var durationOut: Double = js.native
    /**
      * A CSS selector to be used by dojo.query to find the children
      * items in this widget. Defaults to "> li", finding only first-children
      * list-items in the list, allowing for embedded lists to occur.
      *
      */
    var itemSelector: String = js.native
    /**
      * If populated prior to instantiation, is used as the Items over the children
      *
      */
    var items: js.Array[_] = js.native
    /**
      * Animation creator function. Need to create an 'in' and 'out'
      * Animation stored in _anim Object, which the rest of the widget
      * will reuse.
      *
      */
    def makeAnims(): Unit = js.native
    /**
      *
      */
    def postCreate(): Unit = js.native
    /**
      * Starts to Roller looping
      *
      */
    def start(): Unit = js.native
    /**
      * Stops the Roller from looping anymore.
      *
      */
    def stop(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Roller._Hover.html
    *
    * A mixin class to provide a way to automate the "stop on hover" functionality.
    * A mixin class used to provide a way to automate a "stop on hover" behavior,
    * while still allowing for ambiguous subclassing for custom animations.
    * Simply mix this class into a dojox.widget.Roller variant, and instantiate
    * as you would. The hover connection is done automatically.
    *
    * The "hover" functionality is as such: Stop rotation while the mouse is over the
    * instance, and resume again once leaving. Even if autoStart is disabled, the widget
    * will start if a mouse enters and leaves the node in this case.
    *
    */
  @js.native
  class _Hover () extends js.Object {
    /**
      *
      */
    def postCreate(): Unit = js.native
  }
  
}

