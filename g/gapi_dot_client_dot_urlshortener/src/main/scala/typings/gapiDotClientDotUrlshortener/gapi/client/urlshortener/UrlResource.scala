package typings.gapiDotClientDotUrlshortener.gapi.client.urlshortener

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotUrlshortener.Anon_Alt
import typings.gapiDotClientDotUrlshortener.Anon_AltFields
import typings.gapiDotClientDotUrlshortener.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: Anon_Alt): Request[Url]
  /** Creates a new short URL. */
  def insert(request: Anon_AltFields): Request[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: Anon_AltFieldsKey): Request[UrlHistory]
}

object UrlResource {
  @scala.inline
  def apply(
    get: Anon_Alt => Request[Url],
    insert: Anon_AltFields => Request[Url],
    list: Anon_AltFieldsKey => Request[UrlHistory]
  ): UrlResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UrlResource]
  }
}

