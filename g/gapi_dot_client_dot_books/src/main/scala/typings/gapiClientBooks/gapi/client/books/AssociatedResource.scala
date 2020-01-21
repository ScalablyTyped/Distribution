package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedResource extends js.Object {
  /** Return a list of associated books. */
  def list(request: AnonAltAssociation): Request_[Volumes]
}

object AssociatedResource {
  @scala.inline
  def apply(list: AnonAltAssociation => Request_[Volumes]): AssociatedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AssociatedResource]
  }
}

