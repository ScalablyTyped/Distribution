package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProtectedWeb extends js.Object {
  /** Extensions and packaged applications a user has installed (be _really_ careful!). */
  var extension: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites that have been installed as hosted applications (be careful!). */
  var protectedWeb: js.UndefOr[scala.Boolean] = js.undefined
  /** Normal websites. */
  var unprotectedWeb: js.UndefOr[scala.Boolean] = js.undefined
}

