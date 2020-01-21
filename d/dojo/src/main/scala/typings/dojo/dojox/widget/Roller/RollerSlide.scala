package typings.dojo.dojox.widget.Roller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Roller.RollerSlide.html
  *
  * An add-on to the Roller to modify animations. This produces
  * a slide-from-bottom like effect. See dojox.widget.Roller for
  * full API information.
  *
  */
@JSGlobal("dojox.widget.Roller.RollerSlide")
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

