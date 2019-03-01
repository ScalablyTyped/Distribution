package typings
package electronDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Development extends js.Object {
  var development: scala.Boolean
  var linux: scala.Boolean
  var macAppStore: scala.Boolean
  var macos: scala.Boolean
  var main: scala.Boolean
  var renderer: scala.Boolean
  var usingAsar: scala.Boolean
  var windows: scala.Boolean
  var windowsStore: scala.Boolean
}

object Anon_Development {
  @scala.inline
  def apply(
    development: scala.Boolean,
    linux: scala.Boolean,
    macAppStore: scala.Boolean,
    macos: scala.Boolean,
    main: scala.Boolean,
    renderer: scala.Boolean,
    usingAsar: scala.Boolean,
    windows: scala.Boolean,
    windowsStore: scala.Boolean
  ): Anon_Development = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("development")(development)
    __obj.updateDynamic("linux")(linux)
    __obj.updateDynamic("macAppStore")(macAppStore)
    __obj.updateDynamic("macos")(macos)
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("usingAsar")(usingAsar)
    __obj.updateDynamic("windows")(windows)
    __obj.updateDynamic("windowsStore")(windowsStore)
    __obj.asInstanceOf[Anon_Development]
  }
}

