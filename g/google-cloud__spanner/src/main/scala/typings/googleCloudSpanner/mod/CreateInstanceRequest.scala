package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceRequest extends StObject {
  
  var config: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var nodes: js.UndefOr[Double] = js.undefined
  
  var processingUnits: js.UndefOr[Double] = js.undefined
}
object CreateInstanceRequest {
  
  inline def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
    
    inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setProcessingUnits(value: Double): Self = StObject.set(x, "processingUnits", value.asInstanceOf[js.Any])
    
    inline def setProcessingUnitsUndefined: Self = StObject.set(x, "processingUnits", js.undefined)
  }
}
