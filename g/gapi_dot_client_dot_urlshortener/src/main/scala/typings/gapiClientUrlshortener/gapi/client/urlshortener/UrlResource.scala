package typings.gapiClientUrlshortener.gapi.client.urlshortener

import typings.gapiClient.gapi.client.Request
import typings.gapiClientUrlshortener.anon.Alt
import typings.gapiClientUrlshortener.anon.Fields
import typings.gapiClientUrlshortener.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: Alt): Request[Url] = js.native
  /** Creates a new short URL. */
  def insert(request: Fields): Request[Url] = js.native
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: Key): Request[UrlHistory] = js.native
}

object UrlResource {
  @scala.inline
  def apply(get: Alt => Request[Url], insert: Fields => Request[Url], list: Key => Request[UrlHistory]): UrlResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlResource]
  }
  @scala.inline
  implicit class UrlResourceOps[Self <: UrlResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[Url]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Url]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[UrlHistory]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

