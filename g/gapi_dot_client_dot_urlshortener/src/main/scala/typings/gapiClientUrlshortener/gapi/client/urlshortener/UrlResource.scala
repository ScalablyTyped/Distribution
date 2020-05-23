package typings.gapiClientUrlshortener.gapi.client.urlshortener

import typings.gapiClient.gapi.client.Request
import typings.gapiClientUrlshortener.anon.Alt
import typings.gapiClientUrlshortener.anon.Fields
import typings.gapiClientUrlshortener.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: Alt): Request[Url]
  /** Creates a new short URL. */
  def insert(request: Fields): Request[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: Key): Request[UrlHistory]
}

object UrlResource {
  @scala.inline
  def apply(get: Alt => Request[Url], insert: Fields => Request[Url], list: Key => Request[UrlHistory]): UrlResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlResource]
  }
}

