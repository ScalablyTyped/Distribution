package typings.dojo.dojo.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/io/script.html
  *
  * TODOC
  *
  */
trait script extends js.Object {
  /**
    * creates a new <script> tag pointing to the specified URL and
    * adds it to the document.
    * Attaches the script element to the DOM. Use this method if you
    * just want to attach a script to the DOM and do not care when or
    * if it loads.
    *
    * @param id
    * @param url
    * @param frameDocument
    */
  def attach(id: js.Any, url: js.Any, frameDocument: js.Any): Unit
  /**
    * sends a get request using a dynamically created script tag.
    *
    * @param args An object with the following properties:callbackParamName (String): Deprecated as of Dojo 1.4 in favor of "jsonp", but still supported forlegacy code. See notes for jsonp property.jsonp (String): The URL parameter name that indicates the JSONP callback string.For instance, when using Yahoo JSONP calls it is normally,jsonp: "callback". For AOL JSONP calls it is normallyjsonp: "c".checkString (String): A string of JavaScript that when evaluated like so:"typeof(" + checkString + ") != 'undefined'"being true means that the script fetched has been loaded.Do not use this if doing a JSONP type of call (use callbackParamName instead).frameDoc (Document): The Document object for a child iframe. If this is passed in, the scriptwill be attached to that document. This can be helpful in some comet long-pollingscenarios with Firefox and Opera.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.handleAs (String, optional): Acceptable values depend on the type of IOtransport (see specific IO calls for more information).rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def get(args: js.Object): js.Any
  /**
    * removes the script element with the given id, from the given frameDocument.
    * If no frameDocument is passed, the current document is used.
    *
    * @param id
    * @param frameDocument
    */
  def remove(id: js.Any, frameDocument: js.Any): Unit
}

object script {
  @scala.inline
  def apply(
    attach: (js.Any, js.Any, js.Any) => Unit,
    get: js.Object => js.Any,
    remove: (js.Any, js.Any) => Unit
  ): script = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[script]
  }
}

