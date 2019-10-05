package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsResource extends js.Object {
  /** Lists all columns for a report type */
  def list(request: Anon_AltFieldsKey): Request[Columns]
}

object ColumnsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[Columns]): ColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ColumnsResource]
  }
}

