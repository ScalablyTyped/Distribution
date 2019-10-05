package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/script.html
  *
  * Sends a request using a script element with the given URL and options.
  *
  * @param url URL to request
  * @param options       OptionalOptions for the request.
  */
@js.native
trait script extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: typings.dojo.dojo.request.script.__Options): Unit = js.native
  /**
    * Send an HTTP GET request using a script element with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): __Promise = js.native
  def get(url: String, options: typings.dojo.dojo.request.script.__BaseOptions): __Promise = js.native
}

@JSGlobal("dojo.request.script")
@js.native
object script extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/script.__BaseOptions.html
    *
    *
    */
  @js.native
  class __BaseOptions () extends js.Object {
    /**
      * A string of JavaScript that when evaluated like so:
      * "typeof(" + checkString + ") != 'undefined'"
      * being true means that the script fetched has been loaded.
      * Do not use this if doing a JSONP type of call (use jsonp instead).
      *
      */
    var checkString: String = js.native
    /**
      * Data to transfer.  This is ignored for GET and DELETE
      * requests.
      *
      */
    var data: String = js.native
    /**
      * The Document object of a child iframe. If this is passed in, the script
      * will be attached to that document. This can be helpful in some comet long-polling
      * scenarios with Firefox and Opera.
      *
      */
    var frameDoc: js.Object = js.native
    /**
      * How to handle the response from the server.  Default is
      * 'text'.  Other values are 'json', 'javascript', and 'xml'.
      *
      */
    var handleAs: String = js.native
    /**
      * The URL parameter name that indicates the JSONP callback string.
      * For instance, when using Yahoo JSONP calls it is normally,
      * jsonp: "callback". For AOL JSONP calls it is normally
      * jsonp: "c".
      *
      */
    var jsonp: String = js.native
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
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/script.__MethodOptions.html
    *
    *
    */
  @js.native
  class __MethodOptions () extends js.Object {
    /**
      * This option is ignored. All requests using this transport are
      * GET requests.
      *
      */
    var method: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/script.__Options.html
    *
    *
    */
  @js.native
  class __Options () extends js.Object {
    /**
      * A string of JavaScript that when evaluated like so:
      * "typeof(" + checkString + ") != 'undefined'"
      * being true means that the script fetched has been loaded.
      * Do not use this if doing a JSONP type of call (use jsonp instead).
      *
      */
    var checkString: String = js.native
    /**dojo
      * Data to transfer.  This is ignored for GET and DELETE
      * requests.
      *
      */
    var data: String = js.native
    /**
      * The Document object of a child iframe. If this is passed in, the script
      * will be attached to that document. This can be helpful in some comet long-polling
      * scenarios with Firefox and Opera.
      *
      */
    var frameDoc: js.Object = js.native
    /**
      * How to handle the response from the server.  Default is
      * 'text'.  Other values are 'json', 'javascript', and 'xml'.
      *
      */
    var handleAs: String = js.native
    /**
      * The URL parameter name that indicates the JSONP callback string.
      * For instance, when using Yahoo JSONP calls it is normally,
      * jsonp: "callback". For AOL JSONP calls it is normally
      * jsonp: "c".
      *
      */
    var jsonp: String = js.native
    /**
      * This option is ignored. All requests using this transport are
      * GET requests.
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

