package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioParam extends js.Object {
  
  var contextId: GraphObjectId = js.native
  
  var defaultValue: Double = js.native
  
  var maxValue: Double = js.native
  
  var minValue: Double = js.native
  
  var nodeId: GraphObjectId = js.native
  
  var paramId: GraphObjectId = js.native
  
  var paramType: ParamType = js.native
  
  var rate: AutomationRate = js.native
}
object AudioParam {
  
  @scala.inline
  def apply(
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
  implicit class AudioParamOps[Self <: AudioParam] (val x: Self) extends AnyVal {
    
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
    def setContextId(value: GraphObjectId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: GraphObjectId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamId(value: GraphObjectId): Self = this.set("paramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamType(value: ParamType): Self = this.set("paramType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRate(value: AutomationRate): Self = this.set("rate", value.asInstanceOf[js.Any])
  }
}
