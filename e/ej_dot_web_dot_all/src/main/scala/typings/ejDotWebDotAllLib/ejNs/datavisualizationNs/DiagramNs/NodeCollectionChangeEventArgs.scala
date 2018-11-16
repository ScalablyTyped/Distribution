package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeCollectionChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the collection change or not
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns whether the node is to be added or removed
               */
  var changeType: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node which needs to be added or deleted
               */
  var element: js.UndefOr[js.Any] = js.undefined
  /** triggers before and after adding the node in the diagram which can be differentiated through `state` argument. We can cancel the event only before adding the node
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

