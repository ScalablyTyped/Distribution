package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLocaleMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: Anon_AltFieldsKeyLocaleMaxResults): Request[Volumes]
}

object UseruploadedResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKeyLocaleMaxResults => Request[Volumes]): UseruploadedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UseruploadedResource]
  }
}

