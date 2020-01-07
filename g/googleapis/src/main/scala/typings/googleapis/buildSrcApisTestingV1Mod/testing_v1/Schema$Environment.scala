package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environment in which the test is run.
  */
@js.native
trait Schema$Environment extends js.Object {
  /**
    * An Android device which must be used with an Android test.
    */
  var androidDevice: js.UndefOr[Schema$AndroidDevice] = js.native
  /**
    * An iOS device which must be used with an iOS test.
    */
  var iosDevice: js.UndefOr[Schema$IosDevice] = js.native
}

object Schema$Environment {
  @scala.inline
  def apply(androidDevice: Schema$AndroidDevice = null, iosDevice: Schema$IosDevice = null): Schema$Environment = {
    val __obj = js.Dynamic.literal()
    if (androidDevice != null) __obj.updateDynamic("androidDevice")(androidDevice.asInstanceOf[js.Any])
    if (iosDevice != null) __obj.updateDynamic("iosDevice")(iosDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Environment]
  }
}

