package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextMenuBeforeOpenEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the actual arguments from context menu
               */
  var contextmenu: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the diagram object
               */
  var diagram: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the actual click event arguments that explains which button is clicked
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object that was clicked
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the type of the event triggered
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

