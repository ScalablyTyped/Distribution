package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedResource extends js.Object {
  /** Return a list of associated books. */
  def list(request: Anon_AltAssociation): Request[Volumes]
}

object AssociatedResource {
  @scala.inline
  def apply(list: Anon_AltAssociation => Request[Volumes]): AssociatedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AssociatedResource]
  }
}

