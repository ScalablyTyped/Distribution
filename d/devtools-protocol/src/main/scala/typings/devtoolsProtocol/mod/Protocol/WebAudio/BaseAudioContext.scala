package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAudioContext extends StObject {
  
  /**
    * Platform-dependent callback buffer size.
    */
  var callbackBufferSize: Double
  
  var contextId: GraphObjectId
  
  var contextState: ContextState
  
  var contextType: ContextType
  
  /**
    * Number of output channels supported by audio hardware in use.
    */
  var maxOutputChannelCount: Double
  
  var realtimeData: js.UndefOr[ContextRealtimeData] = js.undefined
  
  /**
    * Context sample rate.
    */
  var sampleRate: Double
}
object BaseAudioContext {
  
  @scala.inline
  def apply(
    callbackBufferSize: Double,
    contextId: GraphObjectId,
    contextState: ContextState,
    contextType: ContextType,
    maxOutputChannelCount: Double,
    sampleRate: Double
  ): BaseAudioContext = {
    val __obj = js.Dynamic.literal(callbackBufferSize = callbackBufferSize.asInstanceOf[js.Any], contextId = contextId.asInstanceOf[js.Any], contextState = contextState.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], maxOutputChannelCount = maxOutputChannelCount.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAudioContext]
  }
  
  @scala.inline
  implicit class BaseAudioContextMutableBuilder[Self <: BaseAudioContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackBufferSize(value: Double): Self = StObject.set(x, "callbackBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextState(value: ContextState): Self = StObject.set(x, "contextState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextType(value: ContextType): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutputChannelCount(value: Double): Self = StObject.set(x, "maxOutputChannelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeData(value: ContextRealtimeData): Self = StObject.set(x, "realtimeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeDataUndefined: Self = StObject.set(x, "realtimeData", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
