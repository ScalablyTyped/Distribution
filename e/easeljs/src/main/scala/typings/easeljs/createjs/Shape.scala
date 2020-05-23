package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends DisplayObject {
  // properties
  var graphics: Graphics = js.native
  def clone(recursive: Boolean): Shape = js.native
}

