package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_WebPropertyAdWordsLinkId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_WebPropertyAdWordsLinkId): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_PrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_MaxresultsStartindex): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_WebPropertyAdWordsLinkId): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_WebPropertyAdWordsLinkId): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
}

