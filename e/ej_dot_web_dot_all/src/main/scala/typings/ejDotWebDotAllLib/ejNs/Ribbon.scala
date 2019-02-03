package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Ribbon")
@js.native
class Ribbon protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RibbonNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RibbonNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RibbonNs.Model = js.native
  @JSName("model")
  var model_Ribbon: ejDotWebDotAllLib.ejNs.RibbonNs.Model = js.native
  /** Add new option to Backstage page.
    * @param {any} select the object to add the backstage item
    * @param {number} index to the backstage item this is optional.
    * @returns {void}
    */
  def addBackStageItem(item: js.Any): scala.Unit = js.native
  def addBackStageItem(item: js.Any, index: scala.Double): scala.Unit = js.native
  /** Adds contextual tab or contextual tab set dynamically in the ribbon control with contextual tabs object and index position. When index is null, ribbon contextual tab or contextual
    * tab set is added at the last index.
    * @param {any} contextual tab or contextual tab set object.
    * @param {number} index of the contextual tab or contextual tab set, this is optional.
    * @returns {void}
    */
  def addContextualTabs(contextualTabSet: js.Any): scala.Unit = js.native
  def addContextualTabs(contextualTabSet: js.Any, index: scala.Double): scala.Unit = js.native
  /** Adds tab dynamically in the ribbon control with given name, tab group array and index position. When index is null, ribbon tab is added at the last index.
    * @param {string} ribbon tab display text.
    * @param {any[]} groups to be displayed in ribbon tab .
    * @param {number} index of the ribbon tab,this is optional.
    * @returns {void}
    */
  def addTab(tabText: java.lang.String, ribbonGroups: js.Array[_]): scala.Unit = js.native
  def addTab(tabText: java.lang.String, ribbonGroups: js.Array[_], index: scala.Double): scala.Unit = js.native
  /** Adds tab group dynamically in the ribbon control with given tab index, tab group object and group index position. When group index is null, ribbon group is added at the last index.
    * @param {number} ribbon tab index.
    * @param {any} group to be displayed in ribbon tab .
    * @param {number} index of the ribbon group,this is optional.
    * @returns {void}
    */
  def addTabGroup(tabIndex: scala.Double, tabGroup: js.Any): scala.Unit = js.native
  def addTabGroup(tabIndex: scala.Double, tabGroup: js.Any, groupIndex: scala.Double): scala.Unit = js.native
  /** Adds group content dynamically in the ribbon control with given tab index, group index, content, content index and sub group index position. When content index is null, content is
    * added at the last index.
    * @param {number} ribbon tab index.
    * @param {number} ribbon group index.
    * @param {any} content to be displayed in the ribbon group.
    * @param {number} ribbon content index. This is optional. If the value is not given, then by default contentIndex will be considered as 0.
    * @param {number} sub group index in the ribbon group. This is optional. If the value is not given, then by default contentIndex will be considered as 0.
    * @returns {void}
    */
  def addTabGroupContent(tabIndex: scala.Double, groupIndex: scala.Double, content: js.Any): scala.Unit = js.native
  def addTabGroupContent(tabIndex: scala.Double, groupIndex: scala.Double, content: js.Any, contentIndex: scala.Double): scala.Unit = js.native
  def addTabGroupContent(
    tabIndex: scala.Double,
    groupIndex: scala.Double,
    content: js.Any,
    contentIndex: scala.Double,
    subGroupIndex: scala.Double
  ): scala.Unit = js.native
  /** Collapses the ribbon tab content.
    * @returns {void}
    */
  def collapse(): scala.Unit = js.native
  /** Expands the ribbon tab content.
    * @returns {void}
    */
  def expand(): scala.Unit = js.native
  /** Gets text of the given index tab in the ribbon control.
    * @param {number} index of the tab item.
    * @returns {string}
    */
  def getTabText(index: scala.Double): java.lang.String = js.native
  /** Hides the ribbon backstage page.
    * @returns {void}
    */
  def hideBackstage(): scala.Unit = js.native
  /** Hides the given text tab in the ribbon control.
    * @param {string} text of the tab item.
    * @returns {void}
    */
  def hideTab(text: java.lang.String): scala.Unit = js.native
  /** Checks whether the given text tab in the ribbon control is enabled or not.
    * @param {string} text of the tab item.
    * @returns {boolean}
    */
  def isEnable(text: java.lang.String): scala.Boolean = js.native
  /** Checks whether the given text tab in the ribbon control is visible or not.
    * @param {string} text of the tab item.
    * @returns {boolean}
    */
  def isVisible(text: java.lang.String): scala.Boolean = js.native
  /** Remove option from Backstage.
    * @param {number} index to the backstage item
    * @returns {void}
    */
  def removeBackStageItem(index: scala.Double): scala.Unit = js.native
  /** Removes the given index tab item from the ribbon control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def removeTab(index: scala.Double): scala.Unit = js.native
  /** To customize whole content from Tab Group.
    * @param {number} ribbon tab index.
    * @param {string} ribbon group text.
    * @param {number} ribbon content index. This is optional. If the value is not given, all content groups will be removed.
    * @param {number} sub group index in the ribbon group. This is optional. If the value is not given, all content groups will be removed.
    * @returns {void}
    */
  def removeTabGroupContent(tabIndex: scala.Double, groupText: java.lang.String): scala.Unit = js.native
  def removeTabGroupContent(tabIndex: scala.Double, groupText: java.lang.String, contentIndex: scala.Double): scala.Unit = js.native
  def removeTabGroupContent(
    tabIndex: scala.Double,
    groupText: java.lang.String,
    contentIndex: scala.Double,
    subGroupIndex: scala.Double
  ): scala.Unit = js.native
  /** Sets new text to the given text tab in the ribbon control.
    * @param {string} current text of the tab item.
    * @param {string} new text of the tab item.
    * @returns {void}
    */
  def setTabText(tabText: java.lang.String, newText: java.lang.String): scala.Unit = js.native
  /** Displays the ribbon backstage page.
    * @returns {void}
    */
  def showBackstage(): scala.Unit = js.native
  /** Displays the given text tab in the ribbon control.
    * @param {string} text of the tab item.
    * @returns {void}
    */
  def showTab(text: java.lang.String): scala.Unit = js.native
  /** Update option in existing Backstage.
    * @param {number} index to the backstage item
    * @param {any} select the object to add the backstage item
    * @returns {void}
    */
  def updateBackStageItem(index: scala.Double): scala.Unit = js.native
  def updateBackStageItem(index: scala.Double, item: js.Any): scala.Unit = js.native
  /** To customize Group alone in the inside content.
    * @param {number} ribbon tab index.
    * @param {string} group id to be displayed in ribbon tab .
    * @param {any} contentGroup is used in the object
    * @returns {void}
    */
  def updateGroup(tabIndex: scala.Double, groupId: java.lang.String): scala.Unit = js.native
  def updateGroup(tabIndex: scala.Double, groupId: java.lang.String, contentGroup: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.Ribbon")
@js.native
object Ribbon extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Ribbon = js.native
}

