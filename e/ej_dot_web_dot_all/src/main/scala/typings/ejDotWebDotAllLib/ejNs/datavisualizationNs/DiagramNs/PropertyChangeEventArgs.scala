package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PropertyChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the property change or not
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the action is nudge or not
               */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the selected element
               */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new value of the node property that is being changed
               */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the old value of the property that is being changed
               */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the name of the property that is changed
               */
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
}

