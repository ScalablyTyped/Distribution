package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of selected record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selecting row element.
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the event type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RowSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    recordIndex: Int | Double = null,
    targetRow: js.Any = null,
    `type`: String = null
  ): RowSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowSelectedEventArgs]
  }
}

