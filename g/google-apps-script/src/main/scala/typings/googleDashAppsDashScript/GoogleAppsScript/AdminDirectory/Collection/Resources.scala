package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Building
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Buildings
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.CalendarResource
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.CalendarResources
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Feature
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.FeatureRename
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.AdminDirectory.Collection.Resources")
@js.native
object Resources extends js.Object {
  @js.native
  trait BuildingsCollection extends js.Object {
    // Retrieves a building.
    def get(customer: String, buildingId: String): Building = js.native
    // Inserts a building.
    def insert(resource: Building, customer: String): Building = js.native
    // Inserts a building.
    def insert(resource: Building, customer: String, optionalArgs: js.Object): Building = js.native
    // Retrieves a list of buildings for an account.
    def list(customer: String): Buildings = js.native
    // Retrieves a list of buildings for an account.
    def list(customer: String, optionalArgs: js.Object): Buildings = js.native
    // Updates a building. This method supports patch semantics.
    def patch(resource: Building, customer: String, buildingId: String): Building = js.native
    // Updates a building. This method supports patch semantics.
    def patch(resource: Building, customer: String, buildingId: String, optionalArgs: js.Object): Building = js.native
    // Deletes a building.
    def remove(customer: String, buildingId: String): Unit = js.native
    // Updates a building.
    def update(resource: Building, customer: String, buildingId: String): Building = js.native
    // Updates a building.
    def update(resource: Building, customer: String, buildingId: String, optionalArgs: js.Object): Building = js.native
  }
  
  @js.native
  trait CalendarsCollection extends js.Object {
    // Retrieves a calendar resource.
    def get(customer: String, calendarResourceId: String): CalendarResource = js.native
    // Inserts a calendar resource.
    def insert(resource: CalendarResource, customer: String): CalendarResource = js.native
    // Retrieves a list of calendar resources for an account.
    def list(customer: String): CalendarResources = js.native
    // Retrieves a list of calendar resources for an account.
    def list(customer: String, optionalArgs: js.Object): CalendarResources = js.native
    // Updates a calendar resource.
    // This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved. This method supports patch semantics.
    def patch(resource: CalendarResource, customer: String, calendarResourceId: String): CalendarResource = js.native
    // Deletes a calendar resource.
    def remove(customer: String, calendarResourceId: String): Unit = js.native
    // Updates a calendar resource.
    // This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved.
    def update(resource: CalendarResource, customer: String, calendarResourceId: String): CalendarResource = js.native
  }
  
  @js.native
  trait FeaturesCollection extends js.Object {
    // Retrieves a feature.
    def get(customer: String, featureKey: String): Feature = js.native
    // Inserts a feature.
    def insert(resource: Feature, customer: String): Feature = js.native
    // Retrieves a list of features for an account.
    def list(customer: String): Features = js.native
    // Retrieves a list of features for an account.
    def list(customer: String, optionalArgs: js.Object): Features = js.native
    // Updates a feature. This method supports patch semantics.
    def patch(resource: Feature, customer: String, featureKey: String): Feature = js.native
    // Deletes a feature.
    def remove(customer: String, featureKey: String): Unit = js.native
    // Renames a feature.
    def rename(resource: FeatureRename, customer: String, oldName: String): Unit = js.native
    // Updates a feature.
    def update(resource: Feature, customer: String, featureKey: String): Feature = js.native
  }
  
}

