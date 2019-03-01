package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
}

object UseruploadedResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
    ]
  ): UseruploadedResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[UseruploadedResource]
  }
}

