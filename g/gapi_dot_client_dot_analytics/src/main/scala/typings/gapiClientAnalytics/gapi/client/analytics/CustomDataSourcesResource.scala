package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourcesResource extends js.Object {
  /** List custom data sources to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomDataSources]
}

object CustomDataSourcesResource {
  @scala.inline
  def apply(list: AnonPrettyPrint => Request_[CustomDataSources]): CustomDataSourcesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomDataSourcesResource]
  }
}

