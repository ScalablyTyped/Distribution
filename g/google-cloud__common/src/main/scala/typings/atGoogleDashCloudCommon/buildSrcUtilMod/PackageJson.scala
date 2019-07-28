package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson extends js.Object {
  var name: String
  var version: String
}

object PackageJson {
  @scala.inline
  def apply(name: String, version: String): PackageJson = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[PackageJson]
  }
}

