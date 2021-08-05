package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesSetLabelsRequest extends StObject {
  
  /**
    * Fingerprint of the previous set of labels for this resource, used to
    * prevent conflicts. Provide the latest fingerprint value when making a
    * request to add or change labels.
    */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaInstancesSetLabelsRequest {
  
  inline def apply(): SchemaInstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetLabelsRequest]
  }
  
  extension [Self <: SchemaInstancesSetLabelsRequest](x: Self) {
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
