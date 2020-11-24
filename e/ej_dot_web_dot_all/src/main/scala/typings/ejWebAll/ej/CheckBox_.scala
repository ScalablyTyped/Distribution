package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBox_ extends Widget_ {
  
  var defaults: typings.ejWebAll.ej.CheckBox.Model = js.native
  
  /** Disable the CheckBox to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the CheckBox
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To Check the status of CheckBox
    * @returns {boolean}
    */
  def isChecked(): Boolean = js.native
  
  @JSName("model")
  var model_CheckBox_ : typings.ejWebAll.ej.CheckBox.Model = js.native
}
