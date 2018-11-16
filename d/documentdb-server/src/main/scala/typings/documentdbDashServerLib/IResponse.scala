package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The Response object represents the response message that will be sent from the server in response to the requested operation. This includes information about the HTTP headers and body of the response from the server.
 * The Response object is not present in pre-triggers because they are run before the response is generated.
 * For post-triggers, the response represents the operation that was executed before the trigger. For example, if the post-trigger is being run ("triggered") after the creation of a document, then
 * the response body contains the JSON body of the document that was created. This can be accessed through the response object and (as JSON) can be natively consumed in JavaScript.
 * For stored procedures, the response can be manipulated to send output back to the client-side.
 * Note: this object not available in pre-triggers
 */
@js.native
trait IResponse extends js.Object {
  def appendBody(value: java.lang.String): scala.Unit = js.native
  def appendBody(value: js.Object): scala.Unit = js.native
  /**
  	 * Gets the response body.
  	 */
  def getBody(): js.Object = js.native
  @JSName("getBody")
  def getBody_TT[T](): T = js.native
  /**
  	 * Gets a maximum quota allowed for the resource associated with a post-trigger
  	 * Note: this method is only available in post-triggers
  	 */
  def getMaxResourceQuota(): java.lang.String = js.native
  /**
  	 * Gets a current quota usage for the resource associated with a post-trigger
  	 * Note: this method is only available in post-triggers
  	 */
  def getResourceQuotaCurrentUsage(): java.lang.String = js.native
  /**
  	 * Gets a specified response header value.
  	 * @param key the name of the header to retrieve
  	 */
  def getValue(key: java.lang.String): java.lang.String = js.native
  /**
  	 * Sets a specified response header value.
  	 * Note: this method cannot be used to create new headers.
  	 * @param key the name of the header
  	 * @param value the value of the header
  	 */
  def getValue(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
  	 * Sets the response body.
  	 * Note: This cannot be done in pre-triggers.
  	 * In post-triggers, the response body is already set with the requested resource and will be overwritten with this call.
  	 * In stored procedures, this call can be used to set the response message body as output to the calling client.
  	 */
  def setBody(value: java.lang.String): scala.Unit = js.native
  def setBody(value: js.Object): scala.Unit = js.native
}

