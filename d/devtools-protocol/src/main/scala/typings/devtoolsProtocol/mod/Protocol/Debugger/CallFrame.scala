package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFrame extends js.Object {
  
  /**
    * Call frame identifier. This identifier is only valid while the virtual machine is paused.
    */
  var callFrameId: CallFrameId = js.native
  
  /**
    * Location in the source code.
    */
  var functionLocation: js.UndefOr[Location] = js.native
  
  /**
    * Name of the JavaScript function called on this call frame.
    */
  var functionName: String = js.native
  
  /**
    * Location in the source code.
    */
  var location: Location = js.native
  
  /**
    * The value being returned, if the function is at return point.
    */
  var returnValue: js.UndefOr[RemoteObject] = js.native
  
  /**
    * Scope chain for this call frame.
    */
  var scopeChain: js.Array[Scope] = js.native
  
  /**
    * `this` object for this call frame.
    */
  var `this`: RemoteObject = js.native
  
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
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
  implicit class CallFrameOps[Self <: CallFrame] (val x: Self) extends AnyVal {
    
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
    def setCallFrameId(value: CallFrameId): Self = this.set("callFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeChainVarargs(value: Scope*): Self = this.set("scopeChain", js.Array(value :_*))
    
    @scala.inline
    def setScopeChain(value: js.Array[Scope]): Self = this.set("scopeChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThis(value: RemoteObject): Self = this.set("this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionLocation(value: Location): Self = this.set("functionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionLocation: Self = this.set("functionLocation", js.undefined)
    
    @scala.inline
    def setReturnValue(value: RemoteObject): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("returnValue", js.undefined)
  }
}
