package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllocationAffinity is the configuration of desired allocation which this
  * instance could take capacity from.
  */
@js.native
trait SchemaReservationAffinity extends StObject {
  
  var consumeReservationType: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the label key of reservation resource.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the label values of reservation resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaReservationAffinity {
  
  @scala.inline
  def apply(): SchemaReservationAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationAffinity]
  }
  
  @scala.inline
  implicit class SchemaReservationAffinityMutableBuilder[Self <: SchemaReservationAffinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumeReservationType(value: String): Self = StObject.set(x, "consumeReservationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumeReservationTypeUndefined: Self = StObject.set(x, "consumeReservationType", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
