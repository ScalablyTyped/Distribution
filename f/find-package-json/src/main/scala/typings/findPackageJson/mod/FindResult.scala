package typings.findPackageJson.mod

import typings.findPackageJson.findPackageJsonBooleans.`false`
import typings.findPackageJson.findPackageJsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.findPackageJson.mod.FoundPackage
  - typings.findPackageJson.mod.Done
*/
trait FindResult extends js.Object

object FindResult {
  @scala.inline
  def FoundPackage(done: `false`, filename: String, value: Package): FindResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResult]
  }
  @scala.inline
  def Done(done: `true`): FindResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResult]
  }
}

