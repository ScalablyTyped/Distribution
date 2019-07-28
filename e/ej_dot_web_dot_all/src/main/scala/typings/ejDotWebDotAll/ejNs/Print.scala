package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Print")
@js.native
class Print protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.PrintNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.PrintNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.PrintNs.Model = js.native
  @JSName("model")
  var model_Print: typings.ejDotWebDotAll.ejNs.PrintNs.Model = js.native
  /** Print the specific page or an element.
    * @returns {void}
    */
  def print(): Unit = js.native
}

/* static members */
@JSGlobal("ej.Print")
@js.native
object Print extends js.Object {
  var Locale: js.Any = js.native
  var fn: Print = js.native
}

