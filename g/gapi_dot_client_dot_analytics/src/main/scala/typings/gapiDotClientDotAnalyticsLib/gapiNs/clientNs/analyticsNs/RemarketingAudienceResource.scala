package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_RemarketingAudienceId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_RemarketingAudienceId): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_PrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_MaxresultsStartindexPrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_RemarketingAudienceId): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_RemarketingAudienceId): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
}

