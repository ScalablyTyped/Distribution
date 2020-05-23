package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitingPopup_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.WaitingPopup.Model = js.native
  @JSName("model")
  var model_WaitingPopup_ : typings.ejWebAll.ej.WaitingPopup.Model = js.native
  /** To hide the waiting popup
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Refreshes the WaitingPopup control by resetting the pop-up panel position and content position
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To show the waiting popup
    * @returns {void}
    */
  def show(): Unit = js.native
}

