package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Effective extends js.Object {
  /**
    * Effective permissions represent all the permissions that a user has for this entity. These include any implied permissions (e.g., EDIT implies VIEW) or
    * inherited permissions from the parent entity. Effective permissions are read-only.
    */
  var effective: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Permissions that a user has been assigned at this very level. Does not include any implied or inherited permissions. Local permissions are modifiable. */
  var local: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

