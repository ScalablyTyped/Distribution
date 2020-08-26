package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystem
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemsCollection extends js.Object {
  // Gets one operating system by DART ID.
  def get(profileId: String, dartId: String): OperatingSystem = js.native
  // Retrieves a list of operating systems.
  def list(profileId: String): OperatingSystemsListResponse = js.native
}

object OperatingSystemsCollection {
  @scala.inline
  def apply(get: (String, String) => OperatingSystem, list: String => OperatingSystemsListResponse): OperatingSystemsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemsCollection]
  }
  @scala.inline
  implicit class OperatingSystemsCollectionOps[Self <: OperatingSystemsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => OperatingSystem): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => OperatingSystemsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

