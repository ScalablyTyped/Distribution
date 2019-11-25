package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSelectEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the select card index value.
    */
  var cardIndex: js.UndefOr[Double] = js.undefined
  /** Returns the select cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the select cell element
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the current item.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** Returns select card data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously select the card element
    */
  var previousCard: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously select card indexes
    */
  var previousRowcellindex: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CardSelectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cardIndex: Int | Double = null,
    cellIndex: Int | Double = null,
    currentCell: js.Any = null,
    currentTarget: js.Any = null,
    data: js.Any = null,
    model: js.Any = null,
    previousCard: js.Any = null,
    previousRowcellindex: js.Array[_] = null,
    `type`: String = null
  ): CardSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cardIndex != null) __obj.updateDynamic("cardIndex")(cardIndex.asInstanceOf[js.Any])
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousCard != null) __obj.updateDynamic("previousCard")(previousCard.asInstanceOf[js.Any])
    if (previousRowcellindex != null) __obj.updateDynamic("previousRowcellindex")(previousRowcellindex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardSelectEventArgs]
  }
}

