package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystem
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsCollection extends js.Object {
  // Gets one operating system by DART ID.
  def get(profileId: String, dartId: String): OperatingSystem
  // Retrieves a list of operating systems.
  def list(profileId: String): OperatingSystemsListResponse
}

object OperatingSystemsCollection {
  @scala.inline
  def apply(get: (String, String) => OperatingSystem, list: String => OperatingSystemsListResponse): OperatingSystemsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemsCollection]
  }
}

