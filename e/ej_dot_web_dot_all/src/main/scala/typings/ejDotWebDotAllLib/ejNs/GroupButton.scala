package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.GroupButton")
@js.native
class GroupButton protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.GroupButtonNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.GroupButtonNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.GroupButtonNs.Model = js.native
  @JSName("model")
  var model_GroupButton: ejDotWebDotAllLib.ejNs.GroupButtonNs.Model = js.native
  /** Remove the selection state of the specified the button element from the GroupButton
           * @param {JQuery} Specific button element
           * @returns {void}
           */
  def deselectItem(element: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Disables the GroupButton control
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** Disable the specified button element from the ejGroupButton control.
           * @param {JQuery} Specific button element
           * @returns {void}
           */
  def disableItem(element: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Enables the disabled ejGroupButton control.
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** Enable the specified disabled button element from the ejGroupButton control.
           * @param {JQuery} Specific button element
           * @returns {void}
           */
  def enableItem(element: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Returns the index value for specified button element in the GroupButton control.
           * @param {JQuery} Specific button element
           * @returns {number}
           */
  def getIndex(element: ejDotWebDotAllLib.JQuery): scala.Double = js.native
  /** This method returns the list of active state button elements from the GroupButton control.
           * @returns {any}
           */
  def getSelectedItem(): js.Any = js.native
  /** Hides the GroupButton control
           * @returns {void}
           */
  def hide(): scala.Unit = js.native
  /** Hide the specified button element from the ejGroupButton control.
           * @param {JQuery} Specific button element
           * @returns {void}
           */
  def hideItem(element: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Returns the disabled state of the specified element button element in GroupButton as Boolean.
           * @returns {boolean}
           */
  def isDisabled(): scala.Boolean = js.native
  /** Returns the state of the specified button element as Boolean.
           * @returns {boolean}
           */
  def isSelected(): scala.Boolean = js.native
  /** Public method used to select the specified button element from the ejGroupButton control.
           * @param {JQuery} Specific button element
           * @returns {void}
           */
  def selectItem(element: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Shows the GroupButton control, if its hide.
           * @returns {void}
           */
  def show(): scala.Unit = js.native
  /** Show the specified hidden button element from the ejGroupButton control.
           * @param {JQuery} Specific button element
           * @returns {void}
           */
  def showItem(element: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
}

@JSGlobal("ej.GroupButton")
@js.native
object GroupButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.GroupButton = js.native
}

