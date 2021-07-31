package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFrame extends StObject {
  
  /**
    * Call frame identifier. This identifier is only valid while the virtual machine is paused.
    */
  var callFrameId: CallFrameId
  
  /**
    * Location in the source code.
    */
  var functionLocation: js.UndefOr[Location] = js.undefined
  
  /**
    * Name of the JavaScript function called on this call frame.
    */
  var functionName: String
  
  /**
    * Location in the source code.
    */
  var location: Location
  
  /**
    * The value being returned, if the function is at return point.
    */
  var returnValue: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * Scope chain for this call frame.
    */
  var scopeChain: js.Array[Scope]
  
  /**
    * `this` object for this call frame.
    */
  var `this`: RemoteObject
  
  /**
    * JavaScript script name or url.
    */
  var url: String
}
object CallFrame {
  
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    functionName: String,
    location: Location,
    scopeChain: js.Array[Scope],
    `this`: RemoteObject,
    url: String
  ): CallFrame = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], scopeChain = scopeChain.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFrame]
  }
  
  @scala.inline
  implicit class CallFrameMutableBuilder[Self <: CallFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionLocation(value: Location): Self = StObject.set(x, "functionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionLocationUndefined: Self = StObject.set(x, "functionLocation", js.undefined)
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: RemoteObject): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
    
    @scala.inline
    def setScopeChain(value: js.Array[Scope]): Self = StObject.set(x, "scopeChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeChainVarargs(value: Scope*): Self = StObject.set(x, "scopeChain", js.Array(value :_*))
    
    @scala.inline
    def setThis(value: RemoteObject): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
