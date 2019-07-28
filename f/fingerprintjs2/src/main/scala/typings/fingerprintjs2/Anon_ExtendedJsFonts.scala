package typings.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendedJsFonts extends js.Object {
  var extendedJsFonts: Boolean
  var swfContainerId: String
  var swfPath: String
  var userDefinedFonts: js.Array[String]
}

object Anon_ExtendedJsFonts {
  @scala.inline
  def apply(
    extendedJsFonts: Boolean,
    swfContainerId: String,
    swfPath: String,
    userDefinedFonts: js.Array[String]
  ): Anon_ExtendedJsFonts = {
    val __obj = js.Dynamic.literal(extendedJsFonts = extendedJsFonts, swfContainerId = swfContainerId, swfPath = swfPath, userDefinedFonts = userDefinedFonts)
  
    __obj.asInstanceOf[Anon_ExtendedJsFonts]
  }
}

