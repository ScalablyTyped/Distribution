package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesCollection extends js.Object {
  // Gets one remarketing list share by remarketing list ID.
  def get(profileId: java.lang.String, remarketingListId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare
  // Updates an existing remarketing list share. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare,
    profileId: java.lang.String,
    remarketingListId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare
  // Updates an existing remarketing list share.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare
}

object RemarketingListSharesCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.RemarketingListShare
  ): RemarketingListSharesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), patch = js.Any.fromFunction3(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[RemarketingListSharesCollection]
  }
}

