package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a hardware accelerator request config.
  */
@js.native
trait Schema$GoogleCloudMlV1__AcceleratorConfig extends js.Object {
  /**
    * The number of accelerators to attach to each machine running the job.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The type of accelerator to use.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__AcceleratorConfig {
  @scala.inline
  def apply(count: String = null, `type`: String = null): Schema$GoogleCloudMlV1__AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__AcceleratorConfig]
  }
}

