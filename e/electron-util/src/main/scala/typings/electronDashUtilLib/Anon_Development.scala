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
    val __obj = js.Dynamic.literal(development = development, linux = linux, macAppStore = macAppStore, macos = macos, main = main, renderer = renderer, usingAsar = usingAsar, windows = windows, windowsStore = windowsStore)
  
    __obj.asInstanceOf[Anon_Development]
  }
}

