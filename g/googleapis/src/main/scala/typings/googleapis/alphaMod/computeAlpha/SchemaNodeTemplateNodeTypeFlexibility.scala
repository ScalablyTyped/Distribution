package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTemplateNodeTypeFlexibility extends js.Object {
  var cpus: js.UndefOr[String] = js.native
  var localSsd: js.UndefOr[String] = js.native
  var memory: js.UndefOr[String] = js.native
}

object SchemaNodeTemplateNodeTypeFlexibility {
  @scala.inline
  def apply(cpus: String = null, localSsd: String = null, memory: String = null): SchemaNodeTemplateNodeTypeFlexibility = {
    val __obj = js.Dynamic.literal()
    if (cpus != null) __obj.updateDynamic("cpus")(cpus.asInstanceOf[js.Any])
    if (localSsd != null) __obj.updateDynamic("localSsd")(localSsd.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeTemplateNodeTypeFlexibility]
  }
}

