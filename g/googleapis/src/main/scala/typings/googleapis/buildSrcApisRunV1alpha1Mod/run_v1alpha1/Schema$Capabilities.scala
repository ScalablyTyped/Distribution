package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds and removes POSIX capabilities from running containers.
  */
@js.native
trait Schema$Capabilities extends js.Object {
  /**
    * Added capabilities +optional
    */
  var add: js.UndefOr[js.Array[String]] = js.native
  /**
    * Removed capabilities +optional
    */
  var drop: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Capabilities {
  @scala.inline
  def apply(add: js.Array[String] = null, drop: js.Array[String] = null): Schema$Capabilities = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Capabilities]
  }
}

