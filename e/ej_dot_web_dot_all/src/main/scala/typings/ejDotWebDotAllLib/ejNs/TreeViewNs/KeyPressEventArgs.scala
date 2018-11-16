package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyPressEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current element of the node clicked
               */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
               */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of current TreeView node
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** it returns when the current node is in expanded state; otherwise, false.
               */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the key pressed key code value
               */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parentId of current TreeView node
               */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns node path from root element
               */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

