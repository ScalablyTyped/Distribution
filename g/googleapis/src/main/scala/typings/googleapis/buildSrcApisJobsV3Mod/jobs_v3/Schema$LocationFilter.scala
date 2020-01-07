package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Geographic region of the search.
  */
@js.native
trait Schema$LocationFilter extends js.Object {
  /**
    * Optional.  The address name, such as &quot;Mountain View&quot; or
    * &quot;Bay Area&quot;.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Optional.   The distance_in_miles is applied when the location being
    * searched for is identified as a city or smaller. When the location being
    * searched for is a state or larger, this field is ignored.
    */
  var distanceInMiles: js.UndefOr[Double] = js.native
  /**
    * Optional.  The latitude and longitude of the geographic center from which
    * to search. This field&#39;s ignored if `address` is provided.
    */
  var latLng: js.UndefOr[Schema$LatLng] = js.native
  /**
    * Optional.  CLDR region code of the country/region of the address. This is
    * used to address ambiguity of the user-input location, for example,
    * &quot;Liverpool&quot; against &quot;Liverpool, NY, US&quot; or
    * &quot;Liverpool, UK&quot;.  Set this field if all the jobs to search
    * against are from a same region, or jobs are world-wide, but the job
    * seeker is from a specific region.  See http://cldr.unicode.org/ and
    * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
    * for details. Example: &quot;CH&quot; for Switzerland.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * Optional.  Allows the client to return jobs without a set location,
    * specifically, telecommuting jobs (telecomuting is considered by the
    * service as a special location. Job.posting_region indicates if a job
    * permits telecommuting. If this field is set to
    * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are
    * searched, and address and lat_lng are ignored. If not set or set to
    * TelecommutePreference.TELECOMMUTE_EXCLUDED, telecommute job are not
    * searched.  This filter can be used by itself to search exclusively for
    * telecommuting jobs, or it can be combined with another location filter to
    * search for a combination of job locations, such as &quot;Mountain
    * View&quot; or &quot;telecommuting&quot; jobs. However, when used in
    * combination with other location filters, telecommuting jobs can be
    * treated as less relevant than other jobs in the search response.
    */
  var telecommutePreference: js.UndefOr[String] = js.native
}

object Schema$LocationFilter {
  @scala.inline
  def apply(
    address: String = null,
    distanceInMiles: Int | Double = null,
    latLng: Schema$LatLng = null,
    regionCode: String = null,
    telecommutePreference: String = null
  ): Schema$LocationFilter = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (distanceInMiles != null) __obj.updateDynamic("distanceInMiles")(distanceInMiles.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (telecommutePreference != null) __obj.updateDynamic("telecommutePreference")(telecommutePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocationFilter]
  }
}

