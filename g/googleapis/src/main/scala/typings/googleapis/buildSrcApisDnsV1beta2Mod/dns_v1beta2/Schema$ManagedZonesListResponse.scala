package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZonesListResponse extends js.Object {
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var managedZones: js.UndefOr[js.Array[Schema$ManagedZone]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ManagedZonesListResponse {
  @scala.inline
  def apply(
    header: Schema$ResponseHeader = null,
    kind: String = null,
    managedZones: js.Array[Schema$ManagedZone] = null,
    nextPageToken: String = null
  ): Schema$ManagedZonesListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedZones != null) __obj.updateDynamic("managedZones")(managedZones.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZonesListResponse]
  }
}

