package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeStartEventArgs extends js.Object {
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the old width value.
    */
  var oldWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns the grid object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ResizeStartEventArgs {
  @scala.inline
  def apply(
    column: js.Any = null,
    columnIndex: scala.Int | scala.Double = null,
    model: js.Any = null,
    oldWidth: scala.Int | scala.Double = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): ResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizeStartEventArgs]
  }
}

