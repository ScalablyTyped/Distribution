package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_ProfileIdLinkId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_ProfileIdMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_ProfileIdLinkId): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
}

