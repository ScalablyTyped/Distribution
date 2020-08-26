package typings.findPackageJson.mod

import typings.findPackageJson.findPackageJsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundPackage extends FindResult {
  var done: `false` = js.native
  var filename: String = js.native
  var value: Package = js.native
}

object FoundPackage {
  @scala.inline
  def apply(done: `false`, filename: String, value: Package): FoundPackage = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundPackage]
  }
  @scala.inline
  implicit class FoundPackageOps[Self <: FoundPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDone(value: `false`): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Package): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

