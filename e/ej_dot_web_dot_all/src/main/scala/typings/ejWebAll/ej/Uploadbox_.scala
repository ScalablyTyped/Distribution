package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uploadbox_ extends Widget_ {
  
  var defaults: typings.ejWebAll.ej.Uploadbox.Model = js.native
  
  /** Disables the Uploadbox control
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the Uploadbox control
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  @JSName("model")
  var model_Uploadbox_ : typings.ejWebAll.ej.Uploadbox.Model = js.native
  
  /** Refresh the Uploadbox control
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Upload the selected files.
    * @returns {void}
    */
  def upload(): Unit = js.native
}
