package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MybooksResource extends js.Object {
  /** Return a list of books in My Library. */
  def list(request: gapiDotClientDotBooksLib.Anon_AcquireMethod): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
}

object MybooksResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotBooksLib.Anon_AcquireMethod, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
    ]
  ): MybooksResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[MybooksResource]
  }
}

