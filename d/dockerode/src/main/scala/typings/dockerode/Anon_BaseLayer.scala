package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseLayer extends js.Object {
  var BaseLayer: js.UndefOr[String] = js.undefined
  var Layers: js.UndefOr[js.Array[String]] = js.undefined
  var Type: String
}

object Anon_BaseLayer {
  @scala.inline
  def apply(Type: String, BaseLayer: String = null, Layers: js.Array[String] = null): Anon_BaseLayer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (BaseLayer != null) __obj.updateDynamic("BaseLayer")(BaseLayer.asInstanceOf[js.Any])
    if (Layers != null) __obj.updateDynamic("Layers")(Layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BaseLayer]
  }
}

