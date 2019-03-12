package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedResource extends js.Object {
  /** Return a list of associated books. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltAssociation): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
}

object AssociatedResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotBooksLib.Anon_AltAssociation => gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
  ): AssociatedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AssociatedResource]
  }
}

