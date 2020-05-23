package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rating_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.Rating.Model = js.native
  @JSName("model")
  var model_Rating_ : typings.ejWebAll.ej.Rating.Model = js.native
  /** To get the current value of rating control.
    * @returns {number}
    */
  def getValue(): Double = js.native
  /** To hide the rating control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** User can refresh the rating control to identify changes.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To reset the rating value.
    * @returns {void}
    */
  def reset(): Unit = js.native
  /** To set the rating value.
    * @param {string|number} Specifies the rating value.
    * @returns {void}
    */
  def setValue(value: String): Unit = js.native
  def setValue(value: Double): Unit = js.native
  /** To show the rating control
    * @returns {void}
    */
  def show(): Unit = js.native
}

