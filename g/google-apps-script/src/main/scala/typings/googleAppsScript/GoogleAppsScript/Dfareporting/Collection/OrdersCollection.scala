package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Order
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OrdersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCollection extends js.Object {
  
  // Gets one order by ID.
  def get(profileId: String, projectId: String, id: String): Order = js.native
  
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String): OrdersListResponse = js.native
  // Retrieves a list of orders, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String, optionalArgs: js.Object): OrdersListResponse = js.native
}
