package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to apply configuration to an existing tenant project.
  */
@js.native
trait Schema$ApplyTenantProjectConfigRequest extends js.Object {
  /**
    * Configuration that should be applied to the existing tenant project.
    */
  var projectConfig: js.UndefOr[Schema$TenantProjectConfig] = js.native
  /**
    * Tag of the project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$ApplyTenantProjectConfigRequest {
  @scala.inline
  def apply(projectConfig: Schema$TenantProjectConfig = null, tag: String = null): Schema$ApplyTenantProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (projectConfig != null) __obj.updateDynamic("projectConfig")(projectConfig.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplyTenantProjectConfigRequest]
  }
}

