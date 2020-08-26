package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientIdCollection extends js.Object {
  // Hashes the given Client ID.
  def hashClientId(resource: HashClientIdRequest): HashClientIdResponse = js.native
}

object ClientIdCollection {
  @scala.inline
  def apply(hashClientId: HashClientIdRequest => HashClientIdResponse): ClientIdCollection = {
    val __obj = js.Dynamic.literal(hashClientId = js.Any.fromFunction1(hashClientId))
    __obj.asInstanceOf[ClientIdCollection]
  }
  @scala.inline
  implicit class ClientIdCollectionOps[Self <: ClientIdCollection] (val x: Self) extends AnyVal {
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
    def setHashClientId(value: HashClientIdRequest => HashClientIdResponse): Self = this.set("hashClientId", js.Any.fromFunction1(value))
  }
  
}

