package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service with basic scaling will create an instance when the application
  * receives a request. The instance will be turned down when the app becomes
  * idle. Basic scaling is ideal for work that is intermittent or driven by
  * user activity.
  */
trait SchemaBasicScaling extends StObject {
  
  /**
    * Duration of time after the last request that an instance must wait before
    * the instance is shut down.
    */
  var idleTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of instances to create for this version.
    */
  var maxInstances: js.UndefOr[Double] = js.undefined
}
object SchemaBasicScaling {
  
  @scala.inline
  def apply(): SchemaBasicScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicScaling]
  }
  
  @scala.inline
  implicit class SchemaBasicScalingMutableBuilder[Self <: SchemaBasicScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdleTimeout(value: String): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
  }
}
