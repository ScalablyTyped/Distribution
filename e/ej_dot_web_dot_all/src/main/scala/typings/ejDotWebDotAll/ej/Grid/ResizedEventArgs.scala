package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the new width value.
    */
  var newWidth: js.UndefOr[Double] = js.undefined
  /** Returns the old width value.
    */
  var oldWidth: js.UndefOr[Double] = js.undefined
  /** Returns the grid object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    column: js.Any = null,
    columnIndex: Int | Double = null,
    model: js.Any = null,
    newWidth: Int | Double = null,
    oldWidth: Int | Double = null,
    target: js.Any = null,
    `type`: String = null
  ): ResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizedEventArgs]
  }
}

