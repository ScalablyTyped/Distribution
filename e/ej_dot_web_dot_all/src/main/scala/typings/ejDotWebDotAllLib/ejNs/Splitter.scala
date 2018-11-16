package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Splitter")
@js.native
class Splitter protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SplitterNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SplitterNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.SplitterNs.Model = js.native
  @JSName("model")
  var model_Splitter: ejDotWebDotAllLib.ejNs.SplitterNs.Model = js.native
  /** To add a new pane to splitter control.
           * @param {string} content of pane.
           * @param {any} pane properties.
           * @param {number} index of pane.
           * @returns {HTMLElement}
           */
  def addItem(content: java.lang.String, property: js.Any, index: scala.Double): stdLib.HTMLElement = js.native
  /** To collapse the splitter control pane.
           * @param {number} index number of pane.
           * @returns {void}
           */
  def collapse(paneIndex: scala.Double): scala.Unit = js.native
  /** To expand the splitter control pane.
           * @param {number} index number of pane.
           * @returns {void}
           */
  def expand(paneIndex: scala.Double): scala.Unit = js.native
  /** To refresh the splitter control pane resizing.
           * @returns {void}
           */
  def refresh(): scala.Unit = js.native
  /** To remove a specified pane from the splitter control.
           * @param {number} index of pane.
           * @returns {void}
           */
  def removeItem(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.Splitter")
@js.native
object Splitter extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Splitter = js.native
}

