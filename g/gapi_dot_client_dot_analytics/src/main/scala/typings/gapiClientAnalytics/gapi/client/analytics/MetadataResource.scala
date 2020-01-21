package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataResource extends js.Object {
  var columns: ColumnsResource
}

object MetadataResource {
  @scala.inline
  def apply(columns: ColumnsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetadataResource]
  }
}

