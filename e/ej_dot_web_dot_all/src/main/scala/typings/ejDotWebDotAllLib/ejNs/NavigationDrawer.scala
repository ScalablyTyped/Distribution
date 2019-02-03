package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.NavigationDrawer")
@js.native
class NavigationDrawer protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.NavigationDrawerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.NavigationDrawerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.NavigationDrawerNs.Model = js.native
  @JSName("model")
  var model_NavigationDrawer: ejDotWebDotAllLib.ejNs.NavigationDrawerNs.Model = js.native
  /** To close the navigation drawer control
    * @returns {void}
    */
  def close(): scala.Unit = js.native
  /** To load AJAX content into NavigationDrawer container.
    * @returns {void}
    */
  def loadContent(): scala.Unit = js.native
  /** To open the navigation drawer control
    * @returns {void}
    */
  def open(): scala.Unit = js.native
  /** To Toggle the navigation drawer control
    * @returns {void}
    */
  def toggle(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.NavigationDrawer")
@js.native
object NavigationDrawer extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.NavigationDrawer = js.native
}

