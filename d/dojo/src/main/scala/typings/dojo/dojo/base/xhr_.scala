package typings.dojo.dojo.base

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/xhr.html
  *
  * Deprecated.   Use dojo/request instead.
  * Sends an HTTP request with the given method.
  * See also dojo.xhrGet(), xhrPost(), xhrPut() and dojo.xhrDelete() for shortcuts
  * for those HTTP methods. There are also methods for "raw" PUT and POST methods
  * via dojo.rawXhrPut() and dojo.rawXhrPost() respectively.
  *
  * @param method HTTP method to be used, such as GET, POST, PUT, DELETE. Should be uppercase.
  * @param args
  * @param hasBody       OptionalIf the request has an HTTP body, then pass true for hasBody.
  */
@js.native
trait xhr_ extends js.Object {
  /**
    * A map of available XHR transport handle types. Name matches the
    * handleAs attribute passed to XHR calls.
    *
    */
  var contentHandlers: js.Object = js.native
  def apply(method: String, args: js.Object): Unit = js.native
  def apply(method: String, args: js.Object, hasBody: Boolean): Unit = js.native
  /**
    * Sends an HTTP DELETE request to the server.
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def del(args: js.Object): js.Any = js.native
  /**
    * Serialize a form field to a JavaScript object.
    * Returns the value encoded in a form field as
    * as a string or an array of strings. Disabled form elements
    * and unchecked radio and checkboxes are skipped. Multi-select
    * elements are returned as an array of string values.
    *
    * @param inputNode
    */
  def fieldToObject(inputNode: String): js.Any = js.native
  /**
    * Serialize a form field to a JavaScript object.
    * Returns the value encoded in a form field as
    * as a string or an array of strings. Disabled form elements
    * and unchecked radio and checkboxes are skipped. Multi-select
    * elements are returned as an array of string values.
    *
    * @param inputNode
    */
  def fieldToObject(inputNode: HTMLElement): js.Any = js.native
  /**
    * Create a serialized JSON string from a form node or string
    * ID identifying the form to serialize
    *
    * @param formNode
    * @param prettyPrint               Optional
    */
  def formToJson(formNode: String): js.Any = js.native
  def formToJson(formNode: String, prettyPrint: Boolean): js.Any = js.native
  /**
    * Create a serialized JSON string from a form node or string
    * ID identifying the form to serialize
    *
    * @param formNode
    * @param prettyPrint               Optional
    */
  def formToJson(formNode: HTMLElement): js.Any = js.native
  def formToJson(formNode: HTMLElement, prettyPrint: Boolean): js.Any = js.native
  /**
    * Serialize a form node to a JavaScript object.
    * Returns the values encoded in an HTML form as
    * string properties in an object which it then returns. Disabled form
    * elements, buttons, and other non-value form elements are skipped.
    * Multi-select elements are returned as an array of string values.
    *
    * @param formNode
    */
  def formToObject(formNode: String): js.Object = js.native
  /**
    * Serialize a form node to a JavaScript object.
    * Returns the values encoded in an HTML form as
    * string properties in an object which it then returns. Disabled form
    * elements, buttons, and other non-value form elements are skipped.
    * Multi-select elements are returned as an array of string values.
    *
    * @param formNode
    */
  def formToObject(formNode: HTMLElement): js.Object = js.native
  /**
    * Returns a URL-encoded string representing the form passed as either a
    * node or string ID identifying the form to serialize
    *
    * @param formNode
    */
  def formToQuery(formNode: String): js.Any = js.native
  /**
    * Returns a URL-encoded string representing the form passed as either a
    * node or string ID identifying the form to serialize
    *
    * @param formNode
    */
  def formToQuery(formNode: HTMLElement): js.Any = js.native
  /**
    * Sends an HTTP GET request to the server.
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def get(args: js.Object): js.Any = js.native
  /**
    * takes a name/value mapping object and returns a string representing
    * a URL-encoded version of that object.
    *
    * @param map
    */
  def objectToQuery(map: js.Object): js.Any = js.native
  /**
    * Sends an HTTP POST request to the server. In addition to the properties
    * listed for the dojo.__XhrArgs type, the following property is allowed:
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def post(args: js.Object): js.Any = js.native
  /**
    * Sends an HTTP PUT request to the server. In addition to the properties
    * listed for the dojo.__XhrArgs type, the following property is allowed:
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def put(args: js.Object): js.Any = js.native
  /**
    * Create an object representing a de-serialized query section of a
    * URL. Query keys with multiple values are returned in an array.
    *
    * @param str
    */
  def queryToObject(str: String): js.Object = js.native
}

