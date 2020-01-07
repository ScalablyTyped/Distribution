package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  A resource that represents a location with full geographic
  * information.
  */
@js.native
trait Schema$JobLocation extends js.Object {
  /**
    * An object representing a latitude/longitude pair.
    */
  var latLng: js.UndefOr[Schema$LatLng] = js.native
  /**
    * The type of a location, which corresponds to the address lines field of
    * PostalAddress. For example, &quot;Downtown, Atlanta, GA, USA&quot; has a
    * type of LocationType#NEIGHBORHOOD, and &quot;Kansas City, KS, USA&quot;
    * has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.native
  /**
    * Postal address of the location that includes human readable information,
    * such as postal delivery and payments addresses. Given a postal address, a
    * postal service can deliver items to a premises, P.O. Box, or other
    * delivery location.
    */
  var postalAddress: js.UndefOr[Schema$PostalAddress] = js.native
  /**
    * Radius in meters of the job location. This value is derived from the
    * location bounding box in which a circle with the specified radius
    * centered from LatLng coves the area associated with the job location. For
    * example, currently, &quot;Mountain View, CA, USA&quot; has a radius of
    * 7885.79 meters.
    */
  var radiusMeters: js.UndefOr[Double] = js.native
}

object Schema$JobLocation {
  @scala.inline
  def apply(
    latLng: Schema$LatLng = null,
    locationType: String = null,
    postalAddress: Schema$PostalAddress = null,
    radiusMeters: Int | Double = null
  ): Schema$JobLocation = {
    val __obj = js.Dynamic.literal()
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (radiusMeters != null) __obj.updateDynamic("radiusMeters")(radiusMeters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobLocation]
  }
}

