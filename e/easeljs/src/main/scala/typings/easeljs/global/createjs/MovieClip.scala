package typings.easeljs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MovieClip")
@js.native
class MovieClip ()
  extends typings.easeljs.createjs.MovieClip {
  def this(mode: String) = this()
  def this(mode: String, startPosition: Double) = this()
  def this(mode: String, startPosition: Double, loop: Boolean) = this()
  def this(mode: String, startPosition: Double, loop: Boolean, labels: js.Object) = this()
}

/* static members */
@JSGlobal("createjs.MovieClip")
@js.native
object MovieClip extends js.Object {
  var INDEPENDENT: String = js.native
  var SINGLE_FRAME: String = js.native
  var SYNCHED: String = js.native
  var buildDate: String = js.native
  var version: String = js.native
}

