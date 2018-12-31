package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authentication extends js.Object {
  /** Defines a set of authentication providers that a service supports. */
  var providers: js.UndefOr[js.Array[AuthProvider]] = js.undefined
  /**
    * A list of authentication rules that apply to individual API methods.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[AuthenticationRule]] = js.undefined
}

