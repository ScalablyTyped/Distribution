package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service with basic scaling will create an instance when the application
  * receives a request. The instance will be turned down when the app becomes
  * idle. Basic scaling is ideal for work that is intermittent or driven by
  * user activity.
  */
@js.native
trait SchemaBasicScaling extends js.Object {
  
  /**
    * Duration of time after the last request that an instance must wait before
    * the instance is shut down.
    */
  var idleTimeout: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of instances to create for this version.
    */
  var maxInstances: js.UndefOr[Double] = js.native
}
object SchemaBasicScaling {
  
  @scala.inline
  def apply(): SchemaBasicScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicScaling]
  }
  
  @scala.inline
  implicit class SchemaBasicScalingOps[Self <: SchemaBasicScaling] (val x: Self) extends AnyVal {
    
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
    def setIdleTimeout(value: String): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
  }
}
