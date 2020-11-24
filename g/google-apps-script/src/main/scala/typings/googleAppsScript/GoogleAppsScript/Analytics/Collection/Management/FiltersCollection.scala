package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Filter
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiltersCollection extends js.Object {
  
  // Returns a filters to which the user has access.
  def get(accountId: String, filterId: String): Filter = js.native
  
  // Create a new filter.
  def insert(resource: Filter, accountId: String): Filter = js.native
  
  // Lists all filters for an account
  def list(accountId: String): Filters = js.native
  // Lists all filters for an account
  def list(accountId: String, optionalArgs: js.Object): Filters = js.native
  
  // Updates an existing filter. This method supports patch semantics.
  def patch(resource: Filter, accountId: String, filterId: String): Filter = js.native
  
  // Delete a filter.
  def remove(accountId: String, filterId: String): Filter = js.native
  
  // Updates an existing filter.
  def update(resource: Filter, accountId: String, filterId: String): Filter = js.native
}
