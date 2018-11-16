package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Slider")
@js.native
class Slider protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SliderNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SliderNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SliderNs.Model = js.native
  @JSName("model")
  var model_Slider: ejDotWebDotAllLib.ejNs.SliderNs.Model = js.native
  /** To disable the slider
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** To enable the slider
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** To get value from slider handle
           * @returns {number}
           */
  def getValue(): scala.Double = js.native
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
           * @returns {void}
           */
  def setValue(): scala.Unit = js.native
}

@JSGlobal("ej.Slider")
@js.native
object Slider extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Slider = js.native
}

