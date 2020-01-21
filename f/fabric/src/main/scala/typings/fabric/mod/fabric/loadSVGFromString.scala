package typings.fabric.mod.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.loadSVGFromString")
@js.native
object loadSVGFromString extends js.Object {
  def apply(
    string: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    string: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.Function
  ): Unit = js.native
}

