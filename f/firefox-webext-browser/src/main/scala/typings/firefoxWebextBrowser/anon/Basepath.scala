package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basepath extends js.Object {
  var base_path: ExtensionURL
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object Basepath {
  @scala.inline
  def apply(base_path: ExtensionURL, paths: js.Array[String] = null): Basepath = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basepath]
  }
}

