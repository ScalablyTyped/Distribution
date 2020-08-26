package typings.globule.mod

import typings.globule.globuleStrings.first
import typings.globule.globuleStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingOptions extends FindOptions {
  var destBase: js.UndefOr[String] = js.native
  var ext: js.UndefOr[String] = js.native
  var extDot: js.UndefOr[first | last] = js.native
  var flatten: js.UndefOr[Boolean] = js.native
  var rename: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}

object MappingOptions {
  @scala.inline
  def apply(): MappingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingOptions]
  }
  @scala.inline
  implicit class MappingOptionsOps[Self <: MappingOptions] (val x: Self) extends AnyVal {
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
    def setDestBase(value: String): Self = this.set("destBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestBase: Self = this.set("destBase", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setExtDot(value: first | last): Self = this.set("extDot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtDot: Self = this.set("extDot", js.undefined)
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setRename(value: /* p */ String => String): Self = this.set("rename", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
  }
  
}

