package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tab")
@js.native
class Tab protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.TabNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.TabNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.TabNs.Model = js.native
  @JSName("model")
  var model_Tab: ejDotWebDotAllLib.ejNs.TabNs.Model = js.native
  /** Add new tab items with given name, URL and given index position, if index null itâ€™s add last item.
           * @param {string} URL name / tab id.
           * @param {string} Tab Display name.
           * @param {number} Index position to placed , this is optional.
           * @param {string} specifies cssClass, this is optional.
           * @param {string} specifies id of tab, this is optional.
           * @returns {void}
           */
  def addItem(
    URL: java.lang.String,
    displayLabel: java.lang.String,
    index: scala.Double,
    cssClass: java.lang.String,
    id: java.lang.String
  ): scala.Unit = js.native
  /** To disable the tab control.
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** To enable the tab control.
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** This function get the number of tab rendered
           * @returns {number}
           */
  def getItemsCount(): scala.Double = js.native
  /** This function hides the tab control.
           * @returns {void}
           */
  def hide(): scala.Unit = js.native
  /** This function hides the specified item tab in tab control.
           * @param {number} index of tab item.
           * @returns {void}
           */
  def hideItem(index: scala.Double): scala.Unit = js.native
  /** Remove the given index tab item.
           * @param {number} index of tab item.
           * @returns {void}
           */
  def removeItem(index: scala.Double): scala.Unit = js.native
  /** This function is to show the tab control.
           * @returns {void}
           */
  def show(): scala.Unit = js.native
  /** This function helps to show the specified hidden tab item in tab control.
           * @param {number} index of tab item.
           * @returns {void}
           */
  def showItem(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.Tab")
@js.native
object Tab extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Tab = js.native
}

