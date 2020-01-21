package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** Key of the label. */
  var key: js.UndefOr[String] = js.undefined
  /** Value of the label. */
  var value: js.UndefOr[String] = js.undefined
}

object Label {
  @scala.inline
  def apply(key: String = null, value: String = null): Label = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

