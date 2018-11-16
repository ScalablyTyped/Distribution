package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Touch")
@js.native
class Touch () extends js.Object

@JSGlobal("createjs.Touch")
@js.native
object Touch extends js.Object {
  // methods
  def disable(stage: easeljsLib.createjsNs.Stage): scala.Unit = js.native
  def enable(stage: easeljsLib.createjsNs.Stage): scala.Boolean = js.native
  def enable(stage: easeljsLib.createjsNs.Stage, singleTouch: scala.Boolean): scala.Boolean = js.native
  def enable(stage: easeljsLib.createjsNs.Stage, singleTouch: scala.Boolean, allowDefault: scala.Boolean): scala.Boolean = js.native
  def isSupported(): scala.Boolean = js.native
}

