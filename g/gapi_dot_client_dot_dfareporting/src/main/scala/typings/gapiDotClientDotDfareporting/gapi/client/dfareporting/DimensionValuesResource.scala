package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValuesResource extends js.Object {
  /** Retrieves list of report dimension values for a list of filters. */
  def query(request: Anon_AltFieldsKeyMaxResults): Request[DimensionValueList]
}

object DimensionValuesResource {
  @scala.inline
  def apply(query: Anon_AltFieldsKeyMaxResults => Request[DimensionValueList]): DimensionValuesResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[DimensionValuesResource]
  }
}

