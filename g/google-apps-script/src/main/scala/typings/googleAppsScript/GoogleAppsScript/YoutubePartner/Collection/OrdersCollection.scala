package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Order
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.OrderListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCollection extends js.Object {
  
  // Retrieve the details of an existing order.
  def get(orderId: String): Order = js.native
  // Retrieve the details of an existing order.
  def get(orderId: String, optionalArgs: js.Object): Order = js.native
  
  // Creates a new basic order entry in the YouTube premium asset order management system. You must supply at least a country and channel in the new order.
  def insert(resource: Order): Order = js.native
  // Creates a new basic order entry in the YouTube premium asset order management system. You must supply at least a country and channel in the new order.
  def insert(resource: Order, optionalArgs: js.Object): Order = js.native
  
  // Return a list of orders, filtered by the parameters below, may return more than a single page of results.
  def list(): OrderListResponse = js.native
  // Return a list of orders, filtered by the parameters below, may return more than a single page of results.
  def list(optionalArgs: js.Object): OrderListResponse = js.native
  
  // Update the values in an existing order. This method supports patch semantics.
  def patch(resource: Order, orderId: String): Order = js.native
  // Update the values in an existing order. This method supports patch semantics.
  def patch(resource: Order, orderId: String, optionalArgs: js.Object): Order = js.native
  
  // Delete an order, which moves orders to inactive state and removes any associated video.
  def remove(orderId: String): Unit = js.native
  // Delete an order, which moves orders to inactive state and removes any associated video.
  def remove(orderId: String, optionalArgs: js.Object): Unit = js.native
  
  // Update the values in an existing order.
  def update(resource: Order, orderId: String): Order = js.native
  // Update the values in an existing order.
  def update(resource: Order, orderId: String, optionalArgs: js.Object): Order = js.native
}
