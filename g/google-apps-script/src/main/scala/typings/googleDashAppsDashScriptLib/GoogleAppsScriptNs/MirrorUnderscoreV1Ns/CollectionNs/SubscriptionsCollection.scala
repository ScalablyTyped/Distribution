package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsCollection extends js.Object {
  // Creates a new subscription.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription
  // Retrieves a list of subscriptions for the authenticated user and service.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.SubscriptionsListResponse
  // Deletes a subscription.
  def remove(id: java.lang.String): scala.Unit
  // Updates an existing subscription in place.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription
}

object SubscriptionsCollection {
  @scala.inline
  def apply(
    insert: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription,
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.SubscriptionsListResponse,
    remove: java.lang.String => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Subscription
  ): SubscriptionsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[SubscriptionsCollection]
  }
}

