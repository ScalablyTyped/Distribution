package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basepath extends js.Object {
  var base_path: ExtensionURL
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Basepath {
  @scala.inline
  def apply(base_path: ExtensionURL, paths: js.Array[String] = null): Anon_Basepath = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Basepath]
  }
}

