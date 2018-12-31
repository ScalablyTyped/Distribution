package typings
package fingerprintjs2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeIOS11 extends js.Object {
  /**
    * On iOS 11, audio context can only be used in response to user interaction.
    * We require users to explicitly enable audio fingerprinting on iOS 11.
    * See https://stackoverflow.com/questions/46363048/onaudioprocess-not-called-on-ios11#46534088
    */
  var excludeIOS11: scala.Boolean
  var timeout: scala.Double
}

