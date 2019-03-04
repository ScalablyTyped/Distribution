package typings
package documentdbDashServerLib

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
  def apply(
    getCollection: js.Function0[ICollection],
    getRequest: js.Function0[IRequest],
    getResponse: js.Function0[IResponse]
  ): IContext = {
    val __obj = js.Dynamic.literal(getCollection = getCollection, getRequest = getRequest, getResponse = getResponse)
  
    __obj.asInstanceOf[IContext]
  }
}

