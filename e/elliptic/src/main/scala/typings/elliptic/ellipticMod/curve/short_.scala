package typings.elliptic.ellipticMod.curve

import typings.elliptic.ellipticMod.BNInput
import typings.elliptic.ellipticMod.curve.short.ShortConf
import typings.elliptic.ellipticMod.curve.short.ShortPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve.short")
@js.native
class short_ protected () extends base {
  def this(conf: ShortConf) = this()
  var a: BNInput = js.native
  var b: BNInput = js.native
  @JSName("g")
  var g_short_ : ShortPoint = js.native
  def point(x: BNInput, y: BNInput): ShortPoint = js.native
  def point(x: BNInput, y: BNInput, isRed: Boolean): ShortPoint = js.native
  def pointFromJSON(obj: js.Array[BNInput], red: Boolean): ShortPoint = js.native
  def pointFromX(x: BNInput): ShortPoint = js.native
  def pointFromX(x: BNInput, odd: Boolean): ShortPoint = js.native
}

