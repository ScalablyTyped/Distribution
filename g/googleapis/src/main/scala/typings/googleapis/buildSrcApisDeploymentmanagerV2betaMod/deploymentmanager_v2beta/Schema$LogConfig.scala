package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies what kind of log the caller must write
  */
@js.native
trait Schema$LogConfig extends js.Object {
  /**
    * Cloud audit options.
    */
  var cloudAudit: js.UndefOr[Schema$LogConfigCloudAuditOptions] = js.native
  /**
    * Counter options.
    */
  var counter: js.UndefOr[Schema$LogConfigCounterOptions] = js.native
  /**
    * Data access options.
    */
  var dataAccess: js.UndefOr[Schema$LogConfigDataAccessOptions] = js.native
}

object Schema$LogConfig {
  @scala.inline
  def apply(
    cloudAudit: Schema$LogConfigCloudAuditOptions = null,
    counter: Schema$LogConfigCounterOptions = null,
    dataAccess: Schema$LogConfigDataAccessOptions = null
  ): Schema$LogConfig = {
    val __obj = js.Dynamic.literal()
    if (cloudAudit != null) __obj.updateDynamic("cloudAudit")(cloudAudit.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (dataAccess != null) __obj.updateDynamic("dataAccess")(dataAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LogConfig]
  }
}

