package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FractalConfig extends js.Object {
  var project: js.UndefOr[atFrctlFractalLib.Anon_Author] = js.undefined
  var `project.author`: js.UndefOr[java.lang.String] = js.undefined
  var `project.title`: js.UndefOr[java.lang.String] = js.undefined
  var `project.version`: js.UndefOr[java.lang.String] = js.undefined
}

object FractalConfig {
  @scala.inline
  def apply(
    project: atFrctlFractalLib.Anon_Author = null,
    `project.author`: java.lang.String = null,
    `project.title`: java.lang.String = null,
    `project.version`: java.lang.String = null
  ): FractalConfig = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project)
    if (`project.author` != null) __obj.updateDynamic("project.author")(`project.author`)
    if (`project.title` != null) __obj.updateDynamic("project.title")(`project.title`)
    if (`project.version` != null) __obj.updateDynamic("project.version")(`project.version`)
    __obj.asInstanceOf[FractalConfig]
  }
}

