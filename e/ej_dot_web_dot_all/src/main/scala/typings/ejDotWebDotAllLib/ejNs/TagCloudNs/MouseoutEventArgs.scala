package typings
package ejDotWebDotAllLib.ejNs.TagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseoutEventArgs extends js.Object {
  /** return current URL link
    */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TagCloud model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** return current tag name
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MouseoutEventArgs {
  @scala.inline
  def apply(
    URL: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): MouseoutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseoutEventArgs]
  }
}

