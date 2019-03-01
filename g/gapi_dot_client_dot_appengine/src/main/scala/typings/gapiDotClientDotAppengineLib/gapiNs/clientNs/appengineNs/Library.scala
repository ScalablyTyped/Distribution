package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library extends js.Object {
  /** Name of the library. Example: "django". */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the library to select, or "latest". */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Library {
  @scala.inline
  def apply(name: java.lang.String = null, version: java.lang.String = null): Library = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Library]
  }
}

