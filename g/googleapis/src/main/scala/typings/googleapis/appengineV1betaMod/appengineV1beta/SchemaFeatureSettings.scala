package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The feature specific settings to be used in the application. These define
  * behaviors that are user configurable.
  */
@js.native
trait SchemaFeatureSettings extends js.Object {
  
  /**
    * Boolean value indicating if split health checks should be used instead of
    * the legacy health checks. At an app.yaml level, this means defaulting to
    * &#39;readiness_check&#39; and &#39;liveness_check&#39; values instead of
    * &#39;health_check&#39; ones. Once the legacy &#39;health_check&#39;
    * behavior is deprecated, and this value is always true, this setting can
    * be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, use Container-Optimized OS
    * (https://cloud.google.com/container-optimized-os/) base image for VMs,
    * rather than a base Debian image.
    */
  var useContainerOptimizedOs: js.UndefOr[Boolean] = js.native
}
object SchemaFeatureSettings {
  
  @scala.inline
  def apply(): SchemaFeatureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureSettings]
  }
  
  @scala.inline
  implicit class SchemaFeatureSettingsOps[Self <: SchemaFeatureSettings] (val x: Self) extends AnyVal {
    
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
    def setSplitHealthChecks(value: Boolean): Self = this.set("splitHealthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitHealthChecks: Self = this.set("splitHealthChecks", js.undefined)
    
    @scala.inline
    def setUseContainerOptimizedOs(value: Boolean): Self = this.set("useContainerOptimizedOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContainerOptimizedOs: Self = this.set("useContainerOptimizedOs", js.undefined)
  }
}
