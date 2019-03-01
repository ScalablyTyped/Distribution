package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extension extends js.Object {
  /** Extensions and packaged applications a user has installed (be _really_ careful!). */
  var extension: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites that have been installed as hosted applications (be careful!). */
  var protectedWeb: js.UndefOr[scala.Boolean] = js.undefined
  /** Normal websites. */
  var unprotectedWeb: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Extension {
  @scala.inline
  def apply(
    extension: js.UndefOr[scala.Boolean] = js.undefined,
    protectedWeb: js.UndefOr[scala.Boolean] = js.undefined,
    unprotectedWeb: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Extension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(protectedWeb)) __obj.updateDynamic("protectedWeb")(protectedWeb)
    if (!js.isUndefined(unprotectedWeb)) __obj.updateDynamic("unprotectedWeb")(unprotectedWeb)
    __obj.asInstanceOf[Anon_Extension]
  }
}

