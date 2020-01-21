package typings.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackLoaders
  extends /* key */ StringDictionary[js.Function] {
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
    StringDictionary: /* key */ StringDictionary[js.Function] = null
  ): WebpackLoaders = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], miniCssExtract = miniCssExtract.asInstanceOf[js.Any], postcss = postcss.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[WebpackLoaders]
  }
}

