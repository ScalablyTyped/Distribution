package typings.gifwrap.mod

import typings.gifwrap.gifwrapNumbers.`0`
import typings.gifwrap.gifwrapNumbers.`1`
import typings.gifwrap.gifwrapNumbers.`2`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gifwrap", "Gif")
@js.native
class Gif protected () extends GifSpec {
  def this(frames: js.Array[GifFrame], buffer: Buffer) = this()
  def this(frames: js.Array[GifFrame], buffer: Buffer, spec: GifSpec) = this()
  
  var buffer: Buffer = js.native
  
  @JSName("colorScope")
  var colorScope_Gif: `0` | `1` | `2` = js.native
  
  var frames: js.Array[GifFrame] = js.native
  
  var height: Double = js.native
  
  @JSName("loops")
  var loops_Gif: Double = js.native
  
  var usesTransparency: Boolean = js.native
  
  var width: Double = js.native
}
/* static members */
@JSImport("gifwrap", "Gif")
@js.native
object Gif extends js.Object {
  
  val GlobalColorsOnly: `1` = js.native
  
  val GlobalColorsPreferred: `0` = js.native
  
  val LocalColorsOnly: `2` = js.native
}
