package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeCollapseEventArgs extends js.Object {
  /** returns the format asynchronous or synchronous
               */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current element of the node clicked
               */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the id of currently clicked node
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** returns the child nodes are loaded or not
               */
  var isChildLoaded: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parent id of currently clicked node
               */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

