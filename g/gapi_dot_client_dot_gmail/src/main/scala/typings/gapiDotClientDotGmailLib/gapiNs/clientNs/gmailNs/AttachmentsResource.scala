package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Gets the specified message attachment. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[MessagePartBody]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotGmailLib.Anon_AltFieldsId => gapiDotClientLib.gapiNs.clientNs.Request[MessagePartBody]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

