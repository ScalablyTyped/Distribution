package typings
package gapiDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: gapiDotUrlshortenerLib.Anon_Fields): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: gapiDotUrlshortenerLib.Anon_FieldsRequestBody): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: gapiDotUrlshortenerLib.Anon_FieldsProjection): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
}

object url {
  @scala.inline
  def apply(
    get: gapiDotUrlshortenerLib.Anon_Fields => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource],
    insert: gapiDotUrlshortenerLib.Anon_FieldsRequestBody => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource],
    list: gapiDotUrlshortenerLib.Anon_FieldsProjection => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
  ): url = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[url]
  }
}

