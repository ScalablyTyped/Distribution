package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /** An Android device which must be used with an Android test. */
  var androidDevice: js.UndefOr[AndroidDevice] = js.undefined
}

object Environment {
  @scala.inline
  def apply(androidDevice: AndroidDevice = null): Environment = {
    val __obj = js.Dynamic.literal()
    if (androidDevice != null) __obj.updateDynamic("androidDevice")(androidDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

