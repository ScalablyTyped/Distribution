package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId): Request[Unit]
  /** Returns a single unsampled report. */
  def get(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId): Request[UnsampledReport]
  /** Create a new unsampled report. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[UnsampledReport]
  /** Lists unsampled reports to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): Request[UnsampledReports]
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId => Request[Unit],
    get: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId => Request[UnsampledReport],
    insert: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[UnsampledReport],
    list: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => Request[UnsampledReports]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UnsampledReportsResource]
  }
}

