package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourcesResource extends js.Object {
  /** List custom data sources to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresults): Request[CustomDataSources]
}

object CustomDataSourcesResource {
  @scala.inline
  def apply(list: Anon_AccountIdAltFieldsKeyMaxresults => Request[CustomDataSources]): CustomDataSourcesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CustomDataSourcesResource]
  }
}

