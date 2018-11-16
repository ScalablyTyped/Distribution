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

