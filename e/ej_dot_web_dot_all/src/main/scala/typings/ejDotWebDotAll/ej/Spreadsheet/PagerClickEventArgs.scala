package typings.ejDotWebDotAll.ej.Spreadsheet

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Spreadsheet.Model] = js.undefined
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
    activeSheet: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    gotoSheet: Int | Double = null,
    model: typings.ejDotWebDotAll.ej.Spreadsheet.Model = null,
    newSheet: js.UndefOr[Boolean] = js.undefined,
    target: HTMLElement = null,
    `type`: String = null
  ): PagerClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeSheet != null) __obj.updateDynamic("activeSheet")(activeSheet.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (gotoSheet != null) __obj.updateDynamic("gotoSheet")(gotoSheet.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PagerClickEventArgs]
  }
}

