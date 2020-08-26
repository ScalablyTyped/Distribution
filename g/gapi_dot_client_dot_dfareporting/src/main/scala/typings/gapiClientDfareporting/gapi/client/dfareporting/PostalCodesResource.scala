package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Code
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: Code): Request[PostalCode] = js.native
  /** Retrieves a list of postal codes. */
  def list(request: Key): Request[PostalCodesListResponse] = js.native
}

object PostalCodesResource {
  @scala.inline
  def apply(get: Code => Request[PostalCode], list: Key => Request[PostalCodesListResponse]): PostalCodesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostalCodesResource]
  }
  @scala.inline
  implicit class PostalCodesResourceOps[Self <: PostalCodesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Code => Request[PostalCode]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[PostalCodesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

