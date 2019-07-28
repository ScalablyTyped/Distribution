package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * Cross-service attributes for the location. For example
    * {"cloud.googleapis.com/region": "us-east1"}
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** The canonical id for this location. For example: "us-east1". */
  var locationId: js.UndefOr[String] = js.undefined
  /** Service-specific metadata. For example the available capacity at the given location. */
  var metadata: js.UndefOr[Record[String, _]] = js.undefined
  /** Resource name for the location, which may vary between implementations. For example: "projects/example-project/locations/us-east1" */
  var name: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    labels: Record[String, String] = null,
    locationId: String = null,
    metadata: Record[String, _] = null,
    name: String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Location]
  }
}

