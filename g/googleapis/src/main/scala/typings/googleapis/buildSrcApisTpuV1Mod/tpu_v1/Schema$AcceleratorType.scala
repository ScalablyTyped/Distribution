package typings.googleapis.buildSrcApisTpuV1Mod.tpu_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A accelerator type that a Node can be configured with.
  */
@js.native
trait Schema$AcceleratorType extends js.Object {
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the accelerator type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$AcceleratorType {
  @scala.inline
  def apply(name: String = null, `type`: String = null): Schema$AcceleratorType = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcceleratorType]
  }
}

