package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeCutEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the event object
               */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the key pressed key code value
               */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the given parent node details
               */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the cut node
               */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

