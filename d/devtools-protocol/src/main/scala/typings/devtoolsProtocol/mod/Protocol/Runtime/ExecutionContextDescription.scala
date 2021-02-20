package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionContextDescription extends StObject {
  
  /**
    * Embedder-specific auxiliary data.
    */
  var auxData: js.UndefOr[js.Any] = js.native
  
  /**
    * Unique id of the execution context. It can be used to specify in which execution context
    * script evaluation should be performed.
    */
  var id: ExecutionContextId = js.native
  
  /**
    * Human readable name describing given context.
    */
  var name: String = js.native
  
  /**
    * Execution context origin.
    */
  var origin: String = js.native
}
object ExecutionContextDescription {
  
  @scala.inline
  def apply(id: ExecutionContextId, name: String, origin: String): ExecutionContextDescription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDescription]
  }
  
  @scala.inline
  implicit class ExecutionContextDescriptionMutableBuilder[Self <: ExecutionContextDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuxData(value: js.Any): Self = StObject.set(x, "auxData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxDataUndefined: Self = StObject.set(x, "auxData", js.undefined)
    
    @scala.inline
    def setId(value: ExecutionContextId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
