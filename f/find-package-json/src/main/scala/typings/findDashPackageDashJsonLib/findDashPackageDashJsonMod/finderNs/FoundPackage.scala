package typings
package findDashPackageDashJsonLib.findDashPackageDashJsonMod.finderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundPackage extends FindResult {
  var done: findDashPackageDashJsonLib.findDashPackageDashJsonLibNumbers.`false`
  var filename: java.lang.String
  var value: Package
}

object FoundPackage {
  @scala.inline
  def apply(
    done: findDashPackageDashJsonLib.findDashPackageDashJsonLibNumbers.`false`,
    filename: java.lang.String,
    value: Package
  ): FoundPackage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FoundPackage]
  }
}

