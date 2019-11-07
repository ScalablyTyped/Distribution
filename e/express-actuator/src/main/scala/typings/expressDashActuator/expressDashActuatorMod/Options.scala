package typings.expressDashActuator.expressDashActuatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for {@link Actuator} function.
  */
trait Options extends js.Object {
  /**
    * @summary BasePath of Actuator.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * @summary infoGitMode.
    */
  var infoGitMode: js.UndefOr[InfoGitMode] = js.undefined
}

object Options {
  @scala.inline
  def apply(basePath: String = null, infoGitMode: InfoGitMode = null): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (infoGitMode != null) __obj.updateDynamic("infoGitMode")(infoGitMode)
    __obj.asInstanceOf[Options]
  }
}

