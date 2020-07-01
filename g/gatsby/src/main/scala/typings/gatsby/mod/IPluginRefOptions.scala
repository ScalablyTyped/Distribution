package typings.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPluginRefOptions
  extends /* key */ StringDictionary[js.Any] {
  var path: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginRef]] = js.undefined
}

object IPluginRefOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    path: String = null,
    plugins: js.Array[PluginRef] = null
  ): IPluginRefOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginRefOptions]
  }
}

