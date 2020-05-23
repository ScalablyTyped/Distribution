package typings.gapiUrlshortener.gapi.client.urlshortener

import typings.gapi.gapi.client.HttpRequest
import typings.gapiUrlshortener.GoogleApiUrlShortenerUrlResource
import typings.gapiUrlshortener.anon.Fields
import typings.gapiUrlshortener.anon.Projection
import typings.gapiUrlshortener.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: Fields): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: RequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: Projection): HttpRequest[GoogleApiUrlShortenerUrlResource]
}

object url {
  @scala.inline
  def apply(
    get: Fields => HttpRequest[GoogleApiUrlShortenerUrlResource],
    insert: RequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource],
    list: Projection => HttpRequest[GoogleApiUrlShortenerUrlResource]
  ): url = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[url]
  }
}

