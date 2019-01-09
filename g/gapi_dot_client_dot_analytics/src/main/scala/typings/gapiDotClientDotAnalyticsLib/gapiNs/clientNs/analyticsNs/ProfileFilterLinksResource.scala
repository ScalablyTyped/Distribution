package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns a single profile filter link. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
}

