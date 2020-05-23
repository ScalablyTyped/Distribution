package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourcesResource extends js.Object {
  /** List custom data sources to which the user has access. */
  def list(request: PrettyPrint): Request[CustomDataSources]
}

object CustomDataSourcesResource {
  @scala.inline
  def apply(list: PrettyPrint => Request[CustomDataSources]): CustomDataSourcesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomDataSourcesResource]
  }
}

