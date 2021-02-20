package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the delay introduced by Loadbalancer before forwarding the
  * request to the backend service as part of fault injection.
  */
@js.native
trait SchemaHttpFaultDelay extends StObject {
  
  /**
    * Specifies the value of the fixed delay interval.
    */
  var fixedDelay: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * The percentage of traffic (connections/operations/requests) on which
    * delay will be introduced as part of fault injection. The value must be
    * between 0.0 and 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}
object SchemaHttpFaultDelay {
  
  @scala.inline
  def apply(): SchemaHttpFaultDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultDelay]
  }
  
  @scala.inline
  implicit class SchemaHttpFaultDelayMutableBuilder[Self <: SchemaHttpFaultDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedDelay(value: SchemaDuration): Self = StObject.set(x, "fixedDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedDelayUndefined: Self = StObject.set(x, "fixedDelay", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
