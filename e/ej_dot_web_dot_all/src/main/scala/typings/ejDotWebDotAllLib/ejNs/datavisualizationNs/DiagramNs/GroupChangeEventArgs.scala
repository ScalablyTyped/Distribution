package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupChangeEventArgs extends js.Object {
  /** parameter returns the cause of group change("group", unGroup")
    */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the object that is added to/removed from a group
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new parent group(if any) of the object
    */
  var newParent: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the old parent group(if any) of the object
    */
  var oldParent: js.UndefOr[js.Any] = js.undefined
}

