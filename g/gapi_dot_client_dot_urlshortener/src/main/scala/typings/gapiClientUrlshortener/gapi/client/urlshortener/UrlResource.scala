package typings.gapiClientUrlshortener.gapi.client.urlshortener

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientUrlshortener.AnonAlt
import typings.gapiClientUrlshortener.AnonFields
import typings.gapiClientUrlshortener.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: AnonAlt): Request_[Url]
  /** Creates a new short URL. */
  def insert(request: AnonFields): Request_[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: AnonKey): Request_[UrlHistory]
}

object UrlResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Url],
    insert: AnonFields => Request_[Url],
    list: AnonKey => Request_[UrlHistory]
  ): UrlResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlResource]
  }
}

