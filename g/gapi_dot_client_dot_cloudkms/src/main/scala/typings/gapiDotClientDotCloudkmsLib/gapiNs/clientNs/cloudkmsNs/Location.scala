package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Location extends js.Object {
  /**
               * Cross-service attributes for the location. For example
               *
               * {"cloud.googleapis.com/region": "us-east1"}
               */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The canonical id for this location. For example: `"us-east1"`. */
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Service-specific metadata. For example the available capacity at the given
               * location.
               */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * Resource name for the location, which may vary between implementations.
               * For example: `"projects/example-project/locations/us-east1"`
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

