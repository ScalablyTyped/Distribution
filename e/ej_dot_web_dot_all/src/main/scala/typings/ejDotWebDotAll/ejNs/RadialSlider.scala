package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadialSlider")
@js.native
class RadialSlider protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.RadialSliderNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.RadialSliderNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.RadialSliderNs.Model = js.native
  @JSName("model")
  var model_RadialSlider: typings.ejDotWebDotAll.ejNs.RadialSliderNs.Model = js.native
  /** To hide the radialslider
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To show the radialslider
    * @returns {void}
    */
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("ej.RadialSlider")
@js.native
object RadialSlider extends js.Object {
  var Locale: js.Any = js.native
  var fn: RadialSlider = js.native
}

