package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.experiments.APIChildScope
import typings.firefoxWebextBrowser.browser.experiments.APIPath
import typings.firefoxWebextBrowser.browser.experiments.APIPaths
import typings.firefoxWebextBrowser.browser.experiments.ExperimentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths extends js.Object {
  var paths: APIPaths = js.native
  var scopes: js.Array[APIChildScope] = js.native
  var script: ExperimentURL = js.native
}

object Paths {
  @scala.inline
  def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): Paths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  @scala.inline
  implicit class PathsOps[Self <: Paths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathsVarargs(value: APIPath*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: APIPaths): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: APIChildScope*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[APIChildScope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: ExperimentURL): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

