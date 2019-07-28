package typings.atFrctlFractal.atFrctlFractalMod

import typings.atFrctlFractal.Anon_Author
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FractalConfig extends js.Object {
  var project: js.UndefOr[Anon_Author] = js.undefined
  var `project.author`: js.UndefOr[String] = js.undefined
  var `project.title`: js.UndefOr[String] = js.undefined
  var `project.version`: js.UndefOr[String] = js.undefined
}

object FractalConfig {
  @scala.inline
  def apply(
    project: Anon_Author = null,
    `project.author`: String = null,
    `project.title`: String = null,
    `project.version`: String = null
  ): FractalConfig = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project)
    if (`project.author` != null) __obj.updateDynamic("project.author")(`project.author`)
    if (`project.title` != null) __obj.updateDynamic("project.title")(`project.title`)
    if (`project.version` != null) __obj.updateDynamic("project.version")(`project.version`)
    __obj.asInstanceOf[FractalConfig]
  }
}

