package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemVersion
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemVersionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemVersionsCollection extends js.Object {
  // Gets one operating system version by ID.
  def get(profileId: String, id: String): OperatingSystemVersion = js.native
  // Retrieves a list of operating system versions.
  def list(profileId: String): OperatingSystemVersionsListResponse = js.native
}

object OperatingSystemVersionsCollection {
  @scala.inline
  def apply(
    get: (String, String) => OperatingSystemVersion,
    list: String => OperatingSystemVersionsListResponse
  ): OperatingSystemVersionsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemVersionsCollection]
  }
  @scala.inline
  implicit class OperatingSystemVersionsCollectionOps[Self <: OperatingSystemVersionsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => OperatingSystemVersion): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => OperatingSystemVersionsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

