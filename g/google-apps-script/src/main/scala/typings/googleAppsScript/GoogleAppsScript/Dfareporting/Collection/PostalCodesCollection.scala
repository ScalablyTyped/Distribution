package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PostalCode
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PostalCodesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCodesCollection extends js.Object {
  // Gets one postal code by ID.
  def get(profileId: String, code: String): PostalCode = js.native
  // Retrieves a list of postal codes.
  def list(profileId: String): PostalCodesListResponse = js.native
}

object PostalCodesCollection {
  @scala.inline
  def apply(get: (String, String) => PostalCode, list: String => PostalCodesListResponse): PostalCodesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostalCodesCollection]
  }
  @scala.inline
  implicit class PostalCodesCollectionOps[Self <: PostalCodesCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => PostalCode): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => PostalCodesListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

