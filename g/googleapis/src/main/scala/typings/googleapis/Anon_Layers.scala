package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Layers extends js.Object {
  var layers: js.UndefOr[js.Array[Anon_LayerId]] = js.native
}

object Anon_Layers {
  @scala.inline
  def apply(layers: js.Array[Anon_LayerId] = null): Anon_Layers = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Layers]
  }
}

