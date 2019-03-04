package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns a single unsampled report. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId): gapiDotClientLib.gapiNs.clientNs.Request[UnsampledReport]
  /** Create a new unsampled report. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[UnsampledReport]
  /** Lists unsampled reports to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[UnsampledReports]
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId, 
      gapiDotClientLib.gapiNs.clientNs.Request[UnsampledReport]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[UnsampledReport]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[UnsampledReports]
    ]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[UnsampledReportsResource]
  }
}

