package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuClickEventArgs extends js.Object {
  /** parameter defines whether to execute the click event or not
    */
  var canExecute: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the element of the object that was clicked
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the model of the diagram
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the id of the selected context menu item
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the parent id of the selected context menu item
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the parent text of the selected context menu item
    */
  var parentText: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the object that is selected
    */
  var selectedItem: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object that was clicked
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the text of the selected context menu item
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

