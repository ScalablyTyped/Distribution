package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TrackRelease extends js.Object {
  var countryTargeting: js.UndefOr[Schema$CountryTargeting] = js.native
  /**
    * The release name, used to identify this release in the Play Console UI.
    * Not required to be unique. This is optional, if not set it will be
    * generated from the version_name in the APKs.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The description of what is new in the app in this release.
    */
  var releaseNotes: js.UndefOr[js.Array[Schema$LocalizedText]] = js.native
  /**
    * The desired status of this release.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Fraction of users who are eligible to receive the release. 0 &lt;
    * fraction &lt; 1. To be set, release status must be &quot;inProgress&quot;
    * or &quot;halted&quot;.
    */
  var userFraction: js.UndefOr[Double] = js.native
  /**
    * A list of all version codes of APKs that will be exposed to the users of
    * this track when this release is rolled out. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TrackRelease {
  @scala.inline
  def apply(
    countryTargeting: Schema$CountryTargeting = null,
    name: String = null,
    releaseNotes: js.Array[Schema$LocalizedText] = null,
    status: String = null,
    userFraction: Int | Double = null,
    versionCodes: js.Array[String] = null
  ): Schema$TrackRelease = {
    val __obj = js.Dynamic.literal()
    if (countryTargeting != null) __obj.updateDynamic("countryTargeting")(countryTargeting.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (releaseNotes != null) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userFraction != null) __obj.updateDynamic("userFraction")(userFraction.asInstanceOf[js.Any])
    if (versionCodes != null) __obj.updateDynamic("versionCodes")(versionCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TrackRelease]
  }
}

