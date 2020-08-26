package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RegionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionsCollection extends js.Object {
  // Retrieves a list of regions.
  def list(profileId: String): RegionsListResponse = js.native
}

object RegionsCollection {
  @scala.inline
  def apply(list: String => RegionsListResponse): RegionsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionsCollection]
  }
  @scala.inline
  implicit class RegionsCollectionOps[Self <: RegionsCollection] (val x: Self) extends AnyVal {
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
    def setList(value: String => RegionsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

