package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Header text of the column corresponding to the selected card.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the current card to the Kanban.
    */
  var currentCard: js.UndefOr[String] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns Kanban element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CardClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    currentCard: String = null,
    data: js.Any = null,
    model: js.Any = null,
    target: js.Any = null,
    `type`: String = null
  ): CardClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (currentCard != null) __obj.updateDynamic("currentCard")(currentCard)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CardClickEventArgs]
  }
}

