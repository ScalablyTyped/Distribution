package typings.gapiUrlshortener.gapi.client.urlshortener

import typings.gapi.gapi.client.HttpRequest
import typings.gapiUrlshortener.GoogleApiUrlShortenerUrlResource
import typings.gapiUrlshortener.anon.Fields
import typings.gapiUrlshortener.anon.Projection
import typings.gapiUrlshortener.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: Fields): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
  /**
    * Creates a new short URL.
    */
  def insert(`object`: RequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: Projection): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
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
  @scala.inline
  implicit class urlOps[Self <: url] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Fields => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: RequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Projection => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

