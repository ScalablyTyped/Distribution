package typings.gapiDotClientDotMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UserData {
  @scala.inline
  def apply(key: String = null, value: String = null): UserData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UserData]
  }
}

