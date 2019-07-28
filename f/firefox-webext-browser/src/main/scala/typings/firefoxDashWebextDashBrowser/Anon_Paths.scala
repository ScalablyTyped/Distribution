package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.APIChildScope
import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.APIPaths
import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.ExperimentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Paths extends js.Object {
  var paths: APIPaths
  var scopes: js.Array[APIChildScope]
  var script: ExperimentURL
}

object Anon_Paths {
  @scala.inline
  def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): Anon_Paths = {
    val __obj = js.Dynamic.literal(paths = paths, scopes = scopes, script = script)
  
    __obj.asInstanceOf[Anon_Paths]
  }
}

