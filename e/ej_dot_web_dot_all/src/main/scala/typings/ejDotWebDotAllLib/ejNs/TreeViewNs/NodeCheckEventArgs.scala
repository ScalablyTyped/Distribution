package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeCheckEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** it returns the currently checked and its child node details
               */
  var currentCheckedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the current element of the node clicked
               */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** it returns the currently checked node name
               */
  var currentNode: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the event object
               */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the current element of the node clicked
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** it returns true when the node checkbox is checked; otherwise, false.
               */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the id of the parent element of current element of the node clicked
               */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

