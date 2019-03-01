package typings
package ejDotWebDotAllLib.ejNs.SplitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the splitter model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns next pane details.
    */
  var nextPane: js.UndefOr[js.Any] = js.undefined
  /** returns previous pane details.
    */
  var prevPane: js.UndefOr[js.Any] = js.undefined
  /** returns the current split bar index.
    */
  var splitbarIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ResizeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    nextPane: js.Any = null,
    prevPane: js.Any = null,
    splitbarIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (nextPane != null) __obj.updateDynamic("nextPane")(nextPane)
    if (prevPane != null) __obj.updateDynamic("prevPane")(prevPane)
    if (splitbarIndex != null) __obj.updateDynamic("splitbarIndex")(splitbarIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizeEventArgs]
  }
}

