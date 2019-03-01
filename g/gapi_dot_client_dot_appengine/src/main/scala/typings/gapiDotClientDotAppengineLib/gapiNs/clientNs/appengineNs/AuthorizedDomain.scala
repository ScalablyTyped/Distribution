package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedDomain extends js.Object {
  /** Fully qualified domain name of the domain authorized for use. Example: example.com. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Full path to the AuthorizedDomain resource in the API. Example: apps/myapp/authorizedDomains/example.com.@OutputOnly */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizedDomain {
  @scala.inline
  def apply(id: java.lang.String = null, name: java.lang.String = null): AuthorizedDomain = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AuthorizedDomain]
  }
}

