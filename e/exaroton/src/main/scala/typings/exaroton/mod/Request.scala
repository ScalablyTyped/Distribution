package typings.exaroton.mod

import typings.formData.mod.^
import typings.node.streamWebMod.ReadableStream
import typings.node.streamWebMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exaroton", "Request")
@js.native
open class Request () extends StObject {
  
  /**
    * Create a response object for this request
    *
    * @param body
    */
  def createResponse(): Response = js.native
  def createResponse(body: String): Response = js.native
  def createResponse(body: js.Object): Response = js.native
  
  /**
    * Post body data
    */
  val data: Null | js.Object | String = js.native
  
  /**
    * Endpoint URL, without base, version or starting /
    */
  val endpoint: String = js.native
  
  def expectsJsonResponse(): Boolean = js.native
  
  /**
    * Get body for request
    */
  def getBody(): ^ | String | ReadableStream[Any] = js.native
  
  /**
    * Get endpoint with replaced parameters
    */
  def getEndpoint(): String = js.native
  
  def getInputStream(): WritableStream[Any] | Null = js.native
  
  def getOutputStream(): WritableStream[Any] | Null = js.native
  
  /**
    * Check if the request has a body
    */
  def hasBody(): Boolean = js.native
  
  def hasInputStream(): Boolean = js.native
  
  def hasOutputStream(): Boolean = js.native
  
  /**
    * HTTP request headers
    */
  val headers: js.Object = js.native
  
  /**
    * Optional path to read the request body from
    */
  var inputPath: js.UndefOr[String] = js.native
  
  /**
    * Optional stream to read the request body from
    */
  var inputStream: js.UndefOr[ReadableStream[Any] | Null] = js.native
  
  /**
    * Request method, e.g. "GET" or "POST"
    */
  val method: Method = js.native
  
  /**
    * Optional path to write the response body to
    */
  var outputPath: js.UndefOr[String] = js.native
  
  /**
    * Optional stream tonstream the response body to
    */
  var outputStream: js.UndefOr[WritableStream[Any] | Null] = js.native
  
  /**
    * URL parameters, which are replaced in the endpoint string
    */
  val parameters: js.Object = js.native
  
  /**
    * Response class used to create/parse responses to this request
    */
  val responseClass: Response = js.native
  
  /**
    * Response type (text|json|buffer)
    *
    * @see https://github.com/sindresorhus/got/blob/main/documentation/2-options.md#responsetype
    */
  val responseType: ResponseType = js.native
  
  /**
    * Set the data to put as string
    */
  def setData(data: String): Request = js.native
  def setData(data: js.Object): Request = js.native
  
  /**
    *
    * @param key
    * @param value
    */
  def setHeader(key: String, value: String): Unit = js.native
  
  /**
    * Set a file as input file for the request body
    *
    * @param inputPath
    */
  def setInputPath(inputPath: String): Request = js.native
  
  /**
    * Set a stream as input stream for request body
    *
    * @param inputStream
    */
  def setInputStream(inputStream: ReadableStream[Any]): Request = js.native
  
  /**
    * Set a file as output file for the response body
    *
    * @param outputPath
    */
  def setOutputPath(outputPath: String): Request = js.native
  
  /**
    * Set a stream as output stream for the request body
    *
    * @param outputStream
    */
  def setOutputStream(outputStream: WritableStream[Any]): Request = js.native
  
  /**
    * Set a URL parameter
    *
    * URL parameters replace {key} variables in the endpoint URL
    *
    * @param key
    * @param value
    */
  def setParameter(key: String, value: String): Unit = js.native
}
