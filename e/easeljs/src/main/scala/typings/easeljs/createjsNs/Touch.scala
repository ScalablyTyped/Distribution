package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Touch")
@js.native
class Touch () extends js.Object

/* static members */
@JSGlobal("createjs.Touch")
@js.native
object Touch extends js.Object {
  // methods
  def disable(stage: Stage): Unit = js.native
  def enable(stage: Stage): Boolean = js.native
  def enable(stage: Stage, singleTouch: Boolean): Boolean = js.native
  def enable(stage: Stage, singleTouch: Boolean, allowDefault: Boolean): Boolean = js.native
  def isSupported(): Boolean = js.native
}

