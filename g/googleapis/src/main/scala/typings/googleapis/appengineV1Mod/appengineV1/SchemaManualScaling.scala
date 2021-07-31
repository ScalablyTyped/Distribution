package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service with manual scaling runs continuously, allowing you to perform
  * complex initialization and rely on the state of its memory over time.
  */
trait SchemaManualScaling extends StObject {
  
  /**
    * Number of instances to assign to the service at the start. This number
    * can later be altered by using the Modules API
    * (https://cloud.google.com/appengine/docs/python/modules/functions)
    * set_num_instances() function.
    */
  var instances: js.UndefOr[Double] = js.undefined
}
object SchemaManualScaling {
  
  @scala.inline
  def apply(): SchemaManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualScaling]
  }
  
  @scala.inline
  implicit class SchemaManualScalingMutableBuilder[Self <: SchemaManualScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Double): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
  }
}
