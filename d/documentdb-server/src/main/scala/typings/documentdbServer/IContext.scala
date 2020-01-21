package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContext extends js.Object {
  /** Gets the collection object. */
  def getCollection(): ICollection
  /** Gets the request object. */
  def getRequest(): IRequest
  /**
    * Gets the response object.
    * Note: this is not available in pre-triggers.
    */
  def getResponse(): IResponse
}

object IContext {
  @scala.inline
  def apply(getCollection: () => ICollection, getRequest: () => IRequest, getResponse: () => IResponse): IContext = {
    val __obj = js.Dynamic.literal(getCollection = js.Any.fromFunction0(getCollection), getRequest = js.Any.fromFunction0(getRequest), getResponse = js.Any.fromFunction0(getResponse))
  
    __obj.asInstanceOf[IContext]
  }
}

