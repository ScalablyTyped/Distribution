package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlatformType
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlatformTypesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformTypesCollection extends js.Object {
  // Gets one platform type by ID.
  def get(profileId: String, id: String): PlatformType = js.native
  // Retrieves a list of platform types.
  def list(profileId: String): PlatformTypesListResponse = js.native
}

object PlatformTypesCollection {
  @scala.inline
  def apply(get: (String, String) => PlatformType, list: String => PlatformTypesListResponse): PlatformTypesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PlatformTypesCollection]
  }
  @scala.inline
  implicit class PlatformTypesCollectionOps[Self <: PlatformTypesCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => PlatformType): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => PlatformTypesListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

