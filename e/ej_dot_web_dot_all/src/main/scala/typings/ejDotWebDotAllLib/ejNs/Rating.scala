package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Rating")
@js.native
class Rating protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RatingNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RatingNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RatingNs.Model = js.native
  @JSName("model")
  var model_Rating: ejDotWebDotAllLib.ejNs.RatingNs.Model = js.native
  /** To get the current value of rating control.
    * @returns {number}
    */
  def getValue(): scala.Double = js.native
  /** To hide the rating control.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** User can refresh the rating control to identify changes.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** To reset the rating value.
    * @returns {void}
    */
  def reset(): scala.Unit = js.native
  /** To set the rating value.
    * @param {string|number} Specifies the rating value.
    * @returns {void}
    */
  def setValue(value: java.lang.String): scala.Unit = js.native
  def setValue(value: scala.Double): scala.Unit = js.native
  /** To show the rating control
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.Rating")
@js.native
object Rating extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Rating = js.native
}

