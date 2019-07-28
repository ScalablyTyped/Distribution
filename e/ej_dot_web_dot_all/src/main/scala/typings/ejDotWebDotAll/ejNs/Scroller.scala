package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Scroller")
@js.native
class Scroller protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.ScrollerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.ScrollerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.ScrollerNs.Model = js.native
  @JSName("model")
  var model_Scroller: typings.ejDotWebDotAll.ejNs.ScrollerNs.Model = js.native
  /** User disables the Scroller control at any time.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** User enables the Scroller control at any time.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns true if horizontal scrollbar is shown, else return false.
    * @returns {boolean}
    */
  def isHScroll(): Boolean = js.native
  /** Returns true if vertical scrollbar is shown, else return false.
    * @returns {boolean}
    */
  def isVScroll(): Boolean = js.native
  /** User refreshes the Scroller control at any time.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  def scrollX(pixel: String, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
  /** Horizontal scroller moves to given pixel from its origin position. We can also specify the animation speed,in which the scroller has to move while re-positioning it.
    * @param {number|string} Horizontal scroller moves to the specified pixel.
    * @param {boolean} Specifies to enable/disable the animation.
    * @param {number} Specifies the animation speed when scrolling, if animation is enabled.
    * @returns {void}
    */
  def scrollX(pixel: Double, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
  def scrollY(pixel: String, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
  /** Vertical scroller moves to given pixel from its origin position. We can also specify the animation speed,in which the scroller has to move while re-positioning it.
    * @param {number|string} Vertical scroller moves to the specified pixel.
    * @param {boolean} Specifies to enable/disable the animation.
    * @param {number} Specifies the animation speed when scrolling, if animation is enabled.
    * @returns {void}
    */
  def scrollY(pixel: Double, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
}

/* static members */
@JSGlobal("ej.Scroller")
@js.native
object Scroller extends js.Object {
  var Locale: js.Any = js.native
  var fn: Scroller = js.native
}

