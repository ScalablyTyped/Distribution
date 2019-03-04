package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubprofilesResource extends js.Object {
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[GetPublisherProfilesByAccountIdResponse]
}

object PubprofilesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetPublisherProfilesByAccountIdResponse]
    ]
  ): PubprofilesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[PubprofilesResource]
  }
}

