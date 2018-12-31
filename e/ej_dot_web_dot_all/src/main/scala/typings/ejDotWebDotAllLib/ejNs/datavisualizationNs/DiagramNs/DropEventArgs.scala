package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the drop event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns node or connector that is being dropped
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the enum which defines the type of the source
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the object from where the element is dragged
    */
  var source: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object over which the object will be dropped
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

