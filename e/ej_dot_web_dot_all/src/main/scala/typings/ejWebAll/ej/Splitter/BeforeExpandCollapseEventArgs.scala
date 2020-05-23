package typings.ejWebAll.ej.Splitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeExpandCollapseEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
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
  var splitbarIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeExpandCollapseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    collapsed: js.Any = null,
    expanded: js.Any = null,
    model: Model = null,
    splitbarIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): BeforeExpandCollapseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(splitbarIndex)) __obj.updateDynamic("splitbarIndex")(splitbarIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeExpandCollapseEventArgs]
  }
}

