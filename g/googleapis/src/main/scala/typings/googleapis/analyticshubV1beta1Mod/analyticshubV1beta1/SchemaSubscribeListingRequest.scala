package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscribeListingRequest extends StObject {
  
  /**
    * BigQuery destination dataset to create for the subscriber.
    */
  var destinationDataset: js.UndefOr[SchemaDestinationDataset] = js.undefined
}
object SchemaSubscribeListingRequest {
  
  inline def apply(): SchemaSubscribeListingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscribeListingRequest]
  }
  
  extension [Self <: SchemaSubscribeListingRequest](x: Self) {
    
    inline def setDestinationDataset(value: SchemaDestinationDataset): Self = StObject.set(x, "destinationDataset", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatasetUndefined: Self = StObject.set(x, "destinationDataset", js.undefined)
  }
}
