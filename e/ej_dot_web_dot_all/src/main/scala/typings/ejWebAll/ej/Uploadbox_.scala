package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Uploadbox")
@js.native
class Uploadbox_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Uploadbox.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Uploadbox.Model) = this()
  var defaults: typings.ejWebAll.ej.Uploadbox.Model = js.native
  @JSName("model")
  var model_Uploadbox_ : typings.ejWebAll.ej.Uploadbox.Model = js.native
  /** Disables the Uploadbox control
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the Uploadbox control
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Refresh the Uploadbox control
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Upload the selected files.
    * @returns {void}
    */
  def upload(): Unit = js.native
}

