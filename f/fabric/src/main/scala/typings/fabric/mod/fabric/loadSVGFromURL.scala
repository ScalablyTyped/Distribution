package typings.fabric.mod.fabric

import typings.fabric.anon.CrossOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.loadSVGFromURL")
@js.native
object loadSVGFromURL extends js.Object {
  def apply(
    url: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    url: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.UndefOr[scala.Nothing],
    options: CrossOrigin
  ): Unit = js.native
  def apply(
    url: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.Function
  ): Unit = js.native
  def apply(
    url: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.Function,
    options: CrossOrigin
  ): Unit = js.native
}

