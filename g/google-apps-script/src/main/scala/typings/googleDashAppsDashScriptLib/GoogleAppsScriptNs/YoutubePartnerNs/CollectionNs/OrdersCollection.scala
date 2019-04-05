package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Retrieve the details of an existing order.
  def get(orderId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Retrieve the details of an existing order.
  def get(orderId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Creates a new basic order entry in the YouTube premium asset order management system. You must supply at least a country and channel in the new order.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Creates a new basic order entry in the YouTube premium asset order management system. You must supply at least a country and channel in the new order.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Return a list of orders, filtered by the parameters below, may return more than a single page of results.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.OrderListResponse = js.native
  // Return a list of orders, filtered by the parameters below, may return more than a single page of results.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.OrderListResponse = js.native
  // Update the values in an existing order. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Update the values in an existing order. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order,
    orderId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Delete an order, which moves orders to inactive state and removes any associated video.
  def remove(orderId: java.lang.String): scala.Unit = js.native
  // Delete an order, which moves orders to inactive state and removes any associated video.
  def remove(orderId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Update the values in an existing order.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
  // Update the values in an existing order.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order,
    orderId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.Order = js.native
}

