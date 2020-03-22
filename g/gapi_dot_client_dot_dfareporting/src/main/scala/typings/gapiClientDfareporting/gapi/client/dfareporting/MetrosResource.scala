package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosResource extends js.Object {
  /** Retrieves a list of metros. */
  def list(request: AnonKey): Request_[MetrosListResponse]
}

object MetrosResource {
  @scala.inline
  def apply(list: AnonKey => Request_[MetrosListResponse]): MetrosResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetrosResource]
  }
}

