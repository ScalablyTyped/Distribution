package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AcquireMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MybooksResource extends js.Object {
  /** Return a list of books in My Library. */
  def list(request: Anon_AcquireMethod): Request[Volumes]
}

object MybooksResource {
  @scala.inline
  def apply(list: Anon_AcquireMethod => Request[Volumes]): MybooksResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MybooksResource]
  }
}

