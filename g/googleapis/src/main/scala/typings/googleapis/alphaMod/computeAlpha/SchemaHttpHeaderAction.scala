package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request and response header transformations that take effect before the
  * request is passed along to the selected backendService.
  */
@js.native
trait SchemaHttpHeaderAction extends StObject {
  
  /**
    * Headers to add to a matching request prior to forwarding the request to
    * the backendService.
    */
  var requestHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.native
  
  /**
    * A list of header names for headers that need to be removed from the
    * request prior to forwarding the request to the backendService.
    */
  var requestHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Headers to add the response prior to sending the response back to the
    * client.
    */
  var responseHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.native
  
  /**
    * A list of header names for headers that need to be removed from the
    * response prior to sending the response back to the client.
    */
  var responseHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
}
object SchemaHttpHeaderAction {
  
  @scala.inline
  def apply(): SchemaHttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderAction]
  }
  
  @scala.inline
  implicit class SchemaHttpHeaderActionMutableBuilder[Self <: SchemaHttpHeaderAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestHeadersToAdd(value: js.Array[SchemaHttpHeaderOption]): Self = StObject.set(x, "requestHeadersToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersToAddUndefined: Self = StObject.set(x, "requestHeadersToAdd", js.undefined)
    
    @scala.inline
    def setRequestHeadersToAddVarargs(value: SchemaHttpHeaderOption*): Self = StObject.set(x, "requestHeadersToAdd", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeadersToRemove(value: js.Array[String]): Self = StObject.set(x, "requestHeadersToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersToRemoveUndefined: Self = StObject.set(x, "requestHeadersToRemove", js.undefined)
    
    @scala.inline
    def setRequestHeadersToRemoveVarargs(value: String*): Self = StObject.set(x, "requestHeadersToRemove", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeadersToAdd(value: js.Array[SchemaHttpHeaderOption]): Self = StObject.set(x, "responseHeadersToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersToAddUndefined: Self = StObject.set(x, "responseHeadersToAdd", js.undefined)
    
    @scala.inline
    def setResponseHeadersToAddVarargs(value: SchemaHttpHeaderOption*): Self = StObject.set(x, "responseHeadersToAdd", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeadersToRemove(value: js.Array[String]): Self = StObject.set(x, "responseHeadersToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersToRemoveUndefined: Self = StObject.set(x, "responseHeadersToRemove", js.undefined)
    
    @scala.inline
    def setResponseHeadersToRemoveVarargs(value: String*): Self = StObject.set(x, "responseHeadersToRemove", js.Array(value :_*))
  }
}
