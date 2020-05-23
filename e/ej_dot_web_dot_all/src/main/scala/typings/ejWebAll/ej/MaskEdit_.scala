package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskEdit_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.MaskEdit.Model = js.native
  @JSName("model")
  var model_MaskEdit_ : typings.ejWebAll.ej.MaskEdit.Model = js.native
  /** To clear the text in mask edit textbox control.
    * @returns {void}
    */
  def clear(): Unit = js.native
  /** To disable the mask edit textbox control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the mask edit textbox control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To obtained the pure value of the text value, removes all the symbols in mask edit textbox control.
    * @returns {string}
    */
  def get_StrippedValue(): String = js.native
  /** To obtained the textbox value as such that, Just replace all '_' to ' '(space) in mask edit textbox control.
    * @returns {string}
    */
  def get_UnstrippedValue(): String = js.native
}

