package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthenticationInfo extends js.Object {
  /**
               * The authority selector specified by the requestor, if any.
               * It is not guaranteed that the principal was allowed to use this authority.
               */
  var authoritySelector: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The email address of the authenticated user (or service account on behalf
               * of third party principal) making the request. For privacy reasons, the
               * principal email address is redacted for all read-only operations that fail
               * with a "permission denied" error.
               */
  var principalEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The third party identification (if any) of the authenticated user making
               * the request.
               * When the JSON object represented here has a proto equivalent, the proto
               * name will be indicated in the `@type` property.
               */
  var thirdPartyPrincipal: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

