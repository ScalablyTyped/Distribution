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
    get: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[MessagePartBody]
    ]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

