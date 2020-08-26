package typings.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvListFilesOptions extends js.Object {
  /**
    * Node environment (development/test/production/etc,.).
    */
  var node_env: js.UndefOr[String] = js.native
}

object DotenvListFilesOptions {
  @scala.inline
  def apply(): DotenvListFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvListFilesOptions]
  }
  @scala.inline
  implicit class DotenvListFilesOptionsOps[Self <: DotenvListFilesOptions] (val x: Self) extends AnyVal {
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
    def setNode_env(value: String): Self = this.set("node_env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode_env: Self = this.set("node_env", js.undefined)
  }
  
}

