package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Scroller")
@js.native
class Scroller protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ScrollerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ScrollerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ScrollerNs.Model = js.native
  @JSName("model")
  var model_Scroller: ejDotWebDotAllLib.ejNs.ScrollerNs.Model = js.native
  /** User disables the Scroller control at any time.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** User enables the Scroller control at any time.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Returns true if horizontal scrollbar is shown, else return false.
    * @returns {boolean}
    */
  def isHScroll(): scala.Boolean = js.native
  /** Returns true if vertical scrollbar is shown, else return false.
    * @returns {boolean}
    */
  def isVScroll(): scala.Boolean = js.native
  /** User refreshes the Scroller control at any time.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  def scrollX(pixel: java.lang.String, disableAnimation: scala.Boolean, animationSpeed: scala.Double): scala.Unit = js.native
  /** Horizontal scroller moves to given pixel from its origin position. We can also specify the animation speed,in which the scroller has to move while re-positioning it.
    * @param {number|string} Horizontal scroller moves to the specified pixel.
    * @param {boolean} Specifies to enable/disable the animation.
    * @param {number} Specifies the animation speed when scrolling, if animation is enabled.
    * @returns {void}
    */
  def scrollX(pixel: scala.Double, disableAnimation: scala.Boolean, animationSpeed: scala.Double): scala.Unit = js.native
  def scrollY(pixel: java.lang.String, disableAnimation: scala.Boolean, animationSpeed: scala.Double): scala.Unit = js.native
  /** Vertical scroller moves to given pixel from its origin position. We can also specify the animation speed,in which the scroller has to move while re-positioning it.
    * @param {number|string} Vertical scroller moves to the specified pixel.
    * @param {boolean} Specifies to enable/disable the animation.
    * @param {number} Specifies the animation speed when scrolling, if animation is enabled.
    * @returns {void}
    */
  def scrollY(pixel: scala.Double, disableAnimation: scala.Boolean, animationSpeed: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.Scroller")
@js.native
object Scroller extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Scroller = js.native
}

