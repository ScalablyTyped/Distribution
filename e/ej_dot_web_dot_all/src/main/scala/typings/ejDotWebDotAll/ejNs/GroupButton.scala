package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.GroupButton")
@js.native
class GroupButton protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.GroupButtonNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.GroupButtonNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.GroupButtonNs.Model = js.native
  @JSName("model")
  var model_GroupButton: typings.ejDotWebDotAll.ejNs.GroupButtonNs.Model = js.native
  /** Remove the selection state of the specified the button element from the GroupButton
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def deselectItem(element: JQuery): Unit = js.native
  /** Disables the GroupButton control
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Disable the specified button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def disableItem(element: JQuery): Unit = js.native
  /** Enables the disabled ejGroupButton control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Enable the specified disabled button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def enableItem(element: JQuery): Unit = js.native
  /** Returns the index value for specified button element in the GroupButton control.
    * @param {JQuery} Specific button element
    * @returns {number}
    */
  def getIndex(element: JQuery): Double = js.native
  /** This method returns the list of active state button elements from the GroupButton control.
    * @returns {any}
    */
  def getSelectedItem(): js.Any = js.native
  /** Hides the GroupButton control
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Hide the specified button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def hideItem(element: JQuery): Unit = js.native
  /** Returns the disabled state of the specified element button element in GroupButton as Boolean.
    * @returns {boolean}
    */
  def isDisabled(): Boolean = js.native
  /** Returns the state of the specified button element as Boolean.
    * @returns {boolean}
    */
  def isSelected(): Boolean = js.native
  /** Public method used to select the specified button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def selectItem(element: JQuery): Unit = js.native
  /** Shows the GroupButton control, if its hide.
    * @returns {void}
    */
  def show(): Unit = js.native
  /** Show the specified hidden button element from the ejGroupButton control.
    * @param {JQuery} Specific button element
    * @returns {void}
    */
  def showItem(element: JQuery): Unit = js.native
}

/* static members */
@JSGlobal("ej.GroupButton")
@js.native
object GroupButton extends js.Object {
  var Locale: js.Any = js.native
  var fn: GroupButton = js.native
}

