package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layers extends js.Object {
  /** A layer should appear here if and only if the layer exists for this book. */
  var layers: js.UndefOr[js.Array[Anon_LayerId]] = js.undefined
}

object Anon_Layers {
  @scala.inline
  def apply(layers: js.Array[Anon_LayerId] = null): Anon_Layers = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[Anon_Layers]
  }
}

