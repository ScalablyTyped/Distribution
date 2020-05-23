package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerClickEventArgs extends js.Object {
  /** Returns the active sheet index.
    */
  var activeSheet: js.UndefOr[Double] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the new sheet index.
    */
  var gotoSheet: js.UndefOr[Double] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns whether new sheet icon is clicked.
    */
  var newSheet: js.UndefOr[Boolean] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PagerClickEventArgs {
  @scala.inline
  def apply(
    activeSheet: js.UndefOr[Double] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    gotoSheet: js.UndefOr[Double] = js.undefined,
    model: Model = null,
    newSheet: js.UndefOr[Boolean] = js.undefined,
    target: HTMLElement = null,
    `type`: String = null
  ): PagerClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeSheet)) __obj.updateDynamic("activeSheet")(activeSheet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoSheet)) __obj.updateDynamic("gotoSheet")(gotoSheet.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerClickEventArgs]
  }
}

