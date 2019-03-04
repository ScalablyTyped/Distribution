package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoStart extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

trait Anon_Autostart extends js.Object {
  var autostart: scala.Boolean
}

object Anon_AutoStart {
  @scala.inline
  def apply(autoStart: js.UndefOr[scala.Boolean] = js.undefined, speed: scala.Int | scala.Double = null): Anon_AutoStart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoStart]
  }
}

object Anon_Autostart {
  @scala.inline
  def apply(autostart: scala.Boolean): Anon_Autostart = {
    val __obj = js.Dynamic.literal(autostart = autostart)
  
    __obj.asInstanceOf[Anon_Autostart]
  }
}

