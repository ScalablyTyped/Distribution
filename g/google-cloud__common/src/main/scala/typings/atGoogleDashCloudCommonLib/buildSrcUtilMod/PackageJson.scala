package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson extends js.Object {
  var name: java.lang.String
  var version: java.lang.String
}

object PackageJson {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): PackageJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PackageJson]
  }
}

