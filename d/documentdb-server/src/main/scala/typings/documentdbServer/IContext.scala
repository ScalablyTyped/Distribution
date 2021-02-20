package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContext extends StObject {
  
  /** Gets the collection object. */
  def getCollection(): ICollection = js.native
  
  /** Gets the request object. */
  def getRequest(): IRequest = js.native
  
  /**
    * Gets the response object.
    * Note: this is not available in pre-triggers.
    */
  def getResponse(): IResponse = js.native
}
object IContext {
  
  @scala.inline
  def apply(getCollection: () => ICollection, getRequest: () => IRequest, getResponse: () => IResponse): IContext = {
    val __obj = js.Dynamic.literal(getCollection = js.Any.fromFunction0(getCollection), getRequest = js.Any.fromFunction0(getRequest), getResponse = js.Any.fromFunction0(getResponse))
    __obj.asInstanceOf[IContext]
  }
  
  @scala.inline
  implicit class IContextMutableBuilder[Self <: IContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCollection(value: () => ICollection): Self = StObject.set(x, "getCollection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequest(value: () => IRequest): Self = StObject.set(x, "getRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponse(value: () => IResponse): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
  }
}
