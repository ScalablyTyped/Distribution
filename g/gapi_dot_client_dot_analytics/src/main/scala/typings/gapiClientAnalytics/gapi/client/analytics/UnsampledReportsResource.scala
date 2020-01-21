package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId): Request_[Unit]
  /** Returns a single unsampled report. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId): Request_[UnsampledReport]
  /** Create a new unsampled report. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[UnsampledReport]
  /** Lists unsampled reports to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken): Request_[UnsampledReports]
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId => Request_[Unit],
    get: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintProfileId => Request_[UnsampledReport],
    insert: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[UnsampledReport],
    list: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken => Request_[UnsampledReports]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UnsampledReportsResource]
  }
}

