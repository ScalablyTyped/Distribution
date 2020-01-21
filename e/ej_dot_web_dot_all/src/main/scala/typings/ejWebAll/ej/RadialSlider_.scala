package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadialSlider")
@js.native
class RadialSlider_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.RadialSlider.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.RadialSlider.Model) = this()
  var defaults: typings.ejWebAll.ej.RadialSlider.Model = js.native
  @JSName("model")
  var model_RadialSlider_ : typings.ejWebAll.ej.RadialSlider.Model = js.native
  /** To hide the radialslider
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To show the radialslider
    * @returns {void}
    */
  def show(): Unit = js.native
}

