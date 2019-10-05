package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomScheme extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/custom-scheme
  var privileges: js.UndefOr[Privileges] = js.undefined
  /**
    * Custom schemes to be registered with options.
    */
  var scheme: String
}

object CustomScheme {
  @scala.inline
  def apply(scheme: String, privileges: Privileges = null): CustomScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (privileges != null) __obj.updateDynamic("privileges")(privileges)
    __obj.asInstanceOf[CustomScheme]
  }
}

