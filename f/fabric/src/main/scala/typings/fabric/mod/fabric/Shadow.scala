package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IShadowOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Shadow")
@js.native
class Shadow ()
  extends typings.fabric.fabricImplMod.Shadow {
  def this(options: String) = this()
  def this(options: IShadowOptions) = this()
}
/* static members */
object Shadow {
  
  @JSImport("fabric", "fabric.Shadow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
    * @static
    * @field
    * @memberOf fabric.Shadow
    */
  @JSImport("fabric", "fabric.Shadow.reOffsetsAndBlur")
  @js.native
  def reOffsetsAndBlur: RegExp = js.native
  @scala.inline
  def reOffsetsAndBlur_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reOffsetsAndBlur")(x.asInstanceOf[js.Any])
}
