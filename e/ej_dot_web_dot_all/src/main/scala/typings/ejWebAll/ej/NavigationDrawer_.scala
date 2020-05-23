package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDrawer_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.NavigationDrawer.Model = js.native
  @JSName("model")
  var model_NavigationDrawer_ : typings.ejWebAll.ej.NavigationDrawer.Model = js.native
  /** To close the navigation drawer control
    * @returns {void}
    */
  def close(): Unit = js.native
  /** To load AJAX content into NavigationDrawer container.
    * @returns {void}
    */
  def loadContent(): Unit = js.native
  /** To open the navigation drawer control
    * @returns {void}
    */
  def open(): Unit = js.native
  /** To Toggle the navigation drawer control
    * @returns {void}
    */
  def toggle(): Unit = js.native
}

