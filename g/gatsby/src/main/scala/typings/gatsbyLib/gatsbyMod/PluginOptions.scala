package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var plugins: js.Array[_]
}

object PluginOptions {
  @scala.inline
  def apply(
    plugins: js.Array[_],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal(plugins = plugins)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PluginOptions]
  }
}

