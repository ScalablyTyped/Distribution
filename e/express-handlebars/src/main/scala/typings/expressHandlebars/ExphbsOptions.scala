package typings.expressHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExphbsOptions extends js.Object {
  var compilerOptions: js.UndefOr[js.Any] = js.native
  var defaultLayout: js.UndefOr[String] = js.native
  var extname: js.UndefOr[String] = js.native
  var handlebars: js.UndefOr[js.Any] = js.native
  var helpers: js.UndefOr[js.Any] = js.native
  var layoutsDir: js.UndefOr[String] = js.native
  var partialsDir: js.UndefOr[js.Any] = js.native
}

object ExphbsOptions {
  @scala.inline
  def apply(): ExphbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExphbsOptions]
  }
  @scala.inline
  implicit class ExphbsOptionsOps[Self <: ExphbsOptions] (val x: Self) extends AnyVal {
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
    def setCompilerOptions(value: js.Any): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    @scala.inline
    def setDefaultLayout(value: String): Self = this.set("defaultLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLayout: Self = this.set("defaultLayout", js.undefined)
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtname: Self = this.set("extname", js.undefined)
    @scala.inline
    def setHandlebars(value: js.Any): Self = this.set("handlebars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlebars: Self = this.set("handlebars", js.undefined)
    @scala.inline
    def setHelpers(value: js.Any): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    @scala.inline
    def setLayoutsDir(value: String): Self = this.set("layoutsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutsDir: Self = this.set("layoutsDir", js.undefined)
    @scala.inline
    def setPartialsDir(value: js.Any): Self = this.set("partialsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialsDir: Self = this.set("partialsDir", js.undefined)
  }
  
}

