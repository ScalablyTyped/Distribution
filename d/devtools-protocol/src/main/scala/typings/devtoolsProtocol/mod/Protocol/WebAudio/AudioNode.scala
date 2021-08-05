package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNode extends StObject {
  
  var channelCount: Double
  
  var channelCountMode: ChannelCountMode
  
  var channelInterpretation: ChannelInterpretation
  
  var contextId: GraphObjectId
  
  var nodeId: GraphObjectId
  
  var nodeType: NodeType
  
  var numberOfInputs: Double
  
  var numberOfOutputs: Double
}
object AudioNode {
  
  inline def apply(
    channelCount: Double,
    channelCountMode: ChannelCountMode,
    channelInterpretation: ChannelInterpretation,
    contextId: GraphObjectId,
    nodeId: GraphObjectId,
    nodeType: NodeType,
    numberOfInputs: Double,
    numberOfOutputs: Double
  ): AudioNode = {
    val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelCountMode = channelCountMode.asInstanceOf[js.Any], channelInterpretation = channelInterpretation.asInstanceOf[js.Any], contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], numberOfInputs = numberOfInputs.asInstanceOf[js.Any], numberOfOutputs = numberOfOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNode]
  }
  
  extension [Self <: AudioNode](x: Self) {
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountMode(value: ChannelCountMode): Self = StObject.set(x, "channelCountMode", value.asInstanceOf[js.Any])
    
    inline def setChannelInterpretation(value: ChannelInterpretation): Self = StObject.set(x, "channelInterpretation", value.asInstanceOf[js.Any])
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: GraphObjectId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: NodeType): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInputs(value: Double): Self = StObject.set(x, "numberOfInputs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfOutputs(value: Double): Self = StObject.set(x, "numberOfOutputs", value.asInstanceOf[js.Any])
  }
}
