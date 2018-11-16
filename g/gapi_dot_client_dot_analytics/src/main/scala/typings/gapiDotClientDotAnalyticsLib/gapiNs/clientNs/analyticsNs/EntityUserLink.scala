package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EntityUserLink extends js.Object {
  /** Entity for this link. It can be an account, a web property, or a view (profile). */
  var entity: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_WebPropertyRef] = js.undefined
  /** Entity user link ID */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for entity user link. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions the user has for this entity. */
  var permissions: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Effective] = js.undefined
  /** Self link for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** User reference. */
  var userRef: js.UndefOr[UserRef] = js.undefined
}

