package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.BrowsersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowsersCollection extends js.Object {
  // Retrieves a list of browsers.
  def list(profileId: String): BrowsersListResponse = js.native
}

object BrowsersCollection {
  @scala.inline
  def apply(list: String => BrowsersListResponse): BrowsersCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BrowsersCollection]
  }
  @scala.inline
  implicit class BrowsersCollectionOps[Self <: BrowsersCollection] (val x: Self) extends AnyVal {
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
    def setList(value: String => BrowsersListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

