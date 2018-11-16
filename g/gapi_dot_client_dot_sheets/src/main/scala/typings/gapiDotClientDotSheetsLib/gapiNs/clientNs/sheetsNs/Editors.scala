package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Editors extends js.Object {
  /**
               * True if anyone in the document's domain has edit access to the protected
               * range.  Domain protection is only supported on documents within a domain.
               */
  var domainUsersCanEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** The email addresses of groups with edit access to the protected range. */
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The email addresses of users with edit access to the protected range. */
  var users: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

