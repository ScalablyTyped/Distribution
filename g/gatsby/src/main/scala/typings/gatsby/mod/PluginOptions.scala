package typings.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions
  extends /* key */ StringDictionary[js.Any] {
  var plugins: js.Array[_]
}

object PluginOptions {
  @scala.inline
  def apply(plugins: js.Array[_], StringDictionary: /* key */ StringDictionary[js.Any] = null): PluginOptions = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PluginOptions]
  }
}

