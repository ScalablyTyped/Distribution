package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.BlurFilter")
@js.native
class BlurFilter () extends Filter {
  def this(blurX: Double) = this()
  def this(blurX: Double, blurY: Double) = this()
  def this(blurX: Double, blurY: Double, quality: Double) = this()
  // properties
  var blurX: Double = js.native
  var blurY: Double = js.native
  var quality: Double = js.native
}

