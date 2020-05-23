package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Association
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedResource extends js.Object {
  /** Return a list of associated books. */
  def list(request: Association): Request[Volumes]
}

object AssociatedResource {
  @scala.inline
  def apply(list: Association => Request[Volumes]): AssociatedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AssociatedResource]
  }
}

