package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.MaskEdit")
@js.native
class MaskEdit protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.MaskEditNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.MaskEditNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.MaskEditNs.Model = js.native
  @JSName("model")
  var model_MaskEdit: typings.ejDotWebDotAll.ejNs.MaskEditNs.Model = js.native
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

/* static members */
@JSGlobal("ej.MaskEdit")
@js.native
object MaskEdit extends js.Object {
  var Locale: js.Any = js.native
  var fn: MaskEdit = js.native
}

