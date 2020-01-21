package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemVersion
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemVersionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsCollection extends js.Object {
  // Gets one operating system version by ID.
  def get(profileId: String, id: String): OperatingSystemVersion
  // Retrieves a list of operating system versions.
  def list(profileId: String): OperatingSystemVersionsListResponse
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
}

