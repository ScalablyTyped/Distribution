package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to add a newly created and configured tenant project to a tenancy
  * unit.
  */
@js.native
trait Schema$AddTenantProjectRequest extends js.Object {
  /**
    * Configuration of the new tenant project to be added to tenancy unit
    * resources.
    */
  var projectConfig: js.UndefOr[Schema$TenantProjectConfig] = js.native
  /**
    * Tag of the added project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$AddTenantProjectRequest {
  @scala.inline
  def apply(projectConfig: Schema$TenantProjectConfig = null, tag: String = null): Schema$AddTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (projectConfig != null) __obj.updateDynamic("projectConfig")(projectConfig.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddTenantProjectRequest]
  }
}

