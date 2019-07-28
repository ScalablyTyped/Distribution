package typings.ejDotWebDotAll.ejNs.TagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseoutEventArgs extends js.Object {
  /** return current URL link
    */
  var URL: js.UndefOr[String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the TagCloud model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.TagCloudNs.Model] = js.undefined
  /** return current tag name
    */
  var text: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MouseoutEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ejNs.TagCloudNs.Model = null,
    text: String = null,
    `type`: String = null
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

