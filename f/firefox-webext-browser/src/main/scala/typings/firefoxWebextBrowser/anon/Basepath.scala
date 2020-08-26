package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basepath extends js.Object {
  var base_path: ExtensionURL = js.native
  var paths: js.UndefOr[js.Array[String]] = js.native
}

object Basepath {
  @scala.inline
  def apply(base_path: ExtensionURL): Basepath = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basepath]
  }
  @scala.inline
  implicit class BasepathOps[Self <: Basepath] (val x: Self) extends AnyVal {
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
    def setBase_path(value: ExtensionURL): Self = this.set("base_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
  
}

