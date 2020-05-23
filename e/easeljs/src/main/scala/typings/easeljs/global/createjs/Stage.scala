package typings.easeljs.global.createjs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Stage")
@js.native
class Stage protected ()
  extends typings.easeljs.createjs.Stage {
  def this(canvas: String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: HTMLCanvasElement) = this()
}

