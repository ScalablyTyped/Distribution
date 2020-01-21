package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsCollection extends js.Object {
  // Adds a subscription for the authenticated user's channel.
  def insert(resource: Subscription, part: String): Subscription = js.native
  // Returns subscription resources that match the API request criteria.
  def list(part: String): SubscriptionListResponse = js.native
  // Returns subscription resources that match the API request criteria.
  def list(part: String, optionalArgs: js.Object): SubscriptionListResponse = js.native
  // Deletes a subscription.
  def remove(id: String): Unit = js.native
}

