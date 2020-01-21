package typings.frctlFractal.mod

import typings.frctlFractal.AnonAuthor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FractalConfig extends js.Object {
  var project: js.UndefOr[AnonAuthor] = js.undefined
  @JSName("project.author")
  var projectDotauthor: js.UndefOr[String] = js.undefined
  @JSName("project.title")
  var projectDottitle: js.UndefOr[String] = js.undefined
  @JSName("project.version")
  var projectDotversion: js.UndefOr[String] = js.undefined
}

object FractalConfig {
  @scala.inline
  def apply(
    project: AnonAuthor = null,
    projectDotauthor: String = null,
    projectDottitle: String = null,
    projectDotversion: String = null
  ): FractalConfig = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (projectDotauthor != null) __obj.updateDynamic("project.author")(projectDotauthor.asInstanceOf[js.Any])
    if (projectDottitle != null) __obj.updateDynamic("project.title")(projectDottitle.asInstanceOf[js.Any])
    if (projectDotversion != null) __obj.updateDynamic("project.version")(projectDotversion.asInstanceOf[js.Any])
    __obj.asInstanceOf[FractalConfig]
  }
}

