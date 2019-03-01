package typings
package ejDotWebDotAllLib.ejNs.DocumentEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRequestNavigateEventArgs extends js.Object {
  /** true, if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the link type and navigation link.
    */
  var hyperlink: js.UndefOr[js.Any] = js.undefined
  /** Returns the document editor model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OnRequestNavigateEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    hyperlink: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): OnRequestNavigateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OnRequestNavigateEventArgs]
  }
}

