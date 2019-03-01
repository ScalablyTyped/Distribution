package typings
package fingerprintjs2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendedJsFonts extends js.Object {
  var extendedJsFonts: scala.Boolean
  var swfContainerId: java.lang.String
  var swfPath: java.lang.String
  var userDefinedFonts: js.Array[java.lang.String]
}

object Anon_ExtendedJsFonts {
  @scala.inline
  def apply(
    extendedJsFonts: scala.Boolean,
    swfContainerId: java.lang.String,
    swfPath: java.lang.String,
    userDefinedFonts: js.Array[java.lang.String]
  ): Anon_ExtendedJsFonts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extendedJsFonts")(extendedJsFonts)
    __obj.updateDynamic("swfContainerId")(swfContainerId)
    __obj.updateDynamic("swfPath")(swfPath)
    __obj.updateDynamic("userDefinedFonts")(userDefinedFonts)
    __obj.asInstanceOf[Anon_ExtendedJsFonts]
  }
}

