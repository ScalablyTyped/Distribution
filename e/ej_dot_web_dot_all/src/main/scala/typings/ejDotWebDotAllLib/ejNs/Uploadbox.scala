package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Uploadbox")
@js.native
class Uploadbox protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.UploadboxNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.UploadboxNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.UploadboxNs.Model = js.native
  @JSName("model")
  var model_Uploadbox: ejDotWebDotAllLib.ejNs.UploadboxNs.Model = js.native
  /** Disables the Uploadbox control
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** Enables the Uploadbox control
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** Refresh the Uploadbox control
           * @returns {void}
           */
  def refresh(): scala.Unit = js.native
  /** Upload the selected files.
           * @returns {void}
           */
  def upload(): scala.Unit = js.native
}

@JSGlobal("ej.Uploadbox")
@js.native
object Uploadbox extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Uploadbox = js.native
}

