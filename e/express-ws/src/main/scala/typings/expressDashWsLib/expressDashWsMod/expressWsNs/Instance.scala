package typings
package expressDashWsLib.expressDashWsMod.expressWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var app: Application
  def applyTo(target: RouterLike): scala.Unit
  def getWss(): wsLib.wsMod.Server
}

object Instance {
  @scala.inline
  def apply(
    app: Application,
    applyTo: js.Function1[RouterLike, scala.Unit],
    getWss: js.Function0[wsLib.wsMod.Server]
  ): Instance = {
    val __obj = js.Dynamic.literal(app = app, applyTo = applyTo, getWss = getWss)
  
    __obj.asInstanceOf[Instance]
  }
}

