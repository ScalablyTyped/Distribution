package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.LocationsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsCollection extends js.Object {
  
  // Gets a single location by ID.
  def get(id: String): Location = js.native
  
  // Retrieves a list of locations for the user.
  def list(): LocationsListResponse = js.native
}
object LocationsCollection {
  
  @scala.inline
  def apply(get: String => Location, list: () => LocationsListResponse): LocationsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[LocationsCollection]
  }
  
  @scala.inline
  implicit class LocationsCollectionOps[Self <: LocationsCollection] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => Location): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => LocationsListResponse): Self = this.set("list", js.Any.fromFunction0(value))
  }
}
