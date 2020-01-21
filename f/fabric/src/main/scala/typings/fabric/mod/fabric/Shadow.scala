package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IShadowOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Shadow")
@js.native
class Shadow ()
  extends typings.fabric.fabricImplMod.Shadow {
  def this(options: String) = this()
  def this(options: IShadowOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Shadow")
@js.native
object Shadow extends js.Object {
  /**
  	 * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
  	 * @static
  	 * @field
  	 * @memberOf fabric.Shadow
  	 */
  var reOffsetsAndBlur: RegExp = js.native
}

