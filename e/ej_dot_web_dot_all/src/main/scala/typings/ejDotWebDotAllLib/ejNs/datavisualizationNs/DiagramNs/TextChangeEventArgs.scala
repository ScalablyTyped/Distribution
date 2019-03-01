package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node that contains the text being edited
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the keyCode of the key entered
    */
  var keyCode: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the new text
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TextChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    diagramId: java.lang.String = null,
    element: js.Any = null,
    keyCode: java.lang.String = null,
    value: java.lang.String = null
  ): TextChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextChangeEventArgs]
  }
}

