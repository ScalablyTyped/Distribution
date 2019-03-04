package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basepath extends js.Object {
  var base_path: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Basepath {
  @scala.inline
  def apply(
    base_path: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL,
    paths: js.Array[java.lang.String] = null
  ): Anon_Basepath = {
    val __obj = js.Dynamic.literal(base_path = base_path)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[Anon_Basepath]
  }
}

