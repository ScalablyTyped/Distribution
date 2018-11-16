package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the given new node data
               */
  var data: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the given parent node details
               */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the parent element, the given new nodes to be appended to the given parent element
               */
  var targetParent: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

