package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityUserLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpropertyUserLinksCollection extends js.Object {
  // Adds a new user to the given web property.
  def insert(resource: EntityUserLink, accountId: String, webPropertyId: String): EntityUserLink = js.native
  // Lists webProperty-user links for a given web property.
  def list(accountId: String, webPropertyId: String): EntityUserLinks = js.native
  // Lists webProperty-user links for a given web property.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): EntityUserLinks = js.native
  // Removes a user from the given web property.
  def remove(accountId: String, webPropertyId: String, linkId: String): Unit = js.native
  // Updates permissions for an existing user on the given web property.
  def update(resource: EntityUserLink, accountId: String, webPropertyId: String, linkId: String): EntityUserLink = js.native
}

