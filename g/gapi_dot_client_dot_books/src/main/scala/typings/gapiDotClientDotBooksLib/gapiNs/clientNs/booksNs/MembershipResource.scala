package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipResource extends js.Object {
  /** Returns Series membership data given the series id. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPagesize): gapiDotClientLib.gapiNs.clientNs.Request[Seriesmembership]
}

object MembershipResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPagesize, 
      gapiDotClientLib.gapiNs.clientNs.Request[Seriesmembership]
    ]
  ): MembershipResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[MembershipResource]
  }
}

