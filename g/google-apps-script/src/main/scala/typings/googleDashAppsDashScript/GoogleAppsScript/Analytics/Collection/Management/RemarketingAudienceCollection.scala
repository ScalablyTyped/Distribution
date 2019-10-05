package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RemarketingAudience
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RemarketingAudiences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceCollection extends js.Object {
  // Gets a remarketing audience to which the user has access.
  def get(accountId: String, webPropertyId: String, remarketingAudienceId: String): RemarketingAudience = js.native
  // Creates a new remarketing audience.
  def insert(resource: RemarketingAudience, accountId: String, webPropertyId: String): RemarketingAudience = js.native
  // Lists remarketing audiences to which the user has access.
  def list(accountId: String, webPropertyId: String): RemarketingAudiences = js.native
  // Lists remarketing audiences to which the user has access.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): RemarketingAudiences = js.native
  // Updates an existing remarketing audience. This method supports patch semantics.
  def patch(
    resource: RemarketingAudience,
    accountId: String,
    webPropertyId: String,
    remarketingAudienceId: String
  ): RemarketingAudience = js.native
  // Delete a remarketing audience.
  def remove(accountId: String, webPropertyId: String, remarketingAudienceId: String): Unit = js.native
  // Updates an existing remarketing audience.
  def update(
    resource: RemarketingAudience,
    accountId: String,
    webPropertyId: String,
    remarketingAudienceId: String
  ): RemarketingAudience = js.native
}

