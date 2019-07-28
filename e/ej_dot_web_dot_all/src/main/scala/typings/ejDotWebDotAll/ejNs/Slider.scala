package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Slider")
@js.native
class Slider protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.SliderNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.SliderNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.SliderNs.Model = js.native
  @JSName("model")
  var model_Slider: typings.ejDotWebDotAll.ejNs.SliderNs.Model = js.native
  /** To disable the slider
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the slider
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To get value from slider handle
    * @returns {number}
    */
  def getValue(): Double = js.native
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
    * @returns {void}
    */
  def setValue(): Unit = js.native
}

/* static members */
@JSGlobal("ej.Slider")
@js.native
object Slider extends js.Object {
  var Locale: js.Any = js.native
  var fn: Slider = js.native
}

