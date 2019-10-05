package typings.gapiDotUrlshortener.gapi.client.urlshortener

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotUrlshortener.Anon_Fields
import typings.gapiDotUrlshortener.Anon_FieldsProjection
import typings.gapiDotUrlshortener.Anon_FieldsRequestBody
import typings.gapiDotUrlshortener.GoogleApiUrlShortenerUrlResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: Anon_Fields): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: Anon_FieldsRequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: Anon_FieldsProjection): HttpRequest[GoogleApiUrlShortenerUrlResource]
}

object url {
  @scala.inline
  def apply(
    get: Anon_Fields => HttpRequest[GoogleApiUrlShortenerUrlResource],
    insert: Anon_FieldsRequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource],
    list: Anon_FieldsProjection => HttpRequest[GoogleApiUrlShortenerUrlResource]
  ): url = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[url]
  }
}

