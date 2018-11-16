package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the added data, that are given initially
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the newly added elements
               */
  var nodes: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
               */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the target parent element of the added element
               */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

