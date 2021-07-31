package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message of customer&#39;s listing DPCs.
  */
trait SchemaCustomerListDpcsResponse extends StObject {
  
  /**
    * The list of DPCs available to the customer that support zero-touch
    * enrollment.
    */
  var dpcs: js.UndefOr[js.Array[SchemaDpc]] = js.undefined
}
object SchemaCustomerListDpcsResponse {
  
  @scala.inline
  def apply(): SchemaCustomerListDpcsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListDpcsResponse]
  }
  
  @scala.inline
  implicit class SchemaCustomerListDpcsResponseMutableBuilder[Self <: SchemaCustomerListDpcsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpcs(value: js.Array[SchemaDpc]): Self = StObject.set(x, "dpcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpcsUndefined: Self = StObject.set(x, "dpcs", js.undefined)
    
    @scala.inline
    def setDpcsVarargs(value: SchemaDpc*): Self = StObject.set(x, "dpcs", js.Array(value :_*))
  }
}
