package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFieldsKeyLocaleMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: AnonAltFieldsKeyLocaleMaxResults): Request_[Volumes]
}

object UseruploadedResource {
  @scala.inline
  def apply(list: AnonAltFieldsKeyLocaleMaxResults => Request_[Volumes]): UseruploadedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UseruploadedResource]
  }
}

