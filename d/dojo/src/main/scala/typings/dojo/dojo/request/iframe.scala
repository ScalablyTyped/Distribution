package typings.dojo.dojo.request

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/iframe.html
  *
  * Sends a request using an iframe element with the given URL and options.
  *
  * @param url URL to request
  * @param options       OptionalOptions for the request.
  */
@js.native
trait iframe extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: typings.dojo.dojo.request.iframe.__Options): Unit = js.native
  /**
    *
    * @param name
    * @param onloadstr
    * @param uri
    */
  def create(name: js.Any, onloadstr: js.Any, uri: js.Any): js.Any = js.native
  /**
    *
    * @param iframeNode
    */
  def doc(iframeNode: js.Any): js.Any = js.native
  /**
    * Send an HTTP GET request using an iframe element with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): __Promise = js.native
  def get(url: String, options: typings.dojo.dojo.request.iframe.__BaseOptions): __Promise = js.native
  /**
    * Send an HTTP POST request using an iframe element with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def post(url: String): __Promise = js.native
  def post(url: String, options: typings.dojo.dojo.request.iframe.__BaseOptions): __Promise = js.native
  /**
    *
    * @param _iframe
    * @param src
    * @param replace
    */
  def setSrc(_iframe: js.Any, src: js.Any, replace: js.Any): Unit = js.native
}

@JSGlobal("dojo.request.iframe")
@js.native
object iframe extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/iframe.__BaseOptions.html
    *
    *
    */
  @js.native
  class __BaseOptions () extends js.Object {
    /**
      * Data to transfer. When making a GET request, this will
      * be converted to key=value parameters and appended to the
      * URL.
      *
      */
    var data: String = js.native
    /**
      * A form node to use to submit data to the server.
      *
      */
    var form: HTMLElement = js.native
    /**
      * How to handle the response from the server.  Default is
      * 'text'.  Other values are 'json', 'javascript', and 'xml'.
      *
      */
    var handleAs: String = js.native
    /**
      * Whether to append a cache-busting parameter to the URL.
      *
      */
    var preventCache: Boolean = js.native
    /**
      * Query parameters to append to the URL.
      *
      */
    var query: String = js.native
    /**
      * Milliseconds to wait for the response.  If this time
      * passes, the then the promise is rejected.
      *
      */
    var timeout: Double = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/iframe.__MethodOptions.html
    *
    *
    */
  @js.native
  class __MethodOptions () extends js.Object {
    /**
      * The HTTP method to use to make the request. Must be
      * uppercase. Only "GET" and "POST" are accepted.
      * Default is "POST".
      *
      */
    var method: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/iframe.__Options.html
    *
    *
    */
  @js.native
  class __Options () extends js.Object {
    /**
      * Data to transfer. When making a GET request, this will
      * be converted to key=value parameters and appended to the
      * URL.
      *
      */
    var data: String = js.native
    /**
      * A form node to use to submit data to the server.
      *
      */
    var form: HTMLElement = js.native
    /**
      * How to handle the response from the server.  Default is
      * 'text'.  Other values are 'json', 'javascript', and 'xml'.
      *
      */
    var handleAs: String = js.native
    /**
      * The HTTP method to use to make the request. Must be
      * uppercase. Only "GET" and "POST" are accepted.
      * Default is "POST".
      *
      */
    var method: String = js.native
    /**
      * Whether to append a cache-busting parameter to the URL.
      *
      */
    var preventCache: Boolean = js.native
    /**
      * Query parameters to append to the URL.
      *
      */
    var query: String = js.native
    /**
      * Milliseconds to wait for the response.  If this time
      * passes, the then the promise is rejected.
      *
      */
    var timeout: Double = js.native
  }
  
}

