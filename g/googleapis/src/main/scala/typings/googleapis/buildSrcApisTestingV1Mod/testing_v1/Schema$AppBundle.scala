package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android App Bundle file format, containing a BundleConfig.pb file, a
  * base module directory, zero or more dynamic feature module directories.
  * &lt;p&gt;See https://developer.android.com/guide/app-bundle/build for
  * guidance on building App Bundles.
  */
@js.native
trait Schema$AppBundle extends js.Object {
  /**
    * .aab file representing the app bundle under test.
    */
  var bundleLocation: js.UndefOr[Schema$FileReference] = js.native
}

object Schema$AppBundle {
  @scala.inline
  def apply(bundleLocation: Schema$FileReference = null): Schema$AppBundle = {
    val __obj = js.Dynamic.literal()
    if (bundleLocation != null) __obj.updateDynamic("bundleLocation")(bundleLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppBundle]
  }
}

