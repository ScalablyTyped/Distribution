package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Print")
@js.native
class Print__ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Print_.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Print_.Model) = this()
  var defaults: typings.ejWebAll.ej.Print_.Model = js.native
  @JSName("model")
  var model_Print__ : typings.ejWebAll.ej.Print_.Model = js.native
  /** Print the specific page or an element.
    * @returns {void}
    */
  def print(): Unit = js.native
}

