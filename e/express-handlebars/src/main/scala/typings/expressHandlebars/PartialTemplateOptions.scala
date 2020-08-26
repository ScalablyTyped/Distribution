package typings.expressHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialTemplateOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var precompiled: js.UndefOr[Boolean] = js.native
}

object PartialTemplateOptions {
  @scala.inline
  def apply(): PartialTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTemplateOptions]
  }
  @scala.inline
  implicit class PartialTemplateOptionsOps[Self <: PartialTemplateOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setPrecompiled(value: Boolean): Self = this.set("precompiled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecompiled: Self = this.set("precompiled", js.undefined)
  }
  
}

