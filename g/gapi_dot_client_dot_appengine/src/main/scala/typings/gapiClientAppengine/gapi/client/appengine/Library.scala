package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library extends js.Object {
  /** Name of the library. Example: "django". */
  var name: js.UndefOr[String] = js.undefined
  /** Version of the library to select, or "latest". */
  var version: js.UndefOr[String] = js.undefined
}

object Library {
  @scala.inline
  def apply(name: String = null, version: String = null): Library = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Library]
  }
}

