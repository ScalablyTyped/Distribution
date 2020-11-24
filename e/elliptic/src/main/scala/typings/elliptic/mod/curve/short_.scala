package typings.elliptic.mod.curve

import typings.elliptic.mod.BNInput
import typings.elliptic.mod.curve.short.ShortConf
import typings.elliptic.mod.curve.short.ShortPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
