package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackLoaders
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function] {
  var css: js.Function
  var eslint: js.Function
  var exports: js.Function
  var file: js.Function
  var imports: js.Function
  @JSName("js")
  var js_ : js.Function
  var json: js.Function
  var miniCssExtract: js.Function
  var `null`: js.Function
  var postcss: js.Function
  var raw: js.Function
  var style: js.Function
  var url: js.Function
  var yaml: js.Function
}

object WebpackLoaders {
  @scala.inline
  def apply(
    css: js.Function,
    eslint: js.Function,
    exports: js.Function,
    file: js.Function,
    imports: js.Function,
    js_ : js.Function,
    json: js.Function,
    miniCssExtract: js.Function,
    `null`: js.Function,
    postcss: js.Function,
    raw: js.Function,
    style: js.Function,
    url: js.Function,
    yaml: js.Function,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function] = null
  ): WebpackLoaders = {
    val __obj = js.Dynamic.literal(css = css, eslint = eslint, exports = exports, file = file, imports = imports, json = json, miniCssExtract = miniCssExtract, postcss = postcss, raw = raw, style = style, url = url, yaml = yaml)
    __obj.updateDynamic("js")(js_)
    __obj.updateDynamic("null")(`null`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[WebpackLoaders]
  }
}

