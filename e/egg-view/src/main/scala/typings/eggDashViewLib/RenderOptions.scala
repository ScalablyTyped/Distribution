package typings
package eggDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions
  extends eggLib.eggMod.PlainObject[js.Any] {
  var locals: js.UndefOr[eggLib.eggMod.PlainObject[_]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var viewEngine: js.UndefOr[java.lang.String] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    locals: eggLib.eggMod.PlainObject[_] = null,
    name: java.lang.String = null,
    root: java.lang.String = null,
    viewEngine: java.lang.String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    if (viewEngine != null) __obj.updateDynamic("viewEngine")(viewEngine)
    __obj.asInstanceOf[RenderOptions]
  }
}

