package typings.frctlFractal.mod

import typings.frctlFractal.anon.Author
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FractalConfig extends js.Object {
  var project: js.UndefOr[Author] = js.native
  @JSName("project.author")
  var projectDotauthor: js.UndefOr[String] = js.native
  @JSName("project.title")
  var projectDottitle: js.UndefOr[String] = js.native
  @JSName("project.version")
  var projectDotversion: js.UndefOr[String] = js.native
}

object FractalConfig {
  @scala.inline
  def apply(): FractalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractalConfig]
  }
  @scala.inline
  implicit class FractalConfigOps[Self <: FractalConfig] (val x: Self) extends AnyVal {
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
    def setProject(value: Author): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setProjectDotauthor(value: String): Self = this.set("project.author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectDotauthor: Self = this.set("project.author", js.undefined)
    @scala.inline
    def setProjectDottitle(value: String): Self = this.set("project.title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectDottitle: Self = this.set("project.title", js.undefined)
    @scala.inline
    def setProjectDotversion(value: String): Self = this.set("project.version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectDotversion: Self = this.set("project.version", js.undefined)
  }
  
}

