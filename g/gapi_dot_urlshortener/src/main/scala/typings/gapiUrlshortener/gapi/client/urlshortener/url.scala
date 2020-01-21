package typings.gapiUrlshortener.gapi.client.urlshortener

import typings.gapi.gapi.client.HttpRequest
import typings.gapiUrlshortener.AnonFields
import typings.gapiUrlshortener.AnonFieldsProjection
import typings.gapiUrlshortener.AnonFieldsRequestBody
import typings.gapiUrlshortener.GoogleApiUrlShortenerUrlResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: AnonFields): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: AnonFieldsRequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: AnonFieldsProjection): HttpRequest[GoogleApiUrlShortenerUrlResource]
}

object url {
  @scala.inline
  def apply(
    get: AnonFields => HttpRequest[GoogleApiUrlShortenerUrlResource],
    insert: AnonFieldsRequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource],
    list: AnonFieldsProjection => HttpRequest[GoogleApiUrlShortenerUrlResource]
  ): url = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[url]
  }
}

