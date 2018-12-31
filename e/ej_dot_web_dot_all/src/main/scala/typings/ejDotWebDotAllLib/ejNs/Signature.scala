package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Signature")
@js.native
class Signature protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SignatureNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SignatureNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SignatureNs.Model = js.native
  @JSName("model")
  var model_Signature: ejDotWebDotAllLib.ejNs.SignatureNs.Model = js.native
  /** Clears the strokes in the signature.
    * @returns {void}
    */
  def clear(): scala.Unit = js.native
  /** Disables the signature widget.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enables the signature widget.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Hides the signature widget.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** redo the last drawn stroke of the signature
    * @returns {void}
    */
  def redo(): scala.Unit = js.native
  /** Refreshes the Signature widget
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** used to save the drawn image.
    * @param {string} The file name of the signature to be downloaded.
    * @returns {void}
    */
  def save(Filename: java.lang.String): scala.Unit = js.native
  /** Used to Show the signature widget, if it is already hided.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
  /** undo the last drawn stroke of the signature.
    * @returns {void}
    */
  def undo(): scala.Unit = js.native
}

@JSGlobal("ej.Signature")
@js.native
object Signature extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Signature = js.native
}

