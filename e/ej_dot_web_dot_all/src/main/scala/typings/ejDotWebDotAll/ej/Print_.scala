package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Print")
@js.native
class Print_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Print.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Print.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.Print.Model = js.native
  @JSName("model")
  var model_Print_ : typings.ejDotWebDotAll.ej.Print.Model = js.native
  /** Print the specific page or an element.
    * @returns {void}
    */
  def print(): Unit = js.native
}

