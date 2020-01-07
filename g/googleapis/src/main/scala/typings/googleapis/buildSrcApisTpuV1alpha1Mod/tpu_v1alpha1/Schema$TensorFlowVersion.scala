package typings.googleapis.buildSrcApisTpuV1alpha1Mod.tpu_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tensorflow version that a Node can be configured with.
  */
@js.native
trait Schema$TensorFlowVersion extends js.Object {
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the tensorflow version.
    */
  var version: js.UndefOr[String] = js.native
}

object Schema$TensorFlowVersion {
  @scala.inline
  def apply(name: String = null, version: String = null): Schema$TensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TensorFlowVersion]
  }
}

