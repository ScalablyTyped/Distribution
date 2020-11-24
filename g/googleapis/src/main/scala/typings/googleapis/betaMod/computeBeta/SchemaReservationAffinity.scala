package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllocationAffinity is the configuration of desired allocation which this
  * instance could take capacity from.
  */
@js.native
trait SchemaReservationAffinity extends js.Object {
  
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
  implicit class SchemaReservationAffinityOps[Self <: SchemaReservationAffinity] (val x: Self) extends AnyVal {
    
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
    def setConsumeReservationType(value: String): Self = this.set("consumeReservationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumeReservationType: Self = this.set("consumeReservationType", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
