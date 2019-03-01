package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebThemeOptions extends js.Object {
  var favicon: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var nav: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var panels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var rtl: scala.Boolean
  var scripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var skin: js.UndefOr[java.lang.String] = js.undefined
  var static: js.UndefOr[atFrctlFractalLib.Anon_Mount] = js.undefined
  var `static.mount`: java.lang.String
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WebThemeOptions {
  @scala.inline
  def apply(
    rtl: scala.Boolean,
    `static.mount`: java.lang.String,
    favicon: java.lang.String = null,
    format: java.lang.String = null,
    lang: java.lang.String = null,
    nav: js.Array[java.lang.String] = null,
    panels: js.Array[java.lang.String] = null,
    scripts: js.Array[java.lang.String] = null,
    skin: java.lang.String = null,
    static: atFrctlFractalLib.Anon_Mount = null,
    styles: js.Array[java.lang.String] = null,
    version: java.lang.String = null
  ): WebThemeOptions = {
    val __obj = js.Dynamic.literal(`static.mount` = `static.mount`)
    __obj.updateDynamic("rtl")(rtl)
    if (favicon != null) __obj.updateDynamic("favicon")(favicon)
    if (format != null) __obj.updateDynamic("format")(format)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (nav != null) __obj.updateDynamic("nav")(nav)
    if (panels != null) __obj.updateDynamic("panels")(panels)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (static != null) __obj.updateDynamic("static")(static)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WebThemeOptions]
  }
}

