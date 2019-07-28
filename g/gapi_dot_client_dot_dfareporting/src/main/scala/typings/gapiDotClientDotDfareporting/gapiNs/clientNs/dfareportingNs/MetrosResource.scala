package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosResource extends js.Object {
  /** Retrieves a list of metros. */
  def list(request: Anon_AltFieldsKey): Request[MetrosListResponse]
}

object MetrosResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[MetrosListResponse]): MetrosResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetrosResource]
  }
}

