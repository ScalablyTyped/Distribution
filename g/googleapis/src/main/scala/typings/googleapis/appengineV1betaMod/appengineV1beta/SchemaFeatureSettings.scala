package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The feature specific settings to be used in the application. These define
  * behaviors that are user configurable.
  */
trait SchemaFeatureSettings extends StObject {
  
  /**
    * Boolean value indicating if split health checks should be used instead of
    * the legacy health checks. At an app.yaml level, this means defaulting to
    * &#39;readiness_check&#39; and &#39;liveness_check&#39; values instead of
    * &#39;health_check&#39; ones. Once the legacy &#39;health_check&#39;
    * behavior is deprecated, and this value is always true, this setting can
    * be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, use Container-Optimized OS
    * (https://cloud.google.com/container-optimized-os/) base image for VMs,
    * rather than a base Debian image.
    */
  var useContainerOptimizedOs: js.UndefOr[Boolean] = js.undefined
}
object SchemaFeatureSettings {
  
  inline def apply(): SchemaFeatureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureSettings]
  }
  
  extension [Self <: SchemaFeatureSettings](x: Self) {
    
    inline def setSplitHealthChecks(value: Boolean): Self = StObject.set(x, "splitHealthChecks", value.asInstanceOf[js.Any])
    
    inline def setSplitHealthChecksUndefined: Self = StObject.set(x, "splitHealthChecks", js.undefined)
    
    inline def setUseContainerOptimizedOs(value: Boolean): Self = StObject.set(x, "useContainerOptimizedOs", value.asInstanceOf[js.Any])
    
    inline def setUseContainerOptimizedOsUndefined: Self = StObject.set(x, "useContainerOptimizedOs", js.undefined)
  }
}
