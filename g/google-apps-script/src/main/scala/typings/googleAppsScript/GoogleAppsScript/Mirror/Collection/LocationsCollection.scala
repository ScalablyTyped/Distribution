package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.LocationsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsCollection extends js.Object {
  // Gets a single location by ID.
  def get(id: String): Location
  // Retrieves a list of locations for the user.
  def list(): LocationsListResponse
}

object LocationsCollection {
  @scala.inline
  def apply(get: String => Location, list: () => LocationsListResponse): LocationsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[LocationsCollection]
  }
}

