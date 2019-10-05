package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertyAdWordsLinksCollection extends js.Object {
  // Returns a web property-Google Ads link to which the user has access.
  def get(accountId: String, webPropertyId: String, webPropertyAdWordsLinkId: String): EntityAdWordsLink = js.native
  // Creates a webProperty-Google Ads link.
  def insert(resource: EntityAdWordsLink, accountId: String, webPropertyId: String): EntityAdWordsLink = js.native
  // Lists webProperty-Google Ads links for a given web property.
  def list(accountId: String, webPropertyId: String): EntityAdWordsLinks = js.native
  // Lists webProperty-Google Ads links for a given web property.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): EntityAdWordsLinks = js.native
  // Updates an existing webProperty-Google Ads link. This method supports patch semantics.
  def patch(
    resource: EntityAdWordsLink,
    accountId: String,
    webPropertyId: String,
    webPropertyAdWordsLinkId: String
  ): EntityAdWordsLink = js.native
  // Deletes a web property-Google Ads link.
  def remove(accountId: String, webPropertyId: String, webPropertyAdWordsLinkId: String): Unit = js.native
  // Updates an existing webProperty-Google Ads link.
  def update(
    resource: EntityAdWordsLink,
    accountId: String,
    webPropertyId: String,
    webPropertyAdWordsLinkId: String
  ): EntityAdWordsLink = js.native
}

