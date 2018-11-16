package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DoubleClickEventArgs extends js.Object {
  /** parameter returns the object that is actually clicked
               */
  var actualObject: js.UndefOr[js.Any] = js.undefined
  /** parameter to specify whether or not to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the selected object
               */
  var element: js.UndefOr[js.Any] = js.undefined
}

