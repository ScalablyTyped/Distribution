package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Request object represents the request message that was sent to the server. This includes information about HTTP headers and the body of the HTTP request sent to the server.
  * For triggers, the request represents the operation that is executing when the trigger is run. For example, if the trigger is being run ("triggered") on the creation of a document, then
  * the request body contains the JSON body of the document to be created. This can be accessed through the request object and (as JSON) can be natively consumed in JavaScript.
  * For stored procedures, the request contains information about the request sent to execute the stored procedure.
  */
@js.native
trait IRequest extends js.Object {
  /**
  	 * Gets the request body.
  	 */
  def getBody(): js.Object = js.native
  @JSName("getBody")
  def getBody_TT[T](): T = js.native
  /**
    * Gets the OperationType for the request with a pre-trigger or post-trigger.
    */
  def getOperationType(): documentdbDashServerLib.documentdbDashServerLibStrings.Create | documentdbDashServerLib.documentdbDashServerLibStrings.Replace | documentdbDashServerLib.documentdbDashServerLibStrings.Upsert | documentdbDashServerLib.documentdbDashServerLibStrings.Delete = js.native
  /**
  	 * Gets a specified request header value.
  	 * @param key the name of the header to retrieve
  	 */
  def getValue(key: java.lang.String): java.lang.String = js.native
  /**
  	 * Sets the request body.
  	 * Note: this can be only used in a pre-trigger to overwrite the existing request body.
  	 * The overwritten request body will then be used in the operation associated with this pre-trigger.
  	 * @param value the value to set in the request body
  	 */
  def setBody(value: java.lang.String): scala.Unit = js.native
  def setBody(value: js.Object): scala.Unit = js.native
  /**
  	 * Sets a specified request header value.
  	 * Note: this method cannot be used to create new headers.
  	 * @param key the name of the header
  	 * @param value the value of the header
  	 */
  def setValue(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

