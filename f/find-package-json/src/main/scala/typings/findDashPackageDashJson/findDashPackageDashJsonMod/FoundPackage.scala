package typings.findDashPackageDashJson.findDashPackageDashJsonMod

import typings.findDashPackageDashJson.findDashPackageDashJsonNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundPackage extends FindResult {
  var done: `false`
  var filename: String
  var value: Package
}

object FoundPackage {
  @scala.inline
  def apply(done: `false`, filename: String, value: Package): FoundPackage = {
    val __obj = js.Dynamic.literal(done = done, filename = filename, value = value)
  
    __obj.asInstanceOf[FoundPackage]
  }
}

