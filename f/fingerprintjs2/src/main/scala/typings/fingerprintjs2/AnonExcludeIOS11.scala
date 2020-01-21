package typings.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeIOS11 extends js.Object {
  /**
    * On iOS 11, audio context can only be used in response to user interaction.
    * We require users to explicitly enable audio fingerprinting on iOS 11.
    * See https://stackoverflow.com/questions/46363048/onaudioprocess-not-called-on-ios11#46534088
    */
  var excludeIOS11: Boolean
  var timeout: Double
}

object AnonExcludeIOS11 {
  @scala.inline
  def apply(excludeIOS11: Boolean, timeout: Double): AnonExcludeIOS11 = {
    val __obj = js.Dynamic.literal(excludeIOS11 = excludeIOS11.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludeIOS11]
  }
}

