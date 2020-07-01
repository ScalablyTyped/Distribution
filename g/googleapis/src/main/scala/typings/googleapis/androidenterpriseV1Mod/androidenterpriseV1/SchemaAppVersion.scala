package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a single version of the app.
  */
@js.native
trait SchemaAppVersion extends js.Object {
  /**
    * True if this version is a production APK.
    */
  var isProduction: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated, use trackId instead.
    */
  var track: js.UndefOr[String] = js.native
  /**
    * Track ids that the app version is published in. Replaces the track field
    * (deprecated), but doesn&#39;t include the production track (see
    * isProduction instead).
    */
  var trackId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Unique increasing identifier for the app version.
    */
  var versionCode: js.UndefOr[Double] = js.native
  /**
    * The string used in the Play store by the app developer to identify the
    * version. The string is not necessarily unique or localized (for example,
    * the string could be &quot;1.4&quot;).
    */
  var versionString: js.UndefOr[String] = js.native
}

object SchemaAppVersion {
  @scala.inline
  def apply(
    isProduction: js.UndefOr[Boolean] = js.undefined,
    track: String = null,
    trackId: js.Array[String] = null,
    versionCode: js.UndefOr[Double] = js.undefined,
    versionString: String = null
  ): SchemaAppVersion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isProduction)) __obj.updateDynamic("isProduction")(isProduction.get.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (trackId != null) __obj.updateDynamic("trackId")(trackId.asInstanceOf[js.Any])
    if (!js.isUndefined(versionCode)) __obj.updateDynamic("versionCode")(versionCode.get.asInstanceOf[js.Any])
    if (versionString != null) __obj.updateDynamic("versionString")(versionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppVersion]
  }
}

