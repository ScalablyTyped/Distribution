package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadialSlider")
@js.native
class RadialSlider protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RadialSliderNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RadialSliderNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RadialSliderNs.Model = js.native
  @JSName("model")
  var model_RadialSlider: ejDotWebDotAllLib.ejNs.RadialSliderNs.Model = js.native
  /** To hide the radialslider
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** To show the radialslider
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.RadialSlider")
@js.native
object RadialSlider extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.RadialSlider = js.native
}

