package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeSelectEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current element of the node clicked
               */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the current element of the node clicked
               */
  var id: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the id of the parent element of current element of the node clicked
               */
  var parentId: js.UndefOr[js.Any] = js.undefined
  /** returns the current selected nodes index of TreeView
               */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

