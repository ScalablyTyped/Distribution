package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioParam extends StObject {
  
  var contextId: GraphObjectId
  
  var defaultValue: Double
  
  var maxValue: Double
  
  var minValue: Double
  
  var nodeId: GraphObjectId
  
  var paramId: GraphObjectId
  
  var paramType: ParamType
  
  var rate: AutomationRate
}
object AudioParam {
  
  inline def apply(
    contextId: GraphObjectId,
    defaultValue: Double,
    maxValue: Double,
    minValue: Double,
    nodeId: GraphObjectId,
    paramId: GraphObjectId,
    paramType: ParamType,
    rate: AutomationRate
  ): AudioParam = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], paramId = paramId.asInstanceOf[js.Any], paramType = paramType.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioParam] (val x: Self) extends AnyVal {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: GraphObjectId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setParamId(value: GraphObjectId): Self = StObject.set(x, "paramId", value.asInstanceOf[js.Any])
    
    inline def setParamType(value: ParamType): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
    
    inline def setRate(value: AutomationRate): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
