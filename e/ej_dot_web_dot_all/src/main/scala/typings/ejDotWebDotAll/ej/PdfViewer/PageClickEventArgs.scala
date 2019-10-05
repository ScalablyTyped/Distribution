package typings.ejDotWebDotAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the current X position
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /** Returns the current Y position
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PageClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    `type`: String = null
  ): PageClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PageClickEventArgs]
  }
}

