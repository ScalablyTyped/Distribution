package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Paths extends js.Object {
  var paths: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIPaths
  var scopes: js.Array[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIChildScope]
  var script: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentURL
}

object Anon_Paths {
  @scala.inline
  def apply(
    paths: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIPaths,
    scopes: js.Array[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIChildScope],
    script: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentURL
  ): Anon_Paths = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paths")(paths)
    __obj.updateDynamic("scopes")(scopes)
    __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[Anon_Paths]
  }
}

