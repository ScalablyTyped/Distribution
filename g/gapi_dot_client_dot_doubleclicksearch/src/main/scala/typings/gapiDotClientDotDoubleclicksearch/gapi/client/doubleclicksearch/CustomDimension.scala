package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  /** Custom dimension name. */
  var name: js.UndefOr[String] = js.undefined
  /** Custom dimension value. */
  var value: js.UndefOr[String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(name: String = null, value: String = null): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDimension]
  }
}

