package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsCollection extends js.Object {
  // Adds a subscription for the authenticated user's channel.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Subscription,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Subscription = js.native
  // Returns subscription resources that match the API request criteria.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.SubscriptionListResponse = js.native
  // Returns subscription resources that match the API request criteria.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.SubscriptionListResponse = js.native
  // Deletes a subscription.
  def remove(id: java.lang.String): scala.Unit = js.native
}

