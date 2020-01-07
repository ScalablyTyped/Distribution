package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android app manifest. See
  * http://developer.android.com/guide/topics/manifest/manifest-intro.html
  */
@js.native
trait Schema$ApkManifest extends js.Object {
  /**
    * User-readable name for the application.
    */
  var applicationLabel: js.UndefOr[String] = js.native
  var intentFilters: js.UndefOr[js.Array[Schema$IntentFilter]] = js.native
  /**
    * Maximum API level on which the application is designed to run.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  /**
    * Minimum API level required for the application to run.
    */
  var minSdkVersion: js.UndefOr[Double] = js.native
  /**
    * Full Java-style package name for this application, e.g.
    * &quot;com.example.foo&quot;.
    */
  var packageName: js.UndefOr[String] = js.native
}

object Schema$ApkManifest {
  @scala.inline
  def apply(
    applicationLabel: String = null,
    intentFilters: js.Array[Schema$IntentFilter] = null,
    maxSdkVersion: Int | Double = null,
    minSdkVersion: Int | Double = null,
    packageName: String = null
  ): Schema$ApkManifest = {
    val __obj = js.Dynamic.literal()
    if (applicationLabel != null) __obj.updateDynamic("applicationLabel")(applicationLabel.asInstanceOf[js.Any])
    if (intentFilters != null) __obj.updateDynamic("intentFilters")(intentFilters.asInstanceOf[js.Any])
    if (maxSdkVersion != null) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.asInstanceOf[js.Any])
    if (minSdkVersion != null) __obj.updateDynamic("minSdkVersion")(minSdkVersion.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApkManifest]
  }
}

