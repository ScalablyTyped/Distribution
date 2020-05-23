package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.experiments.APIChildScope
import typings.firefoxWebextBrowser.browser.experiments.APIPaths
import typings.firefoxWebextBrowser.browser.experiments.ExperimentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  var paths: APIPaths
  var scopes: js.Array[APIChildScope]
  var script: ExperimentURL
}

object Paths {
  @scala.inline
  def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): Paths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
}

