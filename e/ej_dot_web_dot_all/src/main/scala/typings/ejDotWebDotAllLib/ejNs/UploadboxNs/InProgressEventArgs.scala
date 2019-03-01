package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InProgressEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** AJAX event argument for reference.
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns Selected FileList objects
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the current progress percentage.
    */
  var percentage: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object InProgressEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    e: js.Any = null,
    files: js.Any = null,
    model: js.Any = null,
    percentage: js.Any = null,
    `type`: java.lang.String = null
  ): InProgressEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (e != null) __obj.updateDynamic("e")(e)
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InProgressEventArgs]
  }
}

