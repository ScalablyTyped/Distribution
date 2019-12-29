package typings.ejDotWebDotAll.ej.Splitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
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
  var splitbarIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    nextPane: js.Any = null,
    prevPane: js.Any = null,
    splitbarIndex: Int | Double = null,
    `type`: String = null
  ): ResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (nextPane != null) __obj.updateDynamic("nextPane")(nextPane.asInstanceOf[js.Any])
    if (prevPane != null) __obj.updateDynamic("prevPane")(prevPane.asInstanceOf[js.Any])
    if (splitbarIndex != null) __obj.updateDynamic("splitbarIndex")(splitbarIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEventArgs]
  }
}

