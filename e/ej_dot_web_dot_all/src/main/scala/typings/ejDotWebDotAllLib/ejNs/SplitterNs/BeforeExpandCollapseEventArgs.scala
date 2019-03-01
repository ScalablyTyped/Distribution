package typings
package ejDotWebDotAllLib.ejNs.SplitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeExpandCollapseEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns collapsed pane details.
    */
  var collapsed: js.UndefOr[js.Any] = js.undefined
  /** returns expanded pane details.
    */
  var expanded: js.UndefOr[js.Any] = js.undefined
  /** returns the splitter model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current split bar index.
    */
  var splitbarIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeExpandCollapseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.Any = null,
    expanded: js.Any = null,
    model: Model = null,
    splitbarIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): BeforeExpandCollapseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (model != null) __obj.updateDynamic("model")(model)
    if (splitbarIndex != null) __obj.updateDynamic("splitbarIndex")(splitbarIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeExpandCollapseEventArgs]
  }
}

