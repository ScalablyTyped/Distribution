package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.RemarketingListShare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesCollection extends js.Object {
  // Gets one remarketing list share by remarketing list ID.
  def get(profileId: String, remarketingListId: String): RemarketingListShare
  // Updates an existing remarketing list share. This method supports patch semantics.
  def patch(resource: RemarketingListShare, profileId: String, remarketingListId: String): RemarketingListShare
  // Updates an existing remarketing list share.
  def update(resource: RemarketingListShare, profileId: String): RemarketingListShare
}

object RemarketingListSharesCollection {
  @scala.inline
  def apply(
    get: (String, String) => RemarketingListShare,
    patch: (RemarketingListShare, String, String) => RemarketingListShare,
    update: (RemarketingListShare, String) => RemarketingListShare
  ): RemarketingListSharesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), patch = js.Any.fromFunction3(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[RemarketingListSharesCollection]
  }
}

