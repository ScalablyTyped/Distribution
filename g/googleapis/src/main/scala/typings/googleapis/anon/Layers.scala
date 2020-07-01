package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layers extends js.Object {
  var layers: js.UndefOr[js.Array[VolumeAnnotationsVersion]] = js.native
}

object Layers {
  @scala.inline
  def apply(layers: js.Array[VolumeAnnotationsVersion] = null): Layers = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layers]
  }
}

