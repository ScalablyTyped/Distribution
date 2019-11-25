package typings.gatsby.gatsbyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackRules
  extends /* key */ StringDictionary[js.Function] {
  var css: js.Function
  var cssModules: js.Function
  var eslint: js.Function
  var fonts: js.Function
  var images: js.Function
  @JSName("js")
  var js_ : js.Function
  var media: js.Function
  var miscAssets: js.Function
  var mjs: js.Function
  var postcss: js.Function
  var yaml: js.Function
}

object WebpackRules {
  @scala.inline
  def apply(
    css: js.Function,
    cssModules: js.Function,
    eslint: js.Function,
    fonts: js.Function,
    images: js.Function,
    js_ : js.Function,
    media: js.Function,
    miscAssets: js.Function,
    mjs: js.Function,
    postcss: js.Function,
    yaml: js.Function,
    StringDictionary: /* key */ StringDictionary[js.Function] = null
  ): WebpackRules = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], cssModules = cssModules.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], miscAssets = miscAssets.asInstanceOf[js.Any], mjs = mjs.asInstanceOf[js.Any], postcss = postcss.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[WebpackRules]
  }
}

