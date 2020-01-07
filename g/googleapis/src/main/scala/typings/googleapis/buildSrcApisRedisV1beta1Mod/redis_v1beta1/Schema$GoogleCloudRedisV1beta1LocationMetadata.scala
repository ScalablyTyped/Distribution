package typings.googleapis.buildSrcApisRedisV1beta1Mod.redis_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This location metadata represents additional configuration options for a
  * given location where a Redis instance may be created. All fields are output
  * only. It is returned as content of the
  * `google.cloud.location.Location.metadata` field.
  */
@js.native
trait Schema$GoogleCloudRedisV1beta1LocationMetadata extends js.Object {
  /**
    * Output only. The set of available zones in the location. The map is keyed
    * by the lowercase ID of each zone, as defined by GCE. These keys can be
    * specified in `location_id` or `alternative_location_id` fields when
    * creating a Redis instance.
    */
  var availableZones: js.UndefOr[StringDictionary[Schema$GoogleCloudRedisV1beta1ZoneMetadata]] = js.native
}

object Schema$GoogleCloudRedisV1beta1LocationMetadata {
  @scala.inline
  def apply(availableZones: StringDictionary[Schema$GoogleCloudRedisV1beta1ZoneMetadata] = null): Schema$GoogleCloudRedisV1beta1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    if (availableZones != null) __obj.updateDynamic("availableZones")(availableZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudRedisV1beta1LocationMetadata]
  }
}

