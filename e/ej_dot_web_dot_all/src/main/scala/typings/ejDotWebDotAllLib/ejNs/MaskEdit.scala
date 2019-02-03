package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.MaskEdit")
@js.native
class MaskEdit protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.MaskEditNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.MaskEditNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.MaskEditNs.Model = js.native
  @JSName("model")
  var model_MaskEdit: ejDotWebDotAllLib.ejNs.MaskEditNs.Model = js.native
  /** To clear the text in mask edit textbox control.
    * @returns {void}
    */
  def clear(): scala.Unit = js.native
  /** To disable the mask edit textbox control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** To enable the mask edit textbox control.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** To obtained the pure value of the text value, removes all the symbols in mask edit textbox control.
    * @returns {string}
    */
  def get_StrippedValue(): java.lang.String = js.native
  /** To obtained the textbox value as such that, Just replace all '_' to ' '(space) in mask edit textbox control.
    * @returns {string}
    */
  def get_UnstrippedValue(): java.lang.String = js.native
}

/* static members */
@JSGlobal("ej.MaskEdit")
@js.native
object MaskEdit extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.MaskEdit = js.native
}

