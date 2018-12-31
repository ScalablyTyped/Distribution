package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Rotator")
@js.native
class Rotator protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RotatorNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RotatorNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RotatorNs.Model = js.native
  @JSName("model")
  var model_Rotator: ejDotWebDotAllLib.ejNs.RotatorNs.Model = js.native
  /** Disables the Rotator control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enables the Rotator control.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** This method is used to get the current slide index.
    * @returns {number}
    */
  def getIndex(): scala.Double = js.native
  /** This method is used to move a slide to the specified index.
    * @param {number} index of an slide
    * @returns {void}
    */
  def gotoIndex(index: scala.Double): scala.Unit = js.native
  /** This method is used to pause autoplay.
    * @returns {void}
    */
  def pause(): scala.Unit = js.native
  /** This method is used to move slides continuously (or start autoplay) in the specified autoplay direction.
    * @returns {void}
    */
  def play(): scala.Unit = js.native
  /** This method is used to move to the next slide from the current slide. If the current slide is the last slide, then the first slide will be treated as the next slide.
    * @returns {void}
    */
  def slideNext(): scala.Unit = js.native
  /** This method is used to move to the previous slide from the current slide. If the current slide is the first slide, then the last slide will be treated as the previous slide.
    * @returns {void}
    */
  def slidePrevious(): scala.Unit = js.native
  /** This method is used to update/modify the slide content of template rotator by using id based on index value.
    * @param {number} index of an slide
    * @param {string} id of a new updated slide
    * @returns {void}
    */
  def updateTemplateById(index: scala.Double, id: java.lang.String): scala.Unit = js.native
}

@JSGlobal("ej.Rotator")
@js.native
object Rotator extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Rotator = js.native
}

