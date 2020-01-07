package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android package file to install.
  */
@js.native
trait Schema$Apk extends js.Object {
  /**
    * The path to an APK to be installed on the device before the test begins.
    */
  var location: js.UndefOr[Schema$FileReference] = js.native
  /**
    * The java package for the APK to be installed. Value is determined by
    * examining the application&#39;s manifest.
    */
  var packageName: js.UndefOr[String] = js.native
}

object Schema$Apk {
  @scala.inline
  def apply(location: Schema$FileReference = null, packageName: String = null): Schema$Apk = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Apk]
  }
}

