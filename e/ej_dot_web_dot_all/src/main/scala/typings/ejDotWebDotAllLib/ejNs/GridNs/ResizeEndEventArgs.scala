package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEndEventArgs extends js.Object {
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the extra width value.
    */
  var extra: js.UndefOr[scala.Double] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the new width value.
    */
  var newWidth: js.UndefOr[scala.Double] = js.undefined
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

object ResizeEndEventArgs {
  @scala.inline
  def apply(
    column: js.Any = null,
    columnIndex: scala.Int | scala.Double = null,
    extra: scala.Int | scala.Double = null,
    model: js.Any = null,
    newWidth: scala.Int | scala.Double = null,
    oldWidth: scala.Int | scala.Double = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): ResizeEndEventArgs = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizeEndEventArgs]
  }
}

