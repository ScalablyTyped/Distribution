package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow extends StObject {
  
  /**
    * Output only. Columns/entries/key-vals in the result.
    */
  var fieldValues: js.UndefOr[js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal]] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow](x: Self) {
    
    inline def setFieldValues(value: js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal]): Self = StObject.set(x, "fieldValues", value.asInstanceOf[js.Any])
    
    inline def setFieldValuesUndefined: Self = StObject.set(x, "fieldValues", js.undefined)
    
    inline def setFieldValuesVarargs(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal*): Self = StObject.set(x, "fieldValues", js.Array(value*))
  }
}
