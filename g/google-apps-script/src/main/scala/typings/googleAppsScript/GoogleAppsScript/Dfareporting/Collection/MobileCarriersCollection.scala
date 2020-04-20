package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarrier
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarriersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersCollection extends js.Object {
  // Gets one mobile carrier by ID.
  def get(profileId: String, id: String): MobileCarrier
  // Retrieves a list of mobile carriers.
  def list(profileId: String): MobileCarriersListResponse
}

object MobileCarriersCollection {
  @scala.inline
  def apply(get: (String, String) => MobileCarrier, list: String => MobileCarriersListResponse): MobileCarriersCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MobileCarriersCollection]
  }
}

