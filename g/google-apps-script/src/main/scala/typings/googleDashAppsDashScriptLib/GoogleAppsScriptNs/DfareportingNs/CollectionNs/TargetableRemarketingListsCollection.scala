package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetableRemarketingListsCollection extends js.Object {
  // Gets one remarketing list by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.TargetableRemarketingList = js.native
  // Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, advertiserId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.TargetableRemarketingListsListResponse = js.native
  // Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, advertiserId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.TargetableRemarketingListsListResponse = js.native
}

