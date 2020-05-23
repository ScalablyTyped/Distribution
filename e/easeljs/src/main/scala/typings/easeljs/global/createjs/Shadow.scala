package typings.easeljs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Shadow")
@js.native
class Shadow protected ()
  extends typings.easeljs.createjs.Shadow {
  def this(color: String, offsetX: Double, offsetY: Double, blur: Double) = this()
  // properties
  /* CompleteClass */
  override var blur: Double = js.native
  /* CompleteClass */
  override var color: String = js.native
  /* CompleteClass */
  override var offsetX: Double = js.native
  /* CompleteClass */
  override var offsetY: Double = js.native
}

/* static members */
@JSGlobal("createjs.Shadow")
@js.native
object Shadow extends js.Object {
  var identity: typings.easeljs.createjs.Shadow = js.native
}

