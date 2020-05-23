package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of collapsing record..
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or collapsing state.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** Returns the row index of collapsing record.
    */
  var recordIndex: js.UndefOr[Double] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CollapsingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    recordIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): CollapsingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recordIndex)) __obj.updateDynamic("recordIndex")(recordIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsingEventArgs]
  }
}

