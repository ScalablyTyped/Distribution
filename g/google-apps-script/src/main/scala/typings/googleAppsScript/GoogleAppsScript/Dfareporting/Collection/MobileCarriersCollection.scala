package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarrier
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarriersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileCarriersCollection extends js.Object {
  // Gets one mobile carrier by ID.
  def get(profileId: String, id: String): MobileCarrier = js.native
  // Retrieves a list of mobile carriers.
  def list(profileId: String): MobileCarriersListResponse = js.native
}

object MobileCarriersCollection {
  @scala.inline
  def apply(get: (String, String) => MobileCarrier, list: String => MobileCarriersListResponse): MobileCarriersCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MobileCarriersCollection]
  }
  @scala.inline
  implicit class MobileCarriersCollectionOps[Self <: MobileCarriersCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => MobileCarrier): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => MobileCarriersListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

