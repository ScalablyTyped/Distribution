package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.NavigationDrawer")
@js.native
class NavigationDrawer protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.NavigationDrawerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.NavigationDrawerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.NavigationDrawerNs.Model = js.native
  @JSName("model")
  var model_NavigationDrawer: typings.ejDotWebDotAll.ejNs.NavigationDrawerNs.Model = js.native
  /** To close the navigation drawer control
    * @returns {void}
    */
  def close(): Unit = js.native
  /** To load AJAX content into NavigationDrawer container.
    * @returns {void}
    */
  def loadContent(): Unit = js.native
  /** To open the navigation drawer control
    * @returns {void}
    */
  def open(): Unit = js.native
  /** To Toggle the navigation drawer control
    * @returns {void}
    */
  def toggle(): Unit = js.native
}

/* static members */
@JSGlobal("ej.NavigationDrawer")
@js.native
object NavigationDrawer extends js.Object {
  var Locale: js.Any = js.native
  var fn: NavigationDrawer = js.native
}

