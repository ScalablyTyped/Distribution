package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of the HTTP bridge for a device registry.
  */
@js.native
trait SchemaHttpConfig extends js.Object {
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String] = js.native
}

object SchemaHttpConfig {
  @scala.inline
  def apply(): SchemaHttpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpConfig]
  }
  @scala.inline
  implicit class SchemaHttpConfigOps[Self <: SchemaHttpConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHttpEnabledState(value: String): Self = this.set("httpEnabledState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEnabledState: Self = this.set("httpEnabledState", js.undefined)
  }
  
}

