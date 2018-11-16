package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Print")
@js.native
class Print protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PrintNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PrintNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PrintNs.Model = js.native
  @JSName("model")
  var model_Print: ejDotWebDotAllLib.ejNs.PrintNs.Model = js.native
  /** Print the specific page or an element.
           * @returns {void}
           */
  def print(): scala.Unit = js.native
}

@JSGlobal("ej.Print")
@js.native
object Print extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Print = js.native
}

