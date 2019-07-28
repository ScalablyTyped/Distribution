package typings.expressDashHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExphbsOptions extends js.Object {
  var compilerOptions: js.UndefOr[js.Any] = js.undefined
  var defaultLayout: js.UndefOr[String] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
  var handlebars: js.UndefOr[js.Any] = js.undefined
  var helpers: js.UndefOr[js.Any] = js.undefined
  var layoutsDir: js.UndefOr[String] = js.undefined
  var partialsDir: js.UndefOr[js.Any] = js.undefined
}

object ExphbsOptions {
  @scala.inline
  def apply(
    compilerOptions: js.Any = null,
    defaultLayout: String = null,
    extname: String = null,
    handlebars: js.Any = null,
    helpers: js.Any = null,
    layoutsDir: String = null,
    partialsDir: js.Any = null
  ): ExphbsOptions = {
    val __obj = js.Dynamic.literal()
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (defaultLayout != null) __obj.updateDynamic("defaultLayout")(defaultLayout)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (handlebars != null) __obj.updateDynamic("handlebars")(handlebars)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (layoutsDir != null) __obj.updateDynamic("layoutsDir")(layoutsDir)
    if (partialsDir != null) __obj.updateDynamic("partialsDir")(partialsDir)
    __obj.asInstanceOf[ExphbsOptions]
  }
}

